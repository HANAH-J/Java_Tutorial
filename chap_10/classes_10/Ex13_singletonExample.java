package classes;

public class Ex13_singletonExample {
	public static void main(String[] args) {
//		Ex13_singleton obj1 = new Ex13_singleton();
//		Ex13_singleton obj2 = new Ex13_singleton();
		// 생성자 함수에 private 접근제한자가 있으므로 new연산자로 생성자를 호출할 수 없다.

		//클래스 변수1 = 클래스.getInstance();
		//클래스 변수2 = 클래스.getInstance();
		Ex13_singleton obj1 = Ex13_singleton.getInstance();
		Ex13_singleton obj2 = Ex13_singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체입니다.");
		}else {
			System.out.println("서로 다른 싱글톤 객체입니다.");
		}
	}
}