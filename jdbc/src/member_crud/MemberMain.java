package member_crud;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("=== 회원관리 프로그램 ===");
			System.out.println("1.회원정보 입력");
			System.out.println("2.회원정보 수정");
			System.out.println("3.회원탈퇴");
			System.out.println("4.회원정보조회"); // id, pw 입력 => 1개
			System.out.println("5.전체회원조회"); // 입력X => 여러개(모든 회원 id, 이름 조회)
			System.out.println("6.종료");
			System.out.print("번호 입력 : ");
			Scanner key = new Scanner(System.in);
			int menu = key.nextInt();
			if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if (menu == 1) {
				// MemberInsertView input 메서드 호출
				new MemberInsertView().input();
			}
			else if (menu == 2) {
				new MemberUpdateViewAnswer().input();
			}
			else if (menu == 3) {
				new MemberDeleteView().input();
			}
			else if (menu == 4) {
				new OneSelectView().input();
			}
			else if (menu == 5) {
				// paging 처리 필요
				// 10명 이상 입력 가정 -> 1페이지 당 3명씩
				new TotalSelectView().input();
			}
		} // end of while loop
		
	} // end of main

}
