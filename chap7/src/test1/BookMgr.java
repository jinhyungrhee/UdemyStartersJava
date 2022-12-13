package test1;

public class BookMgr {

	private Book[] booklist;
	
	public BookMgr(Book[] booklist) {
		
		this.booklist = booklist;
		
	}
	
	public void printBooklist() {
		for (int i = 0; i < booklist.length; i++) {
			Book b = booklist[i];
			System.out.println(b.getTitle() + " : " + b.getPrice() + "원");
		}
	}
	
	public void printTotalPrice() {
		
		int sum = 0; // 지역변수 명시적 초기화 필요
		for (int i = 0; i < booklist.length; i++) {
			sum += booklist[i].getPrice();
		}
		
		System.out.println("모든 책 가격의 합은 " + sum + "원입니다.");
		
	}

}
