package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {
	

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
			Statement st = con.createStatement(); // sql저장 - 전송객체
			//String sql = "insert into emp_copy values(400, '길동', '홍', 1000, now(), 50);";
			
			//결과보기
			//select length('가')
			
			Scanner key = new Scanner(System.in);
			
			System.out.println("상품명 : ");
			String p_name = key.nextLine();
			
			System.out.println("가격 : ");
			int price = key.nextInt();
			
			System.out.println("상품명 : ");
			int balance = key.nextInt();
			
			// p_name은 string 처리 필요!
			String sql = "insert into product(p_name, price, balance)"
					+ "values('" + p_name + "',"  + price + "," + balance + ")";
			int rowcount = st.executeUpdate(sql); // insert한 행의 개수 리턴
			System.out.println("삽입 행의 개수 = " + rowcount);

			
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
