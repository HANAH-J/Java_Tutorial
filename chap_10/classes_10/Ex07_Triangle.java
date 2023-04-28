package classes;

import java.util.Scanner;

public class Ex07_Triangle {
	int base=0, height=0;
	
	Ex07_Triangle(){}
	
	Ex07_Triangle(int base, int height){
		this.base = base;
		this.height = height;
	}
	
	void setTriangle(int b, int h) {
		base = b;
		height = h;
	}
	void setTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변 : ");
		int width = sc.nextInt();
		System.out.println("높이 : ");
		int height = sc.nextInt();
		
		System.out.println("삼각형의 넓이 : "+width*height/2);		
	}
	
	double getArea() {
		return base * height / 2;
	}
}