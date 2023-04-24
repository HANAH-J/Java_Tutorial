package repeat;

import java.util.Scanner;

public class _10_Prac05_self {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		while (true) {
			System.out.println("**********");
			System.out.println("1. 입력\n2. 검색\n3. 삭제\n4. 종료");
			System.out.println("**********");
			System.out.print("번호 선택 : ");
			num = sc.nextInt();

			switch (num) {
			case (1):
				System.out.println("입력을 선택하였습니다");
				break;
			case (2):
				System.out.println("검색을 선택하였습니다");
				break;
			case (3):
				System.out.println("삭제를 선택하였습니다");
				break;
			}

			if (num == 4) break;
		}
		System.out.println("프로그램을 종료합니다");
	}
}