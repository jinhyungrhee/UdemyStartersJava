package test1;

public class BookMgr {

	private Book[] booklist;
	
	public BookMgr(Book[] booklist) {
		
		this.booklist = booklist;
		
	}
	
	public void printBooklist() {
		for (int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	
	public void printTotalPrice() {
		
		int sum = 0;
		for (int i = 0; i < booklist.length; i++) {
			sum += booklist[i].getPrice();
		}
		
		System.out.println("모든 책 가격의 합은 " + sum + "원입니다.");
		
	}

}
