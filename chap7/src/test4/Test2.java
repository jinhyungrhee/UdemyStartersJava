package test4;

class Information {
	String id;
	String name;
	
	Information(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	String print() {
		return id + ":" + name;
	}
}

class Product extends Information {
	
	int price;

	Product(String id, String name, int price) {
		super(id, name);
		this.price = price;

	}

	@Override
	String print() {
		return super.print() + ":" + price;
	}

}

class Board extends Information {

	String contents;
	int viewcount;
	
	Board(String id, String name, String contents, int viewcount) {
		super(id, name);
		this.contents = contents;
		this.viewcount = viewcount;
	}
	
	@Override
	String print() {
		return super.print() + ":"  + contents + ":" + viewcount;
	}
	
}

class Member extends Information {
	
	String email;
	String phone;

	Member(String id, String name, String email, String phone) {
		super(id, name);
		this.email = email;
		this.phone = phone;
	}
	
	@Override
	String print() {
		return super.print() + ":"  + email + ":" + phone;
	}
	
}

class InformationList {
	
	Information[] list;
	int len;
	int index;
	
	InformationList(String len) {
		this.len = Integer.parseInt(len);
		this.list = new Information[this.len]; // 배열 객체 생성
	}
	
	public void add(Information info) {
		if (index < len) {
			list[index] = info;
		}
		index++;
	}
	
	public void read() {
		System.out.println("========================================");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].print());
		}
		System.out.println("========================================");
	}
	
}

public class Test2 {

	public static void main(String[] args) {

		InformationList list = new InformationList(args[0]);
		list.add(new Board("1", "게시물1", "현재 조회수는 10입니다", 10));
		list.add(new Product("100", "웅진비데", 300000));
		list.add(new Member("hong", "홍길동", "hong@a.com", "010-222-2222"));
		list.add(new Board("2", "게시물2", "새로운 게시물 추가합니다" ,0));
		list.add(new Product("200", "웅진정수기", 1000000));
		list.add(new Member("lee", "이철수", "chul@b.com", "010-333-3333"));
		list.read();
		
		
	}

}
