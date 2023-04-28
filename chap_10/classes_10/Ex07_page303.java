package classes;

public class Ex07_page303 {
	public static void main(String[] args) {
		Ex07_Triangle t1 = new Ex07_Triangle();
		t1.setTriangle(5, 12);
		System.out.println("삼각형의 넓이: " + t1.getArea());
		Ex07_Triangle t2 = new Ex07_Triangle(45, 7);
		System.out.println("삼각형의 넓이: " + t2.getArea());
		
		System.out.println("*** 삼각형 넓이 구하기 ***");
//		Triangle t3 = new Triangle();
		t2.setTriangle();
	}
}