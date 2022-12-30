package answer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MonthEmployeeAnswer {
	
	ArrayList getEmployees() throws ClassNotFoundException, SQLException  {
		ArrayList<String> list = new ArrayList<>(10);
		// 키보드 월 입력 
		Scanner key = new Scanner(System.in);
		System.out.println("제외할 월 : ");
		int inputMonth = key.nextInt();
		// sql
//		 select substr(hire_date, 6, 2) 입사월, sum(salary) 급여총합
//		 from employees
//		 where date_format(hire_date, '%m') != ?
		// [방법1] group by date_format(hire_date, "%c")
		// [방법2] group by month(hire_date)
		String sql = " select substr(hire_date, 6, 2) 입사월, sum(salary) 급여총합"
				+ "	from employees\r\n"
				+ "	where date_format(hire_date, '%m') != ?"
				+ " group by month(hire_date)"
				+ " order by 입사월";
		
		// jdbc 전송 결과
		Class.forName(ConnectionInform.DRIVER_CLASS);
		Connection con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
		
		PreparedStatement pt = con.prepareStatement(sql); // DB에 전송되어 컴파일된 상태 (실행되기만 기다림)
		pt.setInt(1, inputMonth);
		ResultSet rs = pt.executeQuery();	
		
		while(rs.next()) {
			int outputMonth = rs.getInt("입사월");
			double sum = rs.getDouble("급여총합");
			list.add(outputMonth + "\t" + sum);
		}
		
		rs.close();
		pt.close();
		con.close();
		return list;
	
	}

	public static void main(String[] args) {
		
		try {
			
			ArrayList<String> list = new MonthEmployeeAnswer().getEmployees();
			
			System.out.println("입사월\t급여총합");
			for (String o : list) {
				System.out.println(o);
			}
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
	}

}
