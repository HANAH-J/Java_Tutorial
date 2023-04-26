package method;

import java.util.Scanner;

public class _17_Review01 {
	// 번호 선택 메소드
	public static int input_select() {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호선택: ");
		int select = sc.nextInt();
		return select;
	}

	// 프로그램종료 메소드
	public static void exit(int select) {
		if (select == 4) {
			System.out.println("프로그램을 종료합니다.");
		}
		System.exit(0);
	}

	// 예금액 입력 메소드
	public static void input_deposit(int balance) {
		Scanner sc = new Scanner(System.in);
		System.out.print("예금액: ");
		int deposit = sc.nextInt();
		System.out.println();
		balance += deposit;
	}

	// 출금액 입력 메소드
	public static int input_withdrawal(int balance, int deposit) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출금액: ");
		int withdrawal = sc.nextInt();

		balance = deposit - withdrawal;
		if (balance >= withdrawal) {
			System.out.println();
			balance -= withdrawal;
		} else {
			System.out.println("출금액이 잔고액보다 많습니다.\n");
			withdrawal = 0;
		}
		return withdrawal;
	}

	// 잔고출력 메소드
	public static int balance(int deposit, int withdrawal) {
		int balance = deposit - withdrawal;
		System.out.print("잔고액: " + balance + "\n");
		System.out.println();
		return balance;
	}

	// 실행 메소드
	public static void main(String[] args) {

		while (true) {
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");

			int select, deposit = 0, withdrawal = 0, balance = 0;

			select = input_select();

			switch (select) {
			case 1:
				input_deposit(balance);
				break;
			case 2:
				input_withdrawal(balance, deposit);
				break;
			case 3:
				balance(deposit, withdrawal);
				break;
			case 4:
				exit(select);
				break;
			}
		}
	}
}