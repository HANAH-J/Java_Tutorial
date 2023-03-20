package chap_07;

import java.util.Scanner;

public class _Quiz_07_Example {
	int base=0, height=0;
	
	_Quiz_07_Example(){}
	
	_Quiz_07_Example(int base, int height){
		this.base = base;
		this.height = height;
	}
	
	void setTriangle(int b, int h) {
		base = b;
		height = h;
	}
	
	void setTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 : ");
		int width = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		
		System.out.print("삼각형의 넓이 : " + width * height / 2);		
	}
	
	double getArea() {
		return base * height / 2;
	}
}