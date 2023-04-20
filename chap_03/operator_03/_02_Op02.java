package operator_03;

public class _02_Op02 {
	public static void main(String[] args) {
		int num =5;
		System.out.println(num);
		System.out.println(-num);
		System.out.println(+num);
		
		num = -num;
		System.out.println(num);
		
		byte b = 10;
		int c = -b; //byte, short 데이터타입은 연산을 할 때에는 정수형으로 바뀐다!
		int result = 100/b;
		System.out.println(result);
	}
}