package com.in28minutes.primitive.datatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {

		if (Character.toUpperCase(ch) == 'A' || Character.toUpperCase(ch) == 'E' || Character.toUpperCase(ch) == 'I'
				|| Character.toUpperCase(ch) == 'O' || Character.toUpperCase(ch) == 'U') {
			return true;
		}

		return false;
	}

	public boolean isDigit() {

		if (ch >= 48 && ch <= 57) {
			return true;
		}

		return false;
	}

	public boolean isAlphabet() {

		if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
			return true;
		}

		return false;
	}

	public boolean isConsonant() {
		// ! [a, e, i, o, u]
		// 자음은 '알파벳'이면서 '모음이 아닌 문자'임
		if (isAlphabet() && !isVowel()) {
			return true;
		}
		return false;

	}

	// static method - 클래스의 데이터를 사용하지 않음
	public static void printLowerCaseAlphabets() {

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}

	}

	public static void printUpperCaseAlphabets() {

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

}
