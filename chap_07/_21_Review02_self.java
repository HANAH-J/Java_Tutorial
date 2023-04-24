package repeat;

import java.util.Scanner;

public class _21_Review02_self {
	public static void main(String[] args) {
		//마이너스 통장 만들기
		Scanner sc = new Scanner(System.in);
		int num;
		int pay1 = 0;
		int pay2 = 0;
		int pay3 = 0;
		
		do {
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
			System.out.print("번호 선택: ");
			num = sc.nextInt();
			
			switch(num) {
			case 1: System.out.print("예금액: ");
			pay1 = sc.nextInt(); break;
			case 2: System.out.print("출금액: ");
			pay2 = sc.nextInt(); 
			pay3 = pay1-pay2; break;
			case 3: System.out.println("잔고액: " + pay3); break;
			}
			
			if(num == 4) break;
		}while(true);
		System.out.println("프로그램을 종료합니다.");
	}
}