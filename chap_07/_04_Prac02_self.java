package repeat;

public class _04_Prac02_self {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for(i=1; i<=100; i++) {
			sum += i;
			if(i%10 == 0) {
				System.out.printf("%2d ~ %3d = %3d\n", i-9, i, sum);
				sum = 0;
			}
		}
	}
}