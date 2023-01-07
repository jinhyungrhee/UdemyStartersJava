package answer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest2 {
	
	public static void main(String[] args) {
		Connection con = null;
		Statement st= null;
		ResultSet rs = null;
		try {
		//0. jdbc driver 호출-jdk비포함
		Class.forName(ConnectionInform.DRIVER_CLASS);
		//1.db 연결
		con = DriverManager.getConnection
		(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
		System.out.println("연결 성공");
		System.out.println(con.getAutoCommit());
		
		st = con.createStatement();//sql저장-전송객체
		
	/*	Scanner key= new Scanner(System.in);
		System.out.print("상품명 : ");
		String p_name  = key.nextLine();
		System.out.print("가격 : ");
		int price  = key.nextInt();
		System.out.print("수량 : ");
		int balance  = key.nextInt();*/
		//product 테이블에서 가격 1000000 이상 레코드만 조회
		//String sql= 
		//"select * from product where price >= 1000000";//?레코드*4컬럼
		
		String sql = "select user_id, address from users where address like '%용산구%'";
		// users 테이블에서 용산구 주소를 가진 사용자 아이디, 주소 조회
		
		rs = st.executeQuery(sql);
		int line= 0;
		while(rs.next()) {
			++line;
			//int id = rs.getInt("p_code");
			//String name = rs.getString("p_name");
			//double price = rs.getDouble("price");
			//int balance = rs.getInt("balance");
			//System.out.printf
			//("%d 코드:%d 이름:%s 가격:%.2f 수량:%d \n", line , id, name, price, balance);
			String user_id = rs.getString("user_id");
			String address = rs.getString("address");
			System.out.printf
			("%d 아이디:%s 주소:%s \n", line , user_id, address);
		}
		//con.close();
		System.out.println("연결 해제 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다.");//?????
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			rs.close();	
			st.close();	
			con.close();//throws 	SQLEXCRPTION
			}catch(SQLException e) {}
		}

	}

}
