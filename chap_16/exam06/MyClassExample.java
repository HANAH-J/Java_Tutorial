package exam06;

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("1)인터페이스가 필드 타입으로 사용될 경우, 필드에 구현 객체를 대입할 수 있다.");
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("==========");
		System.out.println("2)인터페이스가 생성자의 매개변수 타입으로 사용될 경우, new연산자로 객체를 생성할 때 구현 객체를 생성자의 매개값으로 대입할 수 있다.");
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("==========");
		System.out.println("3)인터페이스가 로컬 변수 타입으로 사용될 경우, 변수에 구현 객체를 대입할 수 있다.");
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("==========");
		System.out.println("4)인터페이스가 메소드의 매개변수 타입으로 사용될 경우, 메소드 호출 시 구현 객체를 매개값으로 대입할 수 있다.");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}