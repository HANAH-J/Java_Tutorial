package exam04;

interface WithStatic{
	int get();
	
	static int getData() { //자바 8부터는 static 키워드를 갖는 메소드를 인터페이스에서 사용할 수 있다!!
		return 100;
	}
}

public class Example2 {
	public static void main(String[] args) {
		System.out.println(WithStatic.getData());
	}
}