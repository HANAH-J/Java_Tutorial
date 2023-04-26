package method;

import java.util.Scanner;

public class _16_Ex14_review01_self_2 {
	//메뉴를 선택하는 메소드
	public static int input_menu() {
		Scanner input = new Scanner(System.in);
		System.out.printf("1. 예금\t2. 출금\t3. 잔고\t4. 종료\n");
		System.out.print("번호선택: ");
		return input.nextInt();
	}
	
	//프로그램을 종료하는 메소드
	public static void check_end() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	
	//예금액을 입력하는 메소드
	public static int input_deposit(int balance) { //balance: 잔고액
		Scanner input = new Scanner(System.in);
		System.out.print("예금액: ");
		int deposit = input.nextInt();
		balance += deposit;
		return balance;
	}
	
	//출금액을 입력하는 메소드
	public static int input_withdrawal(int balance) {
		Scanner input = new Scanner(System.in);
		System.out.print("출금액: ");
		int withdrawal = input.nextInt();
		
		if((balance-withdrawal) < 0) {
			System.out.println("출금액이 잔고액보다 많습니다.");
		}else {
			balance -= withdrawal;
		}
		return balance;
	}
	
	//잔고액을 출력하는 메소드
	public static void output_balance(int balance) {
		System.out.println("잔고액: " + balance);
	}
	//실행하는 메인 메소드
	public static void main(String[] args) {
		int select = 0, balance = 0;
		
		do {
			select = input_menu();
			switch(select) {
			case 1: balance = input_deposit(balance);
					System.out.println(); break;
			case 2: balance = input_withdrawal(balance);
					System.out.println(); break;
			case 3: output_balance(balance);
					System.out.println(); break;
			case 4: check_end(); break;
			default: System.out.println("올바른 번호를 입력해주세요.\n"); break;
			}
		}while(true);
	}
}