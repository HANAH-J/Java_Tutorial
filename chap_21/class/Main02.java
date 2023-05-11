package chap15;

public class Main02 {

	public static void main(String[] args) {
		//일반적으로 상속을 이용해서 인스턴스를 만들어 봅시다.
		
		// 1) 일반적인 클래스 사용법
		Parent p1 = new Parent();
		p1.method();   // 부모
		
		Child c1 = new Child();
		c1.method();   // 자녀
		c1.method2();  // 나
		
		// 2) 상속을 활용한 클래스 사용법
		Parent p2 = new Child();
		p2.method();  // 자녀
//		p2.method2();

		// 3) 클래스를 만들지 않고 인스턴스를 만드는 방법
		Parent p3 = new Parent() {
			int age = 30;
			void m1() {System.out.println("나는 누구지?");}
			
			@Override
			void method() {
				System.out.println("나는 숨겨둔 자녀!!");
			}
		};
		
//		p3.age;
//		p3.m1();
		p3.method();
		
		// 4) 인터페이스로 인스턴스를 만들수 있는가? 익명구현클래스
		RemoteController rc = new RemoteController() {
			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다");
			}
		};
		
		rc.turnOn();
		rc.turnOff();
		
		// 익명 클래스를 사용하는 방법
		// 필요한 기능을 소개하고 그때그때 인스턴스를 만들어 쓸 때 사용
		//  어떤 기능을 수행할 때 필요한 기능을 그때 그때 만들어 넣어줄 때
		method(new RemoteController() {
			@Override
			public void turnOn() {
				System.out.println("라디오를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				
			}
		});
	}
	
	private static void method(RemoteController rc) {
		rc.turnOn();
	}
}