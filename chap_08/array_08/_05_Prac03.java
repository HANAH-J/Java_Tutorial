package array;

import java.util.Scanner;

public class _05_Prac03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//사용자에게 입력받을 값에 대한 변수들과 날들을 합할 변수
		int year = 0, month = 0, day = 0, sum = 0;
		
		//입력
		System.out.println("*** 일수 구하기 ***");
		System.out.print("년: ");
		year = sc.nextInt();
		System.out.print("월: ");
		month = sc.nextInt();
		System.out.print("일: ");
		day = sc.nextInt();
		
		//연산: 윤년인지 검사 윤년에 해당이 되면 2월에 29를 준다.
		if((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) {
			months[1] = 29;
		}
		//1월~입력받은 전 달까지의 합
		for(int i=0; i<(month-1); i++) {
			sum += months[i];
		}
		//입력받은 해당 월의 일수 더하기
		sum += day;
		
		//출력
		System.out.printf("해당 년도의 1월 1일부터 %d월 %d일까지의 총합은 %d일 입니다.", month, day, sum);
	}
}