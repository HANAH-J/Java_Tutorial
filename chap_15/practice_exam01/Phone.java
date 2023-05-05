package exam01;

//클래스 앞에 abstract 키워드를 붙이면 추상 클래스가 된다.
//추상 클래스 그 자체로는 객체 생성이 불가능하다.
//장점 1) 추상 클래스는 자식을 위해 존재하는 클래스로 실체 클래스를 설계하는 사람이 여러 사람일 때, 추상 클래스를 상속받아 필드와 메소드 이름을 통일할 수 있다.
//장점 2) 실체 클래스를 작성할 때 시간을 절약할 수 있다.
public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone() {}
	
	//메소드
	public void turnOn(String owner) {
		System.out.println(owner + "(이)가 폰 전원을 켭니다.");
	}
	public void turnOff(String owner) {
		System.out.println(owner + "(이)가 폰 전원을 끕니다.");
	}
}