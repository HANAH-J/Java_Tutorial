package chap15;

//외부 클래스
public class A { 
	
	A(){System.out.println("A 인스턴스 생성");}
	
	// (인스턴스) 멤버 클래스
	class B{  
		B(){System.out.println("B 인스턴스 생성");}
		// 인스턴스 멤버 
		int f1;
		void method() {}
		// 정적 멤버
//		static int f2;
//		static void method2() {}
	}
	
	// 정적(static) 멤버 클래스
	static class C{ 
		C(){System.out.println("C 인스턴스 생성");}
		// 인스턴스 멤버 
		int f1;
		void method() {}
		// 정적 멤버
		static int f2;
		static void method2() {}
	}

	void method() {
		// 로컬 클래스
		class D{
			D(){System.out.println("D 인스턴스 생성");}
			// 인스턴스 멤버 
			int f1;
			void method() {}
			
			// 정적 멤버
//			static int f2;
//			static void method2() {}
		}
		D d1= new D();
		d1.method();
	}
	
//------------------------------------------------------
	// 외부(A) 클래스의 멤버 영역
	// 1. 내부클래스들의 인스턴스를 외부클래스가 사용가능한가?
	
	// 외부클래스 멤버 변수
	B f1 = new B(); 
	C f2 = new C();
	
	// 외부클래스 멤버 메서드
	void method2() {
		B v1 = new B();
		C v2 = new C();
	}
	
	// 외부 클래스 정적 멤버 변수
//	static B f3 = new B();
	static C f4 = new C();
	
	// 외부 클래스 정적 멤버 메서드
	static void method3() {
//		B v3 = new B();
		C v4 = new C();
	}

//---------------------------------------------------------
	// 2. 내부클래스가 외부클래스의 멤버를 가져다 사용할 수 있는가??
	// 외부클래스의 멤버
	int f5;
	void method5() {}
	
	// 외부클래스의 정적멤버
	static int f6;
	static void method6() {}
	
	// 내부 멤버 클래스가 외부 멤버를 사용
	class B1{
		void method() {
			f5=10;
			method5();
			
			f6 = 20;
			method6();
		}	
	}
	
	// 내부 정적 클래스가 외부 멤버를 사용
	static class C1{
		void method() {
//			f5=10;
//			method5();
			
			f6 = 20;
			method6();
		}
	}
	
	// 내부 로컬 클래스가 외부 멤버를 사용
	void m1() {
		class D1{
			void method() {
				f5=10;
				method5();
				
				f6 = 20;
				method6();
			}
		}
		D1 d1 = new D1();
		d1.method();
	}
	
	//-----------------------------------------------------
	// 로컬 클래스의 특징
	// 로컬 변수를 사용할 수 있는가??
	void m2(int m) {
		
		//final int var1 = 10;
		int var1 = 10;
		var1 = 20;
		
		class D2{
			void method() {
				System.out.println("값1 :"+m ); 
//				System.out.println("값2 :"+var1 ); 
			}
		}
	}
}