package method;

public class _05_Ex04_static {
	static int plus(int a, int b) {
		return a+b; //return: 그 즉시 호출된 곳으로 돌아가라는 명령어(return 옆에 데이터가 있으면 해당 데이터를 가지고 돌아가고 값이 없으면 그냥 돌아간다.)
	}
	
	static void output(int c) {
		System.out.println(c);
		//return; //함수의 마지막 줄에는 return 명령어가 존재해야 하는데 리턴값이 없는 리턴은 생략 가능하다!
	}
	
	public String name1 = "김철수"; //멤버변수
	public static String name2 = "김민아"; //static이 붙으면 클래스변수
	
	public void print1() {
		System.out.println();
	}
	
	public static void print2() {
//		System.out.println(name1); //static 키워드가 없이 만든 멤버변수이기 때문에 바로 가져다 사용할 수 없다!
		System.out.println(name2);
	}
	
	public static void main(String[] args) {
		int d = 0;
		d = plus(1,2);
		output(d);
	
		System.out.println("==========");
//		print1(); //static 메소드 안에서 다른 메소드를 호출하려면 그 메소드도 static이거나 객체로 생성해서 사용해야 한다.
		print2();
	}
}