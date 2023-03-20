package chap_07;

class Block{
	Block(){
		System.out.println("나는 생성자이다.");
	}
	
	{
		System.out.println("나는 non-static 블록이다."); // 인스턴스화 할 때마다 매번 생성자함수보다 먼저 호출
	}
}

public class _07_NonStatic {
	public static void main(String[] args) {
		Block b1 = new Block();
		Block b2 = new Block();
	}
}