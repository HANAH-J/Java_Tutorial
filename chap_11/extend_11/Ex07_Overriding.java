package extend;

class Parent3{
	void print() {
		System.out.println("부모를 출력");
	}
	
	void test(int x) {
		System.out.println("부모: " + x + "번 시험을 보앗다.");
	}
}

class Child3 extends Parent3{
	@Override
	void print() {
		System.out.println("자식에서 부모를 출력");
		super.print(); //부모가 가지고 있는 원래의 메소드 기능을 사용하고 싶다면 super키워드.메소드이름(); 으로 호출이 가능하다!
	}
	
	@Override
	void test(int x) {
		System.out.println("자식: " + x + "번 시험을 보앗다.");
	}
}

public class Ex07_Overriding {
	public static void main(String[] args) {
		Parent3 p = new Parent3();
		p.print();
		p.test(10);
		System.out.println("===============");
		
		Child3 c = new Child3();
		c.print();
		c.test(20);
	}
}