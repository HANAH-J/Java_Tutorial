package method;

import java.util.Scanner;

public class _13_Ex10_Prac04 {
	//입력받는 메소드
	public static int input_dan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력할지 입력하세요: ");
		int dan = sc.nextInt();
		return dan;
	}
	
	//출력하는 메소드
	public static void display_gugudan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
	//계속해서 단을 출력할지 물어보는 메소드
	public static char input_y() {
		Scanner sc = new Scanner(System.in);
		System.out.print("계속할지 선택하세요(y: 계속): ");
		char go = sc.next().charAt(0);
		return go;
	}
	
	//사용자의 의도에 따라서 종료가 될지 안 될지 실행하는 메소드
	public static void check_end(char check) {
		if(!((check == 'y') || (check == 'Y'))) {
			System.out.println("종료합니다.");
			System.exit(0); //시스템을 빠져나간다.
		}
	}
	
	//실행시키기 위한 main 메소드
	public static void main(String[] args) {
		do {
			//입력
			int dan = input_dan();
			//출력
			display_gugudan(dan);
			
			char go = input_y();
			check_end(go);
		}while(true);
	}
}