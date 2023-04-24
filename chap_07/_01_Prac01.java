package repeat;

import java.util.Scanner;

public class _01_Prac01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//선언
		int num;
		int count = 0;
		
		//입력
		System.out.print("숫자 입력: ");
		num = sc.nextInt();
		
		//연산+출력
		for(int i = 1; i <= 100; i++) {
			if(i%num == 0) {
				System.out.print(i+" ");
				count++; //count +=1
			}
		}
		System.out.println("\n1~100 사이의 " + num + "의 배수 개수 = " + count);
	}
}