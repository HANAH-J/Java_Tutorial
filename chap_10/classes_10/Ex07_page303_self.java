package classes;
class Triangle1{
	double base;
	double height;
	
	Triangle1(){}
	
	Triangle1(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	void setTriangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	double getArea(){
		double getArea = (int) (base * height) /2;
		return getArea;
	}
	
	void output(double getArea) {
		System.out.println("삼각형의 넓이: " + getArea());
	}
}

public class Ex07_page303_self {
	public static void main(String[] args) {
		Triangle1 t1 = new Triangle1();
		t1.setTriangle(5, 12);
		System.out.println("삼각형의 넓이: " + t1.getArea());
			
		Triangle1 t2 = new Triangle1(45, 7);
		System.out.println("삼각형의 넓이: " + t2.getArea());
	}
}