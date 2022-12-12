package com.in28minutes.oops;

public class Book {

	// 책 재고량 (캡슐화)
	private int noOfCopies;

	// 생성자
	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	void setCopies(int noOfCopies) {
		// validation
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	void getCopies() {
		System.out.println(this.noOfCopies);
	}

	public void increaseNoOfCopies(int howMuch) {
		setCopies(this.noOfCopies + howMuch);
	}

	public void decreaseNoOfCopies(int howMuch) {
		setCopies(this.noOfCopies - howMuch);
	}

}
