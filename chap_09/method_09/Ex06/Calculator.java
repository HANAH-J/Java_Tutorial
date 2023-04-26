package method.Ex06;

public class Calculator {
	//사각형의 넓이를 구하는 클래스: 오버로딩의 활용
	
	//1. 정사각형의 넓이
	double areaRectangle(double width) {
		return width*width;
	}
	
	//2. 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width*height;
	}
}