package casting04;

public class _01_Conversion {
	public static void main(String[] args) {
		//자동 형 변환
		int a = 10;
		double b;
		b = a;
		System.out.println(b);
		
		//자동 타입 변환에서의 예외
		byte bv = 65;
		char cv = (char)bv;
		System.out.println(cv);
		System.out.println("char타입보다 허용범위가 작은 byte타입은 char타입으로 자동타입변환할 수 없다. 따라서 에러발생");
		
		//강제 형 번환
		double d = 9.78;
		int i = (int)d;
		System.out.println(d);
		System.out.println(i);
		
	}
}