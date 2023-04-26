package method;

import java.util.Scanner;

public class _14_Ex13_daysSum {
	//날짜를 입력받아 1월 1일부터 몇일이 지났는지 알아보는 코드의 로직을 각각의 함수로 구현하기
	
	//입력받는 메소드
	static int[] input() {
		Scanner sc = new Scanner(System.in);
		int year, month, day;
		System.out.print("년: ");
		year = sc.nextInt();
		System.out.print("월: ");
		month = sc.nextInt();
		System.out.print("일: ");
		day = sc.nextInt();
		
		int[] arr = {year, month, day};
		return arr;
	}
	
	//연산하는 메소드
	public static int calc_sum(int year, int[] months, int month, int day) {
		int sum = 0;
		//해당 year가 윤년일 경우에는 2월을 29일까지 넣어준다.
		if((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) {
			months[1] = 29;
		}
		for(int i=0; i<(month-1); i++) {
			sum += months[i];
		}
		sum += day;
		return sum;
	}
	
	//출력하는 메소드
	public static void output(int month, int day, int sum) {
		System.out.println("1월 1일부터 " + month + "월 " + day + "일까지는 " + sum + "일 입니다.");
	}
	
	public static void main(String[] args) {
		System.out.println("=== 일수 구하기 ===");
		
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int month = 0, day = 0, sum = 0, year = 0;
		
		//입력
		int[] arr = input();
		year = arr[0];
		month = arr[1];
		day = arr[2];
		
		//연산
		sum = calc_sum(year, months, month, day);
		
		//출력
		output(month, day, sum);
	}
}