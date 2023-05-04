package salary;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller control = new Controller();
		
		while(true) {
			System.out.print("1. 입력\n"
						    +"2. 출력\n"
					        +"3. 종료\n"
						    +"----------\n"
					        +"번호 입력: ");
			char c = sc.next().charAt(0);
			System.out.println();	//줄넘김
			
			if(c=='1') {
				control.input();
			}else if(c=='2') {
				control.output();
			}else if(c=='3') {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("1~3번 중에서 번호를 입력해주세요.");
			}
			System.out.println();	//줄바꿈
		}
	}
}