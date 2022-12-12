package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {

		MyChar myChar = new MyChar('c');
		System.out.println(myChar.isVowel()); // a, e, i, o, u and Capitals
		myChar.isConsonant();
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		// static method
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
