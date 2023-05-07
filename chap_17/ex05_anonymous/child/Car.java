package ex05_anonymous.child;

/*
익명 자식 객체는 부모 클래스를 상속받아
new 부모생성자(매개값...){
	//필드
	//메소드
} 으로 생성되어 부모 타입의 필드, 로컬 변수, 매개변수의 값으로 대입할 수 있다.
*/

public class Car {
	//1)필드에 익명 자식 객체를 대입
	private Tire tire = new Tire() {
		//중괄호 안에는 주로 부모 메소드를 재정의하는 코드가 온다.
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체1이 굴러갑니다.");
		}
	};
	
	//1)메소드의 필드로 이용
	public void run1() {
		tire.roll();
	}
	
	//2)메소드의 로컬 변수로 이용
	public void run2() {
	//로컬 변수에 익명 자식 객체를 대입
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체2가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	//3)메소드에서 매개변수로 이용
	public void run3(Tire tire) {
		tire.roll();
	}
}