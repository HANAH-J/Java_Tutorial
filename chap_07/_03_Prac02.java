package repeat;

public class _03_Prac02 {
	public static void main(String[] args) {
		//1~100까지의 숫자를 10단위로 끊어서 각각 더하기
		//선언
		int sum = 0;
		
		//연산, 출력
		for(int i = 1; i <=100; i++) {
			sum += i;
			if(i%10 == 0) {
//				System.out.println(i-9 + "~" + i + "=" +sum);
				System.out.printf("%2d ~%4d = %3d \n", i-9, i, sum);
				sum = 0;
			}
		}
	}
}