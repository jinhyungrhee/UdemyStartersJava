package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest3 {
	

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
			
			/*
			System.out.println("상품명 : ");
			String p_name = key.nextLine();
			
			System.out.println("가격 : ");
			int price = key.nextInt();
			
			System.out.println("상품명 : ");
			int balance = key.nextInt();
			*/
		
			/*
			String sql = "select * from employees"; // 107r * 11c
			ResultSet rs = st.executeQuery(sql); // ResultSet : 행과 열의 2차원 테이블 구조
			System.out.println("조회 행열의 결과 = " + rs); // rs.toString()
			*/
			
			//String sql = "select * from product where price >= 1000000"; // ?레코드*4컬럼
			
			//rs = st.executeQuery(sql);
			//System.out.println("삽입행의 개수 = " + rs);
			//int line=0;
			//while(rs.next()) {
			//	++line;
			//	int id = rs.getInt("p_code");
			//	String name =rs.getString("p_name");
			//	double price = rs.getDouble("price");
			//	int balance = rs.getInt("balance"); // Date()로 읽으면 '연도-월-일'만 존재
			//	System.out.printf("[%d] 코드:%d 이름:%s 가격:%.2f 수량:%d \n", line, id, name, price, balance);
			//}
			
			String sql = "select user_id, address from users where address like '%용산구%'";
	
			rs = st.executeQuery(sql);
			System.out.println("삽입행의 개수 = " + rs);
			int line=0;
			while(rs.next()) {
				++line;
				String user_id =rs.getString("user_id");
				String address = rs.getString("address");
				System.out.printf
				("%d 아이디 : %s 주소 : %s \n", line, user_id, address);
			}
			
			System.out.println("연결 해제 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다"); // ?????
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// connection 객체 종료
			try {
			
			rs.close();
			st.close();
			con.close(); // throws SQLEXCEPTION		
			} catch(SQLException e) {}
				
		}
		
	}

}
