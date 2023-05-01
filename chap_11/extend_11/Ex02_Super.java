package extend;

class Parent{
	private int dataA;
	Parent(int dataA){
		this.dataA = dataA;
	}
	void printA() {
		System.out.println("dataA: " + dataA);
	}
}

class Child extends Parent{
	private int dataB;
	Child(int dataA, int dataB){
		super(dataA);	//이 부분이 없으면 부모가 가지고 있는 매개변수 있는 생성자 함수를 사용할 수 없다!
		this.dataB = dataB;
	}
	void printB() {
		System.out.println("dataB: " + dataB);
	}
}

public class Ex02_Super {
	public static void main(String[] args) {
		Child c = new Child(10, 20);
		c.printA();
		c.printB();
	}
}