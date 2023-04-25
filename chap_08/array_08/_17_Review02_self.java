package array;

import java.util.Arrays;
import java.util.Scanner;

public class _17_Review02_self {
	public static void main(String[] args) {
		//차 주차시키는 프로그램
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		boolean[] car = new boolean[5]; //차 주차상태 저장: true(주차된 상태), false(출차된 상태)
		int select = 0; //사용자가 입력한 번호 저장
		int position = 0; //사용자가 입력한 주차의 위치값 저장
		
		do {
			System.out.println("주차 관리 프로그램");
			System.out.println("***************");
			System.out.println("1. 입차\n2. 출차\n3. 리스트\n4. 종료");
			System.out.println("***************");
			System.out.print("메뉴: ");
			select = sc.nextInt();
			System.out.println();
			
			switch(select) {
			case 1: System.out.print("위치 입력[1~5]: ");
					position = sc.nextInt() -1;
					if(car[position] != true) {
						System.out.println(position+1 + "위치에 입차 / 주차되었습니다.\n");
						car[position] = true;
					}else if(car[position] == true) {
						System.out.println(position+1 + "위치에 입차 / 이미 주차되어있습니다.\n");
					}
					break;
			case 2: System.out.print("위치 입력[1~5]: ");
					position = sc.nextInt() -1;
					if(car[position] == true) {
						System.out.println(position+1 + "위치에 출차 / 출차되었습니다.\n");
						car[position] = false;
					}else if(car[position] != true) {
						System.out.println(position+1 + "위치에 주차된 차가 없습니다.\n");
					}
					break;
			case 3: System.out.println("--- 리스트 ---");
					System.out.println("1위치: " + car[0] + "\n2위치: " + car[1] + "\n3위치: " + car[2] + "\n4위치: " + car[3] + "\n5위치: " + car[4] + "\n");
					
			}
			
		}while(select != 4);
		System.out.println("프로그램을 종료합니다.");
	}
}