package salaryProgram;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller control = new Controller();
		
		while(true) {
			System.out.print("Green company 월급관리\n"
							+ "********************\n"
					        + "\t1.등록\n"
						    + "\t2.출력\n"
					        + "\t3.종료\n"
							+ "********************\n"
							+ "번호: ");
			char c = sc.next().charAt(0);
			System.err.println();

			if (c == '1') {
				control.input();
			} else if (c == '2') {
				control.output();
			} else if (c == '3') {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println();
		}
	}
}