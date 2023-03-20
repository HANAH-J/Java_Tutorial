package chap_07;

public class _12_FinalExample {
	public static void main(String[] args) {
		_11_Final p1 = new _11_Final("123456-123456","홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.personalId);
		System.out.println(p1.name);
		
		// final 키워드로 선언한 필드값은 한 번 초기화하면 값을 변경할 수 없다!
		// p1.nation = "미국";
		// p1.personalId = "456789-123456";
		p1.name ="홍삼원";
	}
}