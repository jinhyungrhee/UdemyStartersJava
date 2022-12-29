package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest2 {
	

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			
			// 0. jdbc driver 호출 -- jdk 비포함
			Class.forName(ConnectionInform.DRIVER_CLASS);
			// 1. db 연결
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			 
			System.out.println(con.getAutoCommit()); // TRUE
			

			st = con.createStatement(); // sql저장 - 전송객체
			
			// 테이블 하나 생성 - 데이터 하나도 없음!
			/*
			String sql = "create table maxtest(a int)";
			int rowcount = st.executeUpdate(sql);
			System.out.println(rowcount);
			*/
		
//			String sql = "select max(a) from maxtest";
//			rs = st.executeQuery(sql); // rs 이전 위치
			
			String sql = "select user_id, address from users where addresss like ?";
			PreparedStatement pt = con.prepareStatement(sql); // 미리 sql 전송 (java에서 따로 분리)
			pt.setString(1,  "%" + "용산구" + "%"); // 필요에 따라 setter 메서드를 통해 결합
			rs=pt.executeQuery(sql); // 실행
			
			int line=0;
			while(rs.next()) {
				++line;
				String user_id = rs.getString("user_id");
				String address = rs.getString("address");
				System.out.printf("%d 아이디 : %s 주소 : %s \n", line, user_id, address);
				
			}
			
			// [1]여러개 데이터 조회할 때 : while()문 사용
			//while(rs.next()) { // next() 메서드 호출할 때, 첫번째 위치로 이동
			//	System.out.println(rs.getInt("a"));
			//}
			
			// [2]단 한개만 읽기?

//			rs.next(); // 실행 false
//			//java.sql.SQLDataException: wrong row position
//			System.out.println(rs.getString("max(a)"));  // null이라는 키워드를 읽어와야 하므로 String
//			
//			if(rs.getString("max(a)") != null){
//				System.out.println("최대값=" + rs.getString("max(a)"));
//			} else {
//				System.out.println("최대값=0");
//			}
			
			/*
			// [3]반복은 아니지만 데이터가 존재하는지 여부만 파악하기
			if(rs.next()) {
				System.out.println(rs.getInt("a"));
			} else {
				System.out.println("저장부터 하세요");
			}
			*/
			
			System.out.println("연결 해제 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다"); // ?????
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// connection 객체 종료
			try {
			
			//rs.close();
			st.close();
			con.close(); // throws SQLEXCEPTION		
			} catch(SQLException e) {}
				
		}
		
	}

}
