package classes;

class Car {
	String kind; //차종
	String color; //색상
	int year; //연식
	
	void run() {
		System.out.println(kind + " 자동차가 질주한다.");
	}
	void speedUp() {
		System.out.println(color + " 색상의 " + year + "년식 " + kind + " 자동차가 스피드를 올리고 있다.");
	}
}
public class Ex03_car {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.kind = "랜드로버";
		myCar.color = "블랙";
		myCar.year = 2020;
		
		myCar.run();
		myCar.speedUp();
		System.out.println(myCar);
		
		System.out.println("===============");
		Car yourCar = new Car();
		
		yourCar.kind = "소나타";
		yourCar.color = "화이트";
		yourCar.year = 2010;
		
		yourCar.run();
		yourCar.speedUp();
		System.out.println(yourCar);
		
		//인스턴스 변수에 다른 인스턴스를 담으면... 같은 주소값을 참조한다.
		Car myCar2 = new Car();
		System.out.println(myCar2);
		myCar = myCar2;
		System.out.println(myCar);
		System.out.println(myCar2);
		myCar2.kind = "코란도";
		myCar2.run();
		myCar.run();
	}
}