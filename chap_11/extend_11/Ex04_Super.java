package extend;

class Parent2 {
	String data = "부모";
	
	void print() {
		System.out.println("나는 부모다!");
	}
}

class Child2 extends Parent2 {
	String data = "자식";
	String data2 = super.data;	//super키워드를 이용해서 부모의 필드 데이터를 가져올 수 있다.
	void call() {
		System.out.println("나는 자식이다!");
	}
	
	@Override
	void print() {
		System.out.println("자식이 오버라이드 한 print 메소드이다!");
	}
}

public class Ex04_Super {
	public static void main(String[] args) {
		Child2 c  = new Child2();
		System.out.println(c.data);
		System.out.println(c.data2);
		c.call();
		c.print();
		
		Parent2 p = new Parent2();
		p.print();
	}
}