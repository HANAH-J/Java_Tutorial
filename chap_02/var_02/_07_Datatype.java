package var_02;

public class _07_Datatype {
	public static void main(String[] args) {
		char a; //선언
		a = 'c'; //초기화
				
		char b = 'b'; //선언과 초기화를 동시에
		
		char c1 = 'A', c2 = 'B', c3 = 'a';
		
		System.out.println(a);
		System.out.println(c1);
		System.out.println((char)a);
		System.out.println((int)a);
		System.out.println(c1+c2+c3);
		System.out.println((int)c1+(int)c2+(int)c3);
		System.out.println((int)c1+""+(int)c2+""+(int)c3);
		System.out.println((int)c1+(int)c2+""+(int)c3);
		System.out.println('A'+'B'+'a');
		System.out.println("A"+"B"+"a");
		//char는 정수가 들어가는 정수형 타입이다.
	}
}