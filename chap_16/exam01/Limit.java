package exam01;

public interface Limit { //인터페이스도 클래스와 같이 선언 시에 default와 public이 가능하다!
	//인터페이스는 객체 사용방법을 정의한 것이므로 실행 시 데이터를 저장할 수 있는 인스턴스 또는 정적 필드를 선언할 수 없고 상수 필드만 선언가능하다!
	int MAX = 100;
	int MIN = 10;
	//인터페이스 상수는 선언과 동시에 초기값을 지정해야 한다.
	//인터페이스 상수는 public static final을 생략하더라도 컴파일 과정에서 자동으로 붙게 된다.
}