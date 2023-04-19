package var_02;

public class _02_Var02_final {
	public static void main(String[] args) {
		int a = 5;
		System.out.println(a);
		
		a=10;
		System.out.println(a);
		
		final double pi=3.141592;
		System.out.println(pi);
		
//		pi = 100; final은 변수값을 변경할 수 없다라는 값변경 금지 명령어
		
//		문자열 내부에 \가 있는 경우 \가 escape문자로 특정 문자를 포함하거나 문자열의 출력을 제어할 수 있다.
		String str = "나는 \"자바\"를 좋아한다!";
		System.out.println(str);
		String str2 = "나는 \t자바\t를 좋아한다!";
		System.out.println(str2);
		String str3 = "나는 \n자바\n를 좋아한다!";
		System.out.println(str3);
		String str4 = "나는 \\자바\\를 좋아한다!";
		System.out.println(str4);
	}
}