package var_02;

public class _01_Var01_data {
	public static void main(String[] args) {
//		int형 정수저장
		int num1;
		num1=10000;
		System.out.println(num1);
		
//		long형으로 정수저장
		long num2 = 1234567891234567L;
		System.out.println(num2);
		
//		short형으로 정수저장
		short num3 = 100;
		System.out.println(num3);
		
//		byte형으로 정수저장
		byte num4 = 127;
		System.out.println(num4);
		
//		double형으로 실수저장
		double num5 = 123456789123.456789;
		System.out.println(num5);
		
//		float형으로 실수저장
		float num6 = 123456789123.456789f;
		System.out.println(num6);
		
//		문자형 저장
		char ch = 'A';
		char first = 97;
		System.out.println("ch="+ ch +" , first=" + first);
		System.out.println("ch="+ (int)ch +" , first=" + (int)first);
		
//		boolean저장
		boolean x = true;
		System.out.println("불리언="+x);
	}
}