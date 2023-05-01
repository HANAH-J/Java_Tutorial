package extend;

class Parent1{
	protected int dataA;
	public Parent1() {}
	Parent1(int dataA){
		this.dataA = dataA;
	}
	void printA() {
		System.out.println("dataA: " + dataA);
	}
}

class Child1 extends Parent1{
	private int dataB;
	public Child1() {}
	Child1(int dataA, int dataB){
		this.dataA = dataA;
		this.dataB = dataB;
	}
	void printB() {
		System.out.println("dataB: " + dataB);
	}
}

public class Ex02_Super2 {
	public static void main(String[] args) {
		Child1 c = new Child1(10, 20);
		c.printA();
		c.printB();
	}
}