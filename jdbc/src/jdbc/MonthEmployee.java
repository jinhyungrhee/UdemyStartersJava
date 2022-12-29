package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

//PreparedStatement 사용

/* 키보드로 입력
 * 제외할 월 : 3
 * 01-12 사이 값 입력시 월별 입사자 총급여 조회
 * 입사월 급여 총합
 * 01   xxxx 
 * 02   xxxx
 * 04   xxxx
 * 
 * ...
 * 
 * 12   xxxx
 * 
 * */

public class MonthEmployee {
	
	Connection con = null;
	ResultSet rs = null;

	ArrayList<String> getEmployees() /*필요하면 예외처리 추가*/ {
		
		ArrayList<String> result = new ArrayList<>();
		
		try {
			// 0. JDBC DRIVER 호출 - jdk비포함
			Class.forName(ConnectionInform.DRIVER_CLASS);
			// 1. DB 연결
			con = DriverManager.getConnection
					(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			System.out.println(con.getAutoCommit());
			
			Scanner key = new Scanner(System.in);
			System.out.print("제외할 월 : ");
			int month = key.nextInt();
			
			String sql = 
					"select substr(hire_date, 6, 2), sum(salary)"
					+ " from employees"
					+ " where month(hire_date)!=" + month 
					+ " group by month(hire_date)";
					// having month(hire_date) -> 집계함수가 아니라서 에러 발생
			 
			PreparedStatement pt = con.prepareStatement(sql);
			rs = pt.executeQuery();
			while(rs.next()) {
				String hire_date = rs.getString("substr(hire_date, 6, 2)");
				int salary = rs.getInt("sum(salary)");
				//System.out.printf("날짜 : %s, 월급 : %d \n", hire_date, salary);
				
				String temp = hire_date + "     " + salary;
				result.add(temp);
				
			}
			
			System.out.println("연결 해제 성공");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
			} catch(SQLException e) {}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		
	
		
		ArrayList<String> result = new MonthEmployee().getEmployees();
		
		for (String res : result) {
			System.out.println(res);
		}
		

		
		
		
		
	}

}
