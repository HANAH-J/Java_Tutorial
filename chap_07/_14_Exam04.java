package repeat;

public class _14_Exam04 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		//1~10까지의 합 구하기
		while(true) { //무한루프의 의미로 반드시 탈출 명령어가 있어야 한다!
			sum += i;
			System.out.println("i: " + i);
			System.out.println("sum: " + sum);
			
			if(i>=10) break;
			i++;
		}
	}
}