package chap16;

public class Main01 {
	public static void main(String[] args) {
		// 하나의 메서드를 하나의 데이터화
		
		// 1) 익명구현객체
		m(new Ex01() {

			@Override
			public void method() {
				System.out.println("메서드 호출");
			}
		});
		
		// 2) 람다식
		m(()->{System.out.println("메서드 호출2");});
	}

	private static void m(Ex01 e) {
		e.method();
	}
}