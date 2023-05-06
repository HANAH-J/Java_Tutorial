package exam03;

public class InterfaceExample {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.in(50000, "엄마");
		s.out(20000, "PC방");
		s.in(s.MONTHLY_ALLOWANCE, "엄마");
		s.pay(350000, "수학 학원");
		
		System.out.println(Allowance.MONTHLY_ALLOWANCE);
	}
}