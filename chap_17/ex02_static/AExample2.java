package ex02_static;

import java.util.Scanner;

class Port{
	//2)정적 멤버 클래스는 static 키워드를 붙이고 port클래스(A)의 멤버로 선언된 USB클래스(B)를 말한다.
	static class USB{
		int myUsb = 2;
		int yourUsb = 1;
		
		public String who() {
			Scanner sc = new Scanner(System.in);
			String name;
			System.out.println("현재 사용하고 있는 컴퓨터는 누구의 것입니까?");
			name = sc.next();
			return name;
		}
		
		int getTotalUsb() {
			return myUsb + yourUsb;
		}
	}
}

public class AExample2 {
	public static void main(String[] args) {
		int total_usb = 0;
		String name = null;
		
		//A.B b = new A.B();
		Port.USB usb = new Port.USB();
		
		total_usb = usb.getTotalUsb();
		name = usb.who();
		
		System.out.println(name + " 컴퓨터 포트에 꽂혀있는 총 usb의 개수는 " + total_usb + "개이다.");
	}
}