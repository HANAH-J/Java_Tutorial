package classes;

public class Ex08_page305_self {
	public static void main(String[] args) {
		ex02();
//		ex01();
	}

	private static void ex02() {
//		2. 다음과 같이 Member 객체를 생성하고 싶습니다. 생성자에서 name 필드와 id 필드를 외부에서 받은 값으로 초기화할 수 있도록 Member 클래스를 작성해보세요.
		Member user1 = new Member("홍길동", "hong");
	}

	private static void ex01() {
//		1. 생성자에 대한 설명으로 맞는 것에 O표, 틀린 것에 X표 하세요.
//		① 객체를 생성하려면 생성자 호출이 반드시 필요한 것은 아니다. ( X )
//		② 생성자는 다른 생성자를 호출하기 위해 this()를 사용할 수 있다. ( O )
//		③ 생성자가 선언되지 않으면 컴파일러가 기본 생성자를 추가한다. ( O )
//		④ 매개 변수의 수, 타입, 순서가 다른 생성자를 여러 개 선언할 수 있다. ( O )
	}
	
}