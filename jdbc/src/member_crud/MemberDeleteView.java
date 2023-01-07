package member_crud;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MemberDeleteView implements View{

	@Override
	public void input() {
		
		OneSelectView view = new OneSelectView();
		view.input(); // getMember() 검사
		MemberDTO dto = view.getDto();
		if (dto == null || dto.getPw() == null) {
			return;
		}
		
		if (dto == null) {
			System.out.println("탈퇴에 실패하였습니다.");
			return;
		}
		else {
			MemberDAO dao = new MemberDAO();
			dao.deleteMember(dto.getId());
			System.out.println("탈퇴가 완료되었습니다.");
		}
		
	}

}
