package member_crud;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MemberUpdateView implements View{

	@Override
	public void input() {
		
		Scanner key = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String inputId = key.next();
		System.out.print("암호 입력 : ");
		String inputPw = key.next();
		// 엔터키 삭제
		key.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.getMember(inputId, inputPw);
		System.out.println(dto);
		
		if (dto != null && dto.getName() != null) {
		
			System.out.println(dto.getName() + " 회원님 수정할 항목을 입력하세요");
			System.out.println("암호-이름-이메일-폰-주소 형식과 순서로 입력하고, 수정항목이 아닌 경우 공백을 입력하세요 : ");
			String updateInfo = key.nextLine();
			String[] Infos = updateInfo.split("-");
			
			System.out.println(Arrays.toString(Infos));
			
			HashMap<String, String> map = new HashMap<>();
			map.put("pw", !Infos[0].equals(" ") ? Infos[0] : null);
			map.put("name", !Infos[1].equals(" ") ? Infos[1] : null);
			map.put("email", !Infos[2].equals(" ") ? Infos[2] : null);
			map.put("phone", !Infos[3].equals(" ") ? Infos[3] : null);
			map.put("address", !Infos[4].equals(" ") ? Infos[4] : null);
			
			int result = dao.updateMember(dto, map);
			
			if (result == 0) {
				System.out.println("업데이트 실패!");
			} else {
				System.out.println(result + " 명의 정보가 업데이트 되었습니다!");
			}
		
		}
		
	}

}
