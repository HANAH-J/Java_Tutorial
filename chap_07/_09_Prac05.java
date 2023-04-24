package repeat;

import java.util.Scanner;

public class _09_Prac05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int key = 0;
		
		while(true) {
			System.out.println("**********");
			System.out.println("1. 입력");
			System.out.println("2. 검색");
			System.out.println("3. 삭제");
			System.out.println("4. 종료");
			System.out.println("**********");
			System.out.print("번호 선택: ");
			
			key = sc.nextInt();
			
			if(key == 4) break;
			
			switch(key) {
			case 1: System.out.println("입력을 선택하였습니다\n"); break;
			case 2: System.out.println("검색을 선택하였습니다\n"); break;
			case 3: System.out.println("삭제를 선택하였습니다\n"); break;
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
}