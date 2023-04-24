package repeat;

import java.util.Scanner;

public class _06_Prac03_self {
	public static void main(String[] args) {
		int i =1;
		int num;
		String keep;
		
		while(true) { 
			Scanner sc = new Scanner(System.in);
			System.out.print("몇 단을 출력할지 입력하세요: ");
			num = sc.nextInt();
			
		for(i=1; i<=9; i++) {
			System.out.println(num + "*" + i + " = " + num*i);
		}
		System.out.print("계속할 지 선택하세요 (y: 계속):");
		keep = sc.next();
		
		if(! keep.equals("y")) {
			System.out.print("종료합니다.");
			break;
		}
		}
	}
}