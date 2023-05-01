package extend.ex06;

public class Pratice {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10.5, 20.5);
		Triangle t = new Triangle(5, 9);
		
//		r.setArea(10.5, 20.5);
//		t.setArea(5, 9);
		
		System.out.println("사각형의 넓이: " + r.getArea());
		System.out.println("삼각형의 넓이: " + t.getArea());
		
		Area a = new Area();
		a.setBase(10);
		a.setHeight(5);
	}
}