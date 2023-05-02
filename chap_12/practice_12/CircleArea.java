package practice;

public class CircleArea extends Circle {
	//원의 넓이를 구하는 클래스
	
	public CircleArea(int r) {
		super(r);
	}
	
	@Override
	public void compute() {
		setSize(getR() * getR() * getPI());
		//size 원의 넓이 = r * r * PI
	}
	
	@Override
	public void output() {
		System.out.println("반지름이 " + getR() + "일 때의 원의 넓이: " + getSize());
	}
}