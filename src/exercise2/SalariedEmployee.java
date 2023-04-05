package exercise2;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	SalariedEmployee(String name, String idNo, double weeklySalary) {
		super(name, idNo);
		this.weeklySalary = weeklySalary;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary >= 0)
			this.weeklySalary = weeklySalary;
		else 
			this.weeklySalary = 0;
	}
	
	public static void main(String[] args) {
		Employee a = new SalariedEmployee("", "", 0);
		Employee b = new SalariedEmployee("", "", 0);
		System.out.println(a instanceof Employee);
		System.out.println(a instanceof SalariedEmployee);
		System.out.println(b instanceof SalariedEmployee);
		System.out.println(a instanceof Employee);
	}
}



