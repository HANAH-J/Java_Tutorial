package method;

import java.util.Scanner;

public class _08_Ex07_SelfPrac01_self {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		_07_Ex07_doubleNum myp = new _07_Ex07_doubleNum();
		
		System.out.print("정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력: ");
		int num2 = sc.nextInt();
		
		if(myp.doubleNum(num1, num2)) {
			System.out.println(num1 + "(은)는 " + num2 + "의 배수입니다");
		}else {
			System.out.println(num1 + "(은)는 " + num2 + "의 배수가 아닙니다");
		}
	}	
}