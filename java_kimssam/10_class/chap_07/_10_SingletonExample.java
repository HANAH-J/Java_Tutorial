package chap_07;

public class _10_SingletonExample {
	public static void main(String[] args) {
		// Ex13_singleton obj1 = new Ex13_singleton();
		// 생성자 함수에 private접근제한자가 있으므로 new연산자로 생성자를 호출할 수 없다.
		
		// 사용법 : 클래스 변수1 = 클래스.getInstance();
		_09_Singleton obj1 = _09_Singleton.getInstance();
		_09_Singleton obj2 = _09_Singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체입니다.");
		} else {
			System.out.println("다른 싱글톤 객체입니다.");
		}
	}
}