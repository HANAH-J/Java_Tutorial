package chap_07;

public class _09_Singleton {
	// 자신의 타입인 정적 필드를 하나 선언하고 자신의 객체를 생성해 초기화한다.
	// 클래스 내부에서는 new 연산자로 생성자 호출이 가능하나 정적필드를 외부에서 값을 변경하지 못하도록 private 접근 제한자를 붙인 것이다.
	private static _09_Singleton singleton = new _09_Singleton();
	
	// 외부에서 생성자를 마음대로 생성할 수 없도록 생성자 앞에 private 접근제한자를 붙여준다.
	private _09_Singleton() {}
	
	// 외부에서 객체를 얻는 유일한 방법으로 외부에서 호출할 수 있는 정적 메소드인 getInstance()를 선언하고 정적 필드에서 참조하고 있는 자신의 객체를 리턴해준다.
	static _09_Singleton getInstance() {
		return singleton;
	}
}