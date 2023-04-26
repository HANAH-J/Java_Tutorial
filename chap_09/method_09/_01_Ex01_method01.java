package method;

import java.util.Scanner;

public class _01_Ex01_method01 {
	//static이 붙은 메소드를 '클래스 메소드'라 부른다. 자바에서 static 키워드를 사용한다는 것은 메모리에 한 번 할당되어 프로그램이 종료될 때 해제되는 것을 의미하며 클래스의 인스턴스를 생성하지 않고도 다른 클래스에서 해당 클래스의 메소드를 사용할 수 있다.
	
	//1.매개변수와 반환값이 모두 없는 메소드
	public static void show() {
		System.out.println("나는 show 메소드이다.");
	}
	
	//2.매개변수는 있고 반환값은 없는 메소드
	public static void findPower(int x, int y) {
		int result = 1;
		for(int a=1; a<=y; a++) {
			result *= x;
			System.out.println(x + "의 " + y + "제곱 = " + result);
		}
	}
	
	//3.매개변수는 없고 반환값은 있는 메소드
	public static int doSomething() {
		int result;
		result = 10*10;
		return result;
	}
	
	//4.매개변수와 반환값이 모두 있는 메소드
	static int add(int x, int y) {
		int result;
		result= x + y;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("==1. 매개변수와 반환값이 모두 없는 메소드==");
		show();
		
		System.out.println("==2. 매개변수는 있고 반환값은 없는 메소드==");
		findPower(2,3);
		
		System.out.println("==3. 매개변수는 없고 반환값은 있는 메소드==");
		int x = doSomething();
		System.out.println(x);
		
		System.out.println("==4. 매개변수와 반환값이 모두 있는 메소드==");
		System.out.println("두 개의 정수를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int y = add(a,b);
		System.out.println(a + " 더하기 " + b + "는 " + y + "입니다.");
		
		sc.close();
	}
}