package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {
	

	public static void main(String[] args) {
		Connection con = null;
		try {
			
			// 0. jdbc driver 호출 -- jdk 비포함
			Class.forName(ConnectionInform.DRIVER_CLASS);
			// 1. db 연결
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			 
			System.out.println(con.getAutoCommit()); // TRUE
			
			// emp_copy -> 100 길동 홍 1000 now() 50
			//String sql = "insert into emp_copy values(400, '길동', '홍', 1000, now(), 50);";
			
			//결과보기
			//select length('가')
			
			Scanner key = new Scanner(System.in);
			
			System.out.println("수정 이름 : ");
			String name = key.nextLine();
			
			System.out.println("수정 월급 : ");
			int salary = key.nextInt();
			
			System.out.println("수정 사번 : ");
			int employee_id = key.nextInt();

			// 100 최신입 10000 3가지 입력 
			// emp_copy 테이블에서 사번 100 사원의 이름 : 신입(나머지), 성 : 최(1글자) 현재 급여 10000 인상
			// update 테이블명 SET 변경컬럼명=변경값 where 변경조건식
			
			/*
			String sql = "insert into product(p_name, price, balance)"
					+ "values('" + p_name + "',"  + price + "," + balance + ")";
			int rowcount = st.executeUpdate(sql); // insert한 행의 개수 리턴
			System.out.println("삽입 행의 개수 = " + rowcount);
			*/
			
			/*(
			Statement st = con.createStatement(); // sql저장 - 전송객
			String sql = "insert into product(p_name, price, balance) values(?, ?, ?)";
			PreparedStatement pt = con.prepareStatement(sql); // sql 저장 - 전송 - 컴파일 - 저장
			pt.setString(1, p_name);
			pt.setInt(2, price);
			pt.setInt(3, balance);

			int rowcount = pt.executeUpdate();
			
			System.out.println("삽입 행의 개수 = " + rowcount);
			*/
			
			String first_name = name.substring(1);
			String last_name = name.substring(0, 1);
			
			String sql = 
					"UPDATE EMP_COPY SET FIRST_NAME = ?, LAST_NAME=?, SALARY=salary + ? "
					+ " where employee_id=?";
			
			PreparedStatement pt = con.prepareStatement(sql); // sql 저장 - 전송객체
			
			pt.setString(1, first_name);
			pt.setString(2, last_name);
			pt.setDouble(3, salary);
			pt.setInt(4, employee_id);
			int rowcount = pt.executeUpdate();
			System.out.println("수정 행의 개수 = " + rowcount);
			

			System.out.println("연결 해제 성공");
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("해당 드라이버가 발견되지 않습니다"); // ?????
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// connection 객체 종료
			try {
			con.close(); // throws SQLEXCEPTION		
			} catch(SQLException e) {}
				
		}
		
	}

}
