package member_crud;

import java.util.ArrayList;
import java.util.Scanner;

public class OneSelectView implements View {

	private MemberDTO dto;
	
	public MemberDTO getDto() {
		return dto;
	}

	@Override
	public void input() {
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String id = key.next();
		
		System.out.print("암호 입력 : ");
		String pw = key.next();
		
		MemberDAO dao = new MemberDAO();
		// 이름 폰 이메일 주소 가입일 리턴(MemberDTO에 저장하여 리턴)
		dto = dao.getMember(id, pw);
		// id 일치하면 pw 일치하는지 체크 -> 둘다 일치하면 MemberDTO에 저장하여 리턴
		// id 일치하고 pw 불일치 -> "암호 맞지 않습니다. 4번을 입력하세요." (id만 저장)
		// id 불일치 -> "1번을 입력하여 회원가입부터 하세요" (dto null로 선언해서 리턴)
		
		if(dto != null && dto.getPw() != null) {
			System.out.println(dto);
		}
	}

}
