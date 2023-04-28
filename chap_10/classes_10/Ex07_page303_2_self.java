package classes;

import java.util.Scanner;

public class Ex07_page303_2_self {
	public static void main(String[] args) {
		double base, height, getArea = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("*** 삼각형 넓이 구하기 ***");
		System.out.print("밑변: ");
		base = input.nextDouble();
		System.out.print("높이: ");
		height = input.nextDouble();
		
		Triangle1 area = new Triangle1();
		area.setTriangle(base, height);
		area.getArea();
		area.output(getArea);
	}
}