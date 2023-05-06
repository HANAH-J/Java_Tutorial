package exam05;

public class SoundableExample {
	//인터페이스가 메소드의 매개변수 타입으로 사용될 수 있다. 이 경우, 메소드 호출 시에 구현 갹채를 매개값으로 대입할 수 있다!!
	static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());
	}
}