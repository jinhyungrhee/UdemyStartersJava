package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	

	public static void main(String[] args) {
		Connection con = null;
		try {
			
			// 0. jdbc driver 호출 -- jdk 비포함
			Class.forName(ConnectionInform.DRIVER_CLASS);
			// 1. db 연결
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			
			// sql 전송 결과 검색 - SELEC * FROM EMP 예외발생 - 중단 -> close() 못함(finally)
			
			System.out.println("연결 해제 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다"); // ?????
		} catch (SQLException e) {
			System.out.println("연결 정보를 확인하세요");
		} finally {
			// connection 객체 종료
			try {
			con.close(); // throws SQLEXCEPTION		
			} catch(SQLException e) {}
				
		}
		
	}

}
