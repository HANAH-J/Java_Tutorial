package repeat;

public class _12_Exam02 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for (i = 1; i <= 10; i++) {
			sum += i;
			System.out.println("sum: " + sum);
			System.out.println("i: " + i);
		}
		System.out.println("===============");
		System.out.println("sum: " + sum);
	}
}