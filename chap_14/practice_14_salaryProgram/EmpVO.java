package salaryProgram;

public class EmpVO {
	private String name;
	private String position;
	private int basepay;
	private int bonus;
	private double taxrate;
	private int salary;
	
	public EmpVO() {}
	
	public EmpVO(String name, String position, int basepay, int bonus, double taxrate, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.basepay = basepay;
		this.bonus = bonus;
		this.taxrate = taxrate;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return name + "\t" + position + "\t" + basepay + "\t" + bonus + "\t" + taxrate + "\t" + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getBasepay() {
		return basepay;
	}

	public void setBasepay(int basepay) {
		this.basepay = basepay;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public double getTaxrate() {
		return taxrate;
	}

	public void setTaxrate(double taxrate) {
		this.taxrate = taxrate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
