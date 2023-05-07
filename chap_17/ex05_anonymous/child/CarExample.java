package ex05_anonymous.child;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		//1)익명 자식 객체를 대입하여 메소드의 필드로 사용
		car.run1();
		
		//2)익명 자식 객체가 대입된 메소드의 로컬변수로 사용
		car.run2();
		
		//3)익명 자식 객체가 대입된 매개변수로 사용
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체3이 굴러갑니다.");
			}
		});
	}
}