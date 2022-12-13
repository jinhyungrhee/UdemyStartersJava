package test3;

public class Engineer extends Employee {

	private int certificateBonus;
	private int engineerBonus;
	
	Engineer(int seq, String name, int originalSalary, int bonus, int certificateBonus, int engineerBonus) {
		super(seq, name, originalSalary, bonus);
		this.certificateBonus = certificateBonus;
		this.engineerBonus = engineerBonus;
		
	}
	
	public int getCertificateBonus() {
		return this.certificateBonus;
	}
	
	public int getEngineerBonus() {
		return this.engineerBonus;
	}
	
	@Override
	public void calcSalary() {
		int totalSalary = this.getOriginalSalary() + this.getBonus() + certificateBonus + engineerBonus;
		this.setTotalSalary(totalSalary);
	}

}
