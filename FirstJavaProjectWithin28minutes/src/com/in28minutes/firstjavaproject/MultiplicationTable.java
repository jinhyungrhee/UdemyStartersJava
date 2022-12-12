package com.in28minutes.firstjavaproject;

public class MultiplicationTable {

	void print() {

		print(5);

		// print(5, 1, 10);

		/*
		 * for (int i = 1; i <= 10; i++) { System.out.printf("%d * %d = %d", 5, i, 5 *
		 * i).println(); }
		 */
	}

	// 오버로딩 - 매개변수를 다르게 설정함으로써 또 다른 함수를 만들어냄
	void print(int table) {

		print(table, 1, 10);

		/*
		 * for (int i = 1; i <= 10; i++) { System.out.printf("%d * %d = %d", table, i,
		 * table * i).println(); }
		 */

	}

	void print(int table, int from, int to) {

		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}

	}

}
