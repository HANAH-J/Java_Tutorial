package exam04;

interface WithDefault{
	int get();
	
	default int getNext() {
		int value = get()+10;
		return value;
	}
}

class Test implements WithDefault{
	@Override
	public int get() { //추상 메소드의 실체 메소드를 작성할 때 주의할 점은 public 접근제한보다 더 낮은 접근제한으로 작성하면 에러가 난다.
		return 100;
	}
}

class Test2 implements WithDefault{
	@Override
	public int get() {
		return 500;
	}
}

public class Example1 {
	public static void main(String[] args) {
		Test t= new Test();
		System.out.println(t.getNext());
		Test2 t2= new Test2();
		System.out.println(t2.getNext());
	}
}