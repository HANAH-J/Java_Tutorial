package method;

public class _02_Ex02_method02 {
	//매개변수가 있는 메소드
	static int tot;
	
	public static double plus(int i, int j) {
		return i+j;
	}
	public static double minus(int i, int j) {
		return i-j;
	}
	//static으로 선언한 변수에 접근하기 위한 메소드는 반드시 static 메소드여야 한다!!
	public static int sum(int from, int to) {
		int tot = 0;
		for(int i=from; i<=to; i++) {
			tot += i;
		}
		return tot;
	}
	
	public static void main(String[] args) {
		System.out.println("==1.더하기, 빼기 연산==");
		System.out.println(plus(5,7));
		System.out.println(minus(100,200));
		System.out.println("==2.총합 메소드==");
		System.out.println(sum(1,10));
	}
}