package exam04;

interface WithPrivate{
	default int getData() {
		print();
		return get()+100;
	}
	
	private void print() {
		System.out.println(get());
	}
	
	private int get() {
		return 100;
	}
}

class Test3 implements WithPrivate{
	void test() {
		int x = getData();
		System.out.println(x);
	}
}

public class Example3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
}