package repeat;

import java.util.Scanner;

public class _17_Exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int key = 0;
		
		//연산과 출력구문
		while(true) {
			System.out.println("***************");
			System.out.println(" 1. 입력\n 2. 검색 \n 3. 삭제 \n 4. 종료");
			System.out.println("***************");
			System.out.println("번호 선택: ");
			
			key = sc.nextInt();
			
			if(key == 4) break; //4이면 종료
			
			switch(key) {
			case 1: System.out.println("입력을 선택하였습니다."); break;
			case 2: System.out.println("검색을 선택하였습니다."); break;
			case 3: System.out.println("삭제를 선택하였습니다."); break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}