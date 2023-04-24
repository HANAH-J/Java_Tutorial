package repeat;

import java.util.Scanner;

public class _02_Prac01_self {
	public static void main(String[] args) {
		int i;
		int num;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		num = sc.nextInt();
		
		for(i=1; i<=100; i++) {
			if(i%num == 0) {
				System.out.print(i + " ");
				sum++;
			}
		}
		System.out.println("\n1~100 사이의 " + num + "의 배수 개수 = " + sum);
	}
}
