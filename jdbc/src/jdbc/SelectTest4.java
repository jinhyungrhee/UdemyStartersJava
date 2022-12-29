package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest4 {
	

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
			
			// jdbc sql - create table 
			
			String sql = "SHOW DATABASES";
			sql = "show tables";
			sql = "describe employees";
			
			rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString(1));
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
