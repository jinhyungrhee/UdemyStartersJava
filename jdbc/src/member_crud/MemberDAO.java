package member_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import jdbc.ConnectionInform;

public class MemberDAO {
	
	// dto에 전달받은 내용을 가져와 member 테이블에 입력
	// 단, 회원가입일에 대한 정보는 없으므로 현재시간(now())을 넣어줌
	int insertMember(MemberDTO dto) {
		
		// 1. Statment 사용
		
		/*
		String id = "'" + dto.id + "'";
		String pw = "'" + dto.pw + "'";
		String name = "'" + dto.name + "'";
		String phone = "'" + dto.phone + "'";
		String email = "'" + dto.email + "'";
		String address = "'" + dto.address + "'";
		
		int count = 0;
		Connection con = null;
		try {
			// statment 사용
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			
			String sql = "insert member values(" + id + ", " + pw + ", " + name 
					+ ", " + phone + ", " + email + ", " + address + ", now());";
			
			Statement st = con.createStatement();
			count = st.executeUpdate(sql);
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다");
		} catch (SQLException e) {
			System.out.println("연결 정보를 확인하세요");
		} finally {
			try {
			con.close();
			} catch(SQLException e) {}
				
		}
		return count;
		*/
		
		
		// 2. PrepareStatment 사용
		
		Connection con = null;
		PreparedStatement pt = null;
		int count = 0;
		
		MemberDTO selectedDto = getMember(dto.getId(), dto.getPw()); // 연결-해제 (try밖에 있어도 OK)
		

		// id 중복체크
		/*
		 * MemberDTO dto = getMember(id, pw);
		 * dto == null : insert 가능
		 * dto != null  : ID 중복 (insert 불가능)
		 * */
		if(selectedDto == null) {
		
			try {
				
				Class.forName(ConnectionInform.DRIVER_CLASS);
				con = DriverManager.getConnection
				(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
				
					
					String sql = "insert member values(?, ?, ?, ?, ? , ? , now())";
					
					pt = con.prepareStatement(sql);
					pt.setString(1, dto.getId());
					pt.setString(2, dto.getPw());
					pt.setString(3, dto.getName());
					pt.setString(4, dto.getPhone());
					pt.setString(5, dto.getEmail());
					pt.setString(6, dto.getAddress());
					
					count = pt.executeUpdate();
				
				
			} catch (ClassNotFoundException e) {
				System.out.println("해당 드라이버가 발견되지 않습니다");
			} catch (SQLException e) {
				System.out.println("연결 정보를 확인하세요");
			} finally {
				try {
				pt.close();
				con.close();
				} catch(SQLException e) {}
					
			}
			
			return count;
			
		}
		else {
			System.out.println("이미 존재하는 아이디입니다.");
			return count;
		}
		
	} // end of insertMember

	
	int getTotalMember() { // 전체 멤버 수 리턴
		
		Connection con = null;
		PreparedStatement pt = null;
		int count = 0;
		
		try {
			
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			
			String sql = "select count(*) from member"; // 1행 1열 -> null / 숫자
			pt = con.prepareStatement(sql);
			ResultSet rs = pt.executeQuery();
			
			rs.next();  // 1개 행 리턴
			if (rs.getString("count(*)") == null) {
				count = 0;
			}
			else {
				count = rs.getInt("count(*)");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다");
		} catch (SQLException e) {
			System.out.println("연결 정보를 확인하세요");
		} finally {
			try {
				pt.close();
				con.close();
			} catch(SQLException e) {}
		}
		return count;
	}
	
	ArrayList<MemberDTO> getMemberList(int currentPage, int memberPerPage) {
		
		Connection con = null;
		PreparedStatement pt = null;
		ResultSet rs = null;
		ArrayList<MemberDTO> list = new ArrayList<>();
		
		// currPage : 1 ->  range : (currPage - 1)*3 + 1 ~ (currPage - 1)*3 + 3		
		try {
			
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			
			String sql = "select id, insert(pw, 2, char_length(pw)-1, repeat('*', char_length(pw)-1)) as pw,"
					+ " name, indate from member";
			// **또 다른 방법**
			//String sql = "select id, name from member order by indate limit ?, ?";

			pt = con.prepareStatement(sql);
			// **또 다른 방법**
			//pt.setInt(1, (currentPage - 1) * memberPerPage);
			//pt.setInt(2, memberPerPage);
			
			rs = pt.executeQuery();
			
			int range = (currentPage - 1) * memberPerPage;
			while(rs.next()) {
				
				if (rs.getRow() >= range+1 && rs.getRow() <= range+memberPerPage) {
					MemberDTO dto = new MemberDTO(rs.getString("id"), rs.getString("name"), rs.getString("indate"));
					dto.setPw(rs.getString("pw"));
					list.add(dto);
				}
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다");
		} catch (SQLException e) {
			System.out.println("연결 정보를 확인하세요");
		} finally {
			try {
				pt.close();
				con.close();
			} catch(SQLException e) {}
		}
		return list;		
	}
	
	
	MemberDTO getMember(String id, String pw) {
		
		Connection con = null;
		PreparedStatement pt = null;
		MemberDTO dto = null;
		
		try {
			
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			
			String sql = "select * from member where id=?;";
			
			// rs.next() true
			
			pt = con.prepareStatement(sql);
			pt.setString(1, id);
			ResultSet rs = pt.executeQuery();
			if(rs.next()) { // 아이디가 있는 경우
				String dbpw = rs.getString("pw");
				if(pw.equals(dbpw)) { // 암호가 일치하는 경우
					dto = new MemberDTO(rs.getString("id"), rs.getString("pw"), rs.getString("name"),
							rs.getString("email"), rs.getString("phone"), 
							rs.getString("address"), rs.getString("indate"));
				}
				else { // 암호가 불일치하는 경우
					dto = new MemberDTO();
					dto.setId(rs.getString("id"));
					System.out.println("암호가 맞지 않습니다. 4번 다시 입력하세요.");
				}
			}
			else { // 아이디가 없는 경우
				System.out.println("1번 회원가입부터 하세요");
			}
	
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다");
		} catch (SQLException e) {
			System.out.println("연결 정보를 확인하세요");
		} finally {
			try {
				pt.close();
				con.close();
			} catch(SQLException e) {}
		}
		return dto;		
	}
	
}
