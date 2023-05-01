package extend.ex12;

class Car {
	private String color;

	public Car() {}
	
	public Car(String color) {
		super();
		this.color = color;
	}
	
	void drive() {
		System.out.println(color + "색 차를 운전중입니다.");
	}
}

class Sedan extends Car {
	private int seats;
	
	Sedan(String color, int seats) {
		super(color);
		this.seats = seats;
	}
	void showSeats() {
		System.out.println("이 차는 " + seats + "개의 좌석이 있다.");
	}
}

class Truck extends Car {
	private int wheel;
	
	Truck(String color, int wheel) {
		super(color);
		this.wheel = wheel;
	}
	void showWheel() {
		System.out.println("이 트럭은 바퀴가 " + wheel + "개 달린 트럭이다.");
	}
}

public class InstanceOf {
	public static void main(String[] args) {
		Car myCar = new Sedan("흰", 4);
		Car yourCar = new Truck("블루", 8);
		
		myCar.drive();
		yourCar.drive();
		
//		myCar.showSeats();
//		yourCar.showWheel();
		
		if(myCar instanceof Sedan) {
			boolean bool = myCar instanceof Sedan;
			System.out.println(bool);
		}
		if(yourCar instanceof Truck) {
			boolean bool = yourCar instanceof Truck;
			System.out.println(bool);
		}
		
		// 모든 부모 타입을 자식으로 강제 변환할 수 있는 것이 아니다. 자식 타입이 부모 타입으로 자동 타입 변환 후, 다시 자식 타입으로 변환을 원할 때 강제 타입 변환을 사용할 수 있다!!
		// 부모변수명 instanceof 자식생성자함수명 => 부모 타입이 자식의 인스턴스 타입이다 => boolean으로 리턴
		if(myCar instanceof Sedan) {
			((Sedan) myCar).drive();
			((Sedan) myCar).showSeats();
		}
		if(yourCar instanceof Truck) {
			((Truck) yourCar).drive();
			((Truck) yourCar).showWheel();
		}
	}
}