package method;

import java.util.Scanner;

public class _09_Ex07_SelfPrac01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		_07_Ex07_doubleNum dNum = new _07_Ex07_doubleNum();
		
		System.out.print("정수 입력: ");
		int a = sc.nextInt();
		System.out.print("정수 입력: ");
		int b = sc.nextInt();
		
		if(dNum.doubleNum(a,b)) {
			System.out.println(a + "(은)는 " + b + "의 배수입니다");
		}else {
			System.out.println(a + "(은)는 " + b + "의 배수가 아닙니다");
		}
		
	}	
}