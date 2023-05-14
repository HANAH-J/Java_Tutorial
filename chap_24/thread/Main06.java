package chap18;

public class Main06 {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		User1 u1 = new User1(c);
		User2 u2 = new User2(c);
		
		u1.start(); // 1000
		u2.start(); // 50
	}
}