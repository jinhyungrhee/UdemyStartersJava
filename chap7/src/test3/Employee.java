package test3;

public class Employee {

	private int seq;
	private String name;
	private int originalSalary;
	private int bonus;
	private int totalSalary;
	
	Employee(int seq, String name, int originalSalary, int bonus) {
		this.seq = seq;
		this.name = name;
		this.originalSalary = originalSalary;
		this.bonus = bonus;
	}
	
	public int getSeq() {
		return this.seq;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getOriginalSalary() {
		return this.originalSalary;
	}
	
	public int getBonus() {
		return this.bonus;
	}
	
	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}
	
	public int getTotalSalary() {
		return this.totalSalary;
	}
	
	public void calcSalary() {
		totalSalary = originalSalary + bonus;
	}
}
