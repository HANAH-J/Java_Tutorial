package repeat;

import java.util.Scanner;

public class _22_Review02 {
	public static void main(String[] args) {
		//마이너스 통장 만들기
		Scanner sc = new Scanner(System.in);
		//선언
		int select = 0; //번호 저장
		int balance = 0; //잔고 저장
		int withdrawal = 0; //출금액 저장
		int deposit = 0; //입금액 저장
		
		//입력, 연산, 출력
		while(true) {
			//입력
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
			System.out.print("번호 선택: ");
			select = sc.nextInt();
			
//			if(select == 4) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
			
			switch(select) {
			case 1:
				System.out.print("예금액: ");
				deposit = sc.nextInt(); 
				balance += deposit;
			break;
			case 2:
				System.out.print("출금액: ");
				withdrawal = sc.nextInt(); 
				balance -= withdrawal;
				break;
			case 3:
				System.out.println("잔고액: " + balance);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}