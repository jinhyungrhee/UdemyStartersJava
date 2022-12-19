package test;

import java.util.EmptyStackException;
import java.util.Stack;

public class Test2 {

	public static void main(String[] args) {
		
		String[] expressions = {"(5-(2+3)*2)/4", "(2+3)*1)+3", 
				"((2+3)*1)+3", "(5-(2+3)*2)/4)"};
	
		for (String expression : expressions) {
			if (checkPair(expression)) {
				System.out.println(expression + ": 괄호일치수식");
			} else {
				System.out.println(expression + ": 괄호불일치수식");
			}
		}
	}
	
	public static boolean checkPair(String str) {
		
		Stack<Character> myStack = new Stack<>();
		char[] chArr = str.toCharArray();
		
		for (int i = 0; i < chArr.length; i++) {
			
			try { 
				
				if(chArr[i] == ')') {
					
					while(!myStack.peek().equals('(')) {
						
						myStack.pop();
					}
					myStack.pop(); // 마지막 ')' 제거
				
				} else {
				
					myStack.push(chArr[i]);
				
				}
			
			} catch(EmptyStackException e) {
				return false;
			}
			
		}
		
		//System.out.println(myStack.toString()); // stack에 남은 것들 확인
		// 에러가 발생하지 않으면 짝이 맞는 것
		return true;
		
	}

}
