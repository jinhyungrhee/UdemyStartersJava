package test;

class StringComparator {
	
	int compare(String str1, String str2, boolean isLength) {
		
		if (isLength == true) {
			
			int strLen1 = str1.length();
			int strLen2 = str2.length();
			
			return strLen1 > strLen2 ? strLen1 : strLen2;
			
		} else {
			
			int aCountStr1 = 0;
			int aCountStr2 = 0;
			
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == 'a') aCountStr1++;
			}
			
			for (int i = 0; i < str2.length(); i++) {
				if (str2.charAt(i) == 'a') aCountStr2++;
			}
			
			return aCountStr1 > aCountStr2 ? str1.length() : str2.length(); 
			
		}
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		StringComparator sc = new StringComparator();
		
		System.out.println(sc.compare("javaprogram", "oracle", true)); // 11
		System.out.println(sc.compare("javaprogram", "oracledatabase", false)); // 14
		
	}

}
