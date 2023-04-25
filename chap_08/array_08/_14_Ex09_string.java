package array;

public class _14_Ex09_string {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "java";
		String s4 = new String("Hello");
		String s5 = new String("Hello");
		
		System.out.println("===============");
		System.out.println(s1 == s2); //같은 문자열을 바로 변수에 저장했을 때에는 같은 주소를 참조하고
		System.out.println(s1 == s3);
		System.out.println(s1 == s4); //같은 문자열이지만 new라는 키워드로 객체를 생성했을 때에는 다른 주소를 참조한다.
		System.out.println(s1 == s5);
	}
}