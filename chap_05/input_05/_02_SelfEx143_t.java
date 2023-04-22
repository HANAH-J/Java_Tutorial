package input;

public class _02_SelfEx143_t {
	public static void main(String[] args) {
//		ex01();
//		ex02();
//		ex03();
//		ex04();
//		ex05();
//		ex06();
//		ex08();
//		ex09();
//		ex10();
		ex11();
	}

	private static void ex11() {
		byte value1 = Byte.parseByte("10");
		int value2 = Integer.parseInt("1000");
		float value3 = Float.parseFloat("20.5");
		double value4 = Double.parseDouble("3.14159");
		System.out.printf("%d, %d, %f, %f", value1, value2, value3, value4);
		System.out.printf("\n%d + %d + %f + %f = %f", value1, value2, value3, value4, value1 + value2 + value3 + value4);
	}

	private static void ex10() {
		String str1 = 2 +3 + "";
		String str2 = 2 + "" + 3;
		String str3 = "" + 2 + 3;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

	private static void ex09() {
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
//		double test = Double.parseDouble(var4);
//		System.out.println(test);
		int result = (int) (var1*2) + (int) var3 + (int)Double.parseDouble(var4);
		System.out.println(result);	
	}

	private static void ex08() {
		double var1 = 3.5;
		double var2 = 2.7;
		int result = (int) (var1 + var2);
		System.out.println(result);
	}

	private static void ex06() {
		int x = 5;
		int y = 2;
		int result1 = x / y;
		System.out.println(result1);
		double result2 = x / y;
		System.out.println(result2);
		double result3 = (double) x / (double) y;
		System.out.println(result3);
		double result4 = (double) x / y;
		System.out.println(result4);
	}

	private static void ex05() {
		char c1 = 'a';
//		char c2 = c1 + 1;
		int c2 = c1 + 1;
		System.out.println(c2);
		System.out.println((char)c2);
	}

	private static void ex04() {
		short s1 = 1;
		short s2 = 2;
		int i1 = 3;
		int i2 = 4;
//		short result1 = s1 + s2;
		int result2 = i1 + i2;
	}

	private static void ex03() {
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
//		byte result1 = byteValue + byteValue;
//		byte형, short형은 계산 시 정수로 변환되어 계산되므로 int형 번수에 넣어야 한다.
		int result2 = 5 + byteValue;
		float result3 = 5 + floatValue;
		double result4 = 5 + doubleValue;
	}

	private static void ex02() {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		double var1 = (double) intValue;
		byte var2 = (byte) intValue;
		int var3 = (int) doubleValue;
//		char var = (char) strValue; 문자열은 캐릭터타입으로 강제변환이 안 된다.
	}

	private static void ex01() {
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue1 = byteValue;
		int inValue2 = charValue;
//		short shorValue = charValue;
		double doubleValue = byteValue;
	}
}