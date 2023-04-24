package repeat;

public class _15_Exam05 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		//1~10 사이의 홀수의 합 구하기
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 0) continue;
			System.out.println("i : " + i);
			sum += i;
			System.out.println("sum : " + sum);
		}
		System.out.println("===============");
		System.out.println("sum: " + sum);
	}
}