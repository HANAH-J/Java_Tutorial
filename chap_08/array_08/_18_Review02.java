package array;

import java.util.Scanner;

public class _18_Review02 {
	public static void main(String[] args) {
		//차 주차시키는 프로그램
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		boolean[] car = new boolean[5]; //차 주차상태 저장: true(주차된 상태), false(출차된 상태)
		int select = 0; //사용자가 입력한 번호 저장
		int position = 0; //사용자가 입력한 주차의 위치값 저장
		
		while(true) {
			System.out.println("주차 관리 프로그램");
			System.out.println("***************");
			System.out.println("1. 입차");
			System.out.println("2. 출차");
			System.out.println("3. 리스트");
			System.out.println("4. 종료");
			System.out.println("***************");
			System.out.print("메뉴: ");
			select = sc.nextInt();
			
			if(select == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch(select) {
			case 1: 
				System.out.print("위치 입력[1~5]: ");
				position = sc.nextInt();
				if(car[position-1]) {//true: 주차된 차가 존재
					System.out.println(position+"위치에 입차 / 이미 주차되어 있습니다.");
				}else {
					car[position-1] = true; //주차되었다고 값을 변경
					System.out.println(position+"위치에 입차 / 주차되었습니다.");
				} break;
			case 2:
				System.out.print("위치 입력[1~5]: ");
				position = sc.nextInt();
				if(car[position-1]) {//true: 주차된 차가 존재
					car[position-1] = false;
					System.out.println(position+"위치에 출차 / 출차되었습니다.");
				}else { //false:주차된 차가 없음
					System.out.println(position+"위치에 출차 / 주차되어 있지 않습니다.");
				} break;
			case 3:
				System.out.println();
				System.out.println("--- 리스트 ---");
				for(int i= 0; i<car.length; i++) {
					System.out.println((i+1)+"위치: " + car[i]);
				} break;
			} //switch end
			System.out.println();
		} //while end
	}
}