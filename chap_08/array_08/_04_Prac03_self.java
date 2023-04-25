package array;

import java.util.Scanner;

public class _04_Prac03_self {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("*** 일수 구하기 ***");
		System.out.print("년: ");
		int year = sc.nextInt();
		System.out.print("월: ");
		int month = sc.nextInt();
		System.out.print("일: ");
		int date = sc.nextInt();

		int day1, day2 = 0, day3 = 0;
		day1 = (months[month-1]) - date;
		
		for(int i=0; i<month; i++) {
			day2 += months[i];
			day3 = day2 - day1;
			if((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) {
				day3++;
			}
		}
		System.out.print("1월 1일부터 " + month + "월 " + date + "일까지는 " + day3 + "일 입니다.");
	}
}