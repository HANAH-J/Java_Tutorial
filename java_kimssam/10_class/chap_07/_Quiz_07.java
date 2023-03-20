package chap_07;

public class _Quiz_07 {
	public static void main(String[] args) {
		_Quiz_07_Example t1 = new _Quiz_07_Example();
		t1.setTriangle(5, 12);
		System.out.println("삼각형의 넓이 : " + t1.getArea());
		
		_Quiz_07_Example t2 = new _Quiz_07_Example(45,7);
		System.out.println("삼각형의 넓이 :" + t2.getArea());
		
		System.out.println("***삼각형 넓이 구하기***");
		// Triangle t3 = new Triangle();
		t2.setTriangle();
	}
}