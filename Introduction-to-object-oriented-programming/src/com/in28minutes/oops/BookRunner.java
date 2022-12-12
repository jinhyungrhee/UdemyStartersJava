package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(40);

//		artOfComputerProgramming.noOfCopies = 100;
//		effectiveJava.noOfCopies = 50;
//		cleanCode.noOfCopies = 30;

		artOfComputerProgramming.setCopies(-100);
		effectiveJava.setCopies(50);
		cleanCode.setCopies(30);

		artOfComputerProgramming.getCopies();
		effectiveJava.getCopies();
		cleanCode.getCopies();

	}

}
