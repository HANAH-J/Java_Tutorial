package repeat;

import java.util.Scanner;

public class _05_Prac03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		char ch;
		
		do {
			System.out.println("몇 단을 출력할지 입력하세요: ");
			num = sc.nextInt();
			
			for(int i=1; i<=9; i++) {
				System.out.printf("%2d*%2d=%2d\n", num, i, num*i);
			}
			
			System.out.println("계속할지 선택하세요. (y: 계속)");
			ch = sc.next().charAt(0); //charAt(0)은 입력한 문자열의 첫번째 문자만 가져온다!
			
			if(!(ch=='y' || ch=='Y')) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
		}while(true);
	}
}