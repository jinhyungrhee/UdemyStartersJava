package test;

class Trainee {
	
	String name, subject;
	static String location = "새싹";
	int fee, returnFee;
	final int addFee = 5000;
	
	void calcReturnFee() {
		
		if(this.subject.equals("자바")) {
			returnFee = (int)(fee * 0.2 + addFee);
		} else if (this.subject.toLowerCase().equals("jsp")) {
			returnFee = (int)(fee * 0.15 + addFee * 2);
		} else if (this.subject.toUpperCase().equals("SPRING")) {
			returnFee = (int)(fee * 0.1 + addFee);
		} else {
			System.out.println("과정명은 없습니다.");
			//returnFee = 0;
		}
		
		System.out.printf(
				"이름 : %s\n과정명 : %s\n교육비 : %d\n교육기관 : %s\n부가금 : %d\n환급비 : %d\n",
				name, subject, fee, Trainee.location, addFee, returnFee
				);
	}
	
}

public class Test1Answer {

	public static void main(String[] args) {

		
		Trainee t1 = new Trainee();
		t1.name = args[0];
		t1.subject = args[1];
		t1.fee = Integer.parseInt(args[2]);
		
		t1.calcReturnFee();
		
	}

}

//subject.equalsIgnoreCase(); // 대소문자 구분하지 않고 비교
