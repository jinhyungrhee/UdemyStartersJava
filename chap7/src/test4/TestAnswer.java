package test4;

class Information2 {
	String id;
	String name;
	
	Information2(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	String print() {
		return id + ":" + name;
	}
}

class InformationList2 {
	Information2 array[];
	int length; // 멤버 변수
	int count; // 멤버 변수 - 인덱스 계산
	
	InformationList2 (String length) { // 생성자 매개변수
		this.length = Integer.parseInt(length);
		array = new Information2[this.length]; // 배열 객체 생성하여 멤버 변수로 지정
	}
	
	void add(Information2 inform) { // 6번 호출
		
		if(count >= length) {
			return; // add 메서드를 종료시킴! 
		}
		
		array[count++] = inform;
		//count++;
	}
	
	void read() {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) { // NullPointerException 방지
				System.out.println(array[i].print());
			}
		}
	}
}


class Board2 extends Information2 {
	
	//Board2() { super(); }
	//String id; 		// 게시물 식별 코드
	//String name; 		// 게시물 이름
	String contents; 	// 게시물 내용
	int viewcount; 		// 조회수
	
	// new Board("1", "게시물1", "현재 조회수 10입니다", 10)
	Board2(String id, String name, String contents, int viewcount) {
		super(id, name); // Information(String id, String name)
		this.contents = contents;
		this.viewcount = viewcount;
	}

	@Override
	String print() {
		return super.print() + ":" + contents + ":" + viewcount;
	}
	
	
}

class Product2 extends Information2 {
	
	//Product2() { super(); }
	int price;

	public Product2(String id, String name, int price) {
		super(id, name);
		this.price = price;
	}
	
	@Override
	String print() {
		return super.print() + ":" + price;
	}
	
}

class Member2 extends Information2 {
	
	//Member2() { super(); }
	String email, phone;

	public Member2(String id, String name, String email, String phone) {
		super(id, name);
		this.email = email;
		this.phone = phone;
	}
	
	@Override
	String print() {
		return super.print() + ":" + email + ":" + phone;
	}
}


public class TestAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InformationList2 list = new InformationList2(args[0]);
		list.add(new Board2("1", "게시물1", "현재 조회수는 10입니다", 10));
		list.add(new Product2("100", "웅진비데", 300000));
		list.add(new Member2("hong", "홍길동", "hong@a.com", "010-222-2222"));
		list.add(new Board2("2", "게시물2", "새로운 게시물 추가합니다" ,0));
		list.add(new Product2("200", "웅진정수기", 1000000));
		list.add(new Member2("lee", "이철수", "chul@b.com", "010-333-3333"));
		list.read();

	}

}
