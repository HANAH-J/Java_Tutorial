package chap13.step03;

public class Main {
	
	public static void main(String[] args) {
		// 1. 공통의 기능을 가진 클래스는 하나만 만들어야 한다.
		// 2. 필요한 데이터만 저장하도록 만들어야 한다.
		
		// 사과를 담기 위한 박스를 만들어 봅시다.
		// Box<Apple> aBox = new Box<Apple>();
		Box<Apple> aBox = new Box<>(); // <> 생략 가능
		aBox.set(new Apple());
		
		// aBox.set("Apple");
	}
}