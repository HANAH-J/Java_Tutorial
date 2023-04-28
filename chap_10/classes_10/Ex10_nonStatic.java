package classes;

class Block {
	Block() {
		System.out.println("나는 생성자이다.");
	}
	
	{
		System.out.println("나는 non=static블록이다."); //인스턴스화 할 때마다 매번 생성자 함수보다 먼저 호출된다.
	}
}

public class Ex10_nonStatic {
	public static void main(String[] args) {
		Block b1 = new Block();
		Block b2 = new Block();
	}
}