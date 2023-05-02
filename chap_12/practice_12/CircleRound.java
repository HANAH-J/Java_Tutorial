package practice;

public class CircleRound extends Circle {
	//원의 둘레를 구하는 클래스
	public CircleRound(int r) {
		super(r);
	}
	
	@Override
	public void compute() {
		setSize(getR() * 2 * getPI());
		//size 원의 둘레 = r * 2 * PI
	}
	
	@Override
	public void output() {
		System.out.println("반지름이 " + getR() + "일 때의 원의 둘레: " + getSize());
	}
}