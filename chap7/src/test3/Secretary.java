package test3;

public class Secretary extends Employee{

	private int secretaryBonus;
	
	Secretary(int seq, String name, int originalSalary, int bonus, int secretaryBonus) {
		super(seq, name, originalSalary, bonus);
		this.secretaryBonus = secretaryBonus;
		
	}
	
	@Override
	public void calcSalary() {
		int totalSalary = this.getOriginalSalary() + this.getBonus() + secretaryBonus;
		this.setTotalSalary(totalSalary);
	}

}
