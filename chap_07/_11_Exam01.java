package repeat;

public class _11_Exam01 {
	public static void main(String[] args) {
		int a = 1;
		int sum = 0;
		
		while (a <= 10)
		{
			sum += a;
			a += 1; //a++;
			System.out.println("sum: " + sum);
			System.out.println("a: " + a);			
		}
		System.out.println("===============");
		System.out.println("sum: " + sum);
	}
}