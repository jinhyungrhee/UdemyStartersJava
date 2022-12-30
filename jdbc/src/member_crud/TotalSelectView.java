package member_crud;

import java.util.ArrayList;
import java.util.Scanner;

public class TotalSelectView implements View {

	@Override
	public void input() {
		
		Scanner key = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		int total = dao.getTotalMember();//10
		int pageNum = 0;
		int memeberPerPage = 3; // 한 페이지당 보여주는 사람의 수
		if ( total % 3 == 0 ) { pageNum = total / memeberPerPage; }
		else { pageNum = (total / memeberPerPage) + 1; }
		// 10 / 3 (나머지 있으면 + 1)
		System.out.println("1 - " + pageNum + " 페이지 입력 가능합니다.");
		
		// --- paging 처리 ---
		// 10명 저장 / 1페이지 당 3명씩
		// member 테이블 전체 데이터 개수 조회
		// select count(*) from member; - DAO가 실행
		// 1 - 4 페이지 중 입력 가능합니다
		
		System.out.print("페이지 번호 입력 : ");
		int currentPage = key.nextInt();
		ArrayList<MemberDTO> list = dao.getMemberList(currentPage, memeberPerPage);
		
		System.out.println("ID\t이름");
		for (MemberDTO d : list) {
			//System.out.println(d.getId() + "\t" + d.getName());
			System.out.println(d);
		}
		
	}

}
