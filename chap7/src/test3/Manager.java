package test3;

public class Manager extends Employee{

	private int managerBonus;
	
	Manager(int seq, String name, int originalSalary, int bonus, int managerBonus) {
		super(seq, name, originalSalary, bonus);
		this.managerBonus = managerBonus;
		
	}
	
	@Override
	public void calcSalary() {
		int totalSalary = this.getOriginalSalary() + this.getBonus() + managerBonus;
		this.setTotalSalary(totalSalary);
	}

}
