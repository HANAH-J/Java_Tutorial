package practice;

public class Practice {
	public static void main(String[] args) {
		/*
		CircleArea circleArea = new CircleArea(20);
		CircleRound circleRound = new CircleRound(20);
		
		circleArea.compute();
		circleArea.output();
		
		System.out.println("===============");
		circleRound.compute();
		circleRound.output();
		*/
		
		//객체 배열 사용
		Circle[] circles = new Circle[2];
		circles[0] = new CircleArea(20);
		circles[1] = new CircleRound(20);
		
		for(int i=0; i<circles.length; i++) {
			circles[i].compute();
			circles[i].output();
		}
	}
}