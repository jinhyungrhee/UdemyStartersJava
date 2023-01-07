package member_crud;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MemberUpdateViewAnswer implements View{

	@Override
	public void input() {
		
		OneSelectView view = new OneSelectView();
		view.input();
		MemberDTO dto = view.getDto();
//		if (dto != null && dto.getPw() != null) {
//			System.out.println(dto);
//		}
		
		
		Scanner key = new Scanner(System.in);
		System.out.println("수정항목 입력(암호-이름-메일-폰-주소 순서와 양식에 맞게 입력하시오");
		String updateValue = key.nextLine(); 
		String[] updateArr = updateValue.split("-");
		String[] updateColumn = {"pw", "name", "email", "phone", "address"};
		HashMap<String, String> updateMap = new HashMap<>();
		
		for (int i = 0; i < updateArr.length; i++) {
			if(!updateArr[i].equals(" ")) {
				updateMap.put(updateColumn[i], updateArr[i]);			
			}
		}
		
		// 확인
//		Set<String> keys = updateMap.keySet(); // key들만 Set 타입으로 리턴
//		for(String k : keys) {
//			System.out.println(k + " : " + updateMap.get(k));
//		}
		
		if(dto == null || dto.getPw() == null) {
			return;
		}
		updateMap.put("id", dto.getId());		
		MemberDAO dao = new MemberDAO();
		dao.updateMemberAnswer(updateMap);
		
	}

	
	

}
