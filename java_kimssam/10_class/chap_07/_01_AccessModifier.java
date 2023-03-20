package chap_07;

// 클래스에는 접근제한자 public, default(생략하면) 두 가지 사용 가능
public class _01_AccessModifier {// AccessModifier : 접근 제한자
	// 필드에는 4가지 접근제한자(public, protected, default, private)가 있다.
	public int x = 100; // 어디서나 접근 가능(다른 패키지에서도 접근 가능)
	protected int z = 300; // 같은 패키지 안에 있으면 접근 가능하고 다른 패키지에 속했어도 속한 클래스가 해당 클래스의 자식 클래스라면 필드와 메소드를 접근 가능
	int alpha =400; // 디폴트는 같은 클래스, 같은 패키지에서만 접근 가능
	private int y = 200; // 같은 클래스 안에서만 접근 가능
}