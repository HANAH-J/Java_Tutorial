package input;

public class _01_SelfEx143_self {
	public static void main(String[] args) {
//		op1();
//		op2();
//		op3();
//		op4();
//		op5();
//		op6();
//		op7();
//		op8();
//		op9();
//		op10();
		op11();
	}

	private static void op11() {
		System.out.println("=====형 변환 확인문제11=====");
//		11. 문자열을 기본 타입으로 변환하려고 합니다. 괄호에 알맞은 코드를 작성해보세요.
		byte value1 = Byte.parseByte("10");
		int value2 = Integer.parseInt("1000");
		float value3 = Float.parseFloat("20.5");
		double value4 = Double.parseDouble("3.14159");
	}

	private static void op10() {
		System.out.println("=====형 변환 확인문제10=====");
//		10. 다음 코드를 실행했을 때 출력 결과를 적어보세요.
		String str1 = 2 + 3 + "";
		String str2 = 2 + "" + 3;
		String str3 = "" + 2 + 3;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);		
	}

	private static void op9() {
		System.out.println("=====형 변환 확인문제9=====");
//		9. var1부터 var4까지 +연산을 수행해서 int 타입 result 변수에 9가 저장되도록 괄호에 들어갈 코드를 작성해보세요.
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int) var1 + (int) (var2 + var3) +  (int)Double.parseDouble(var4);
		System.out.println(result);
	}

	private static void op8() {
		System.out.println("=====형 변환 확인문제8=====");
//		8. 두 실수를 덧셈 연산하고 소수점 이하 자리를 버리고 싶습니다. 괄호에 들어갈 코드를 작성해보세요.
		double var1 = 3.5;
		double var2 = 2.7;
		int result = (int) (var1 + var2);
		System.out.println(result);
	}

	private static void op7() {
		System.out.println("=====형 변환 확인문제7=====");
//		7. 6번 문제에서 출력되는 결과로 2.5가 나오게 하고 싶습니다. 괄호에 들어갈 코드를 작성해보세요.
		int x = 5;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);	
	}

	private static void op6() {
		System.out.println("=====형 변환 확인문제6=====");
//		6. 자바에서 /는 나눗셈 연산자입니다. x / y는 x를 y로 나누는 연산을 수행합니다. 괄호에 들어갈 타입은 무엇이며, 출력되는 결과와 그 이유를 설명해보세요.
		int x = 5;
		int y = 2;
		int result = x / y;	//*정수 나누기 정수이므로 int 타입을 사용한다.
		System.out.println(result);
	}
	
	private static void op5() {
		System.out.println("=====형 변환 확인문제5=====");
//		5. 알파벳 a의 유니코드는 97이고, b의 유니코드는 98입니다. 따라서 a의 유니코드에 1을 더하면 b의 유니코드가 되므로 다음과 같이 코드를 작성했습니다. 실행결과는 b가 출력되어야 하는데, 컴파일 에러가 발생했습니다. 무엇이 문제이고, 어떻게 수정하면 될까요?
		char c1 = 'a';
//		char c2 = c1 + 1;	*c1은 a가 출력되므로 97 + 1이 되어야 한다.
		char c2 = 97 + 1;
		System.out.println(c2);
	}

	private static void op4() {
		System.out.println("=====형 변환 확인문제4=====");
//		4. 다음 코드에서 컴파일 에러가 발생하는 위치와 이유를 설명해보세요.
		short s1 = 1;
		short s2 = 2;
		int i1 = 3;
		int i2 = 4;
//		short result1 = s1 + s2;	*int result가 되어야 한다.
		int result2 = i1 + i2;
	}

	private static void op3() {
		System.out.println("=====형 변환 확인문제3=====");
//		3. 연산식에서의 타입 변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까?
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
//		byte result1 = byteValue + byteValue;	*변환불가
		int result2 = 5 + byteValue;
		float result3 = 5 + floatValue;
		double result4 = 5 + doubleValue;	
	}

	private static void op2() {
		System.out.println("=====형 변환 확인문제2=====");
//		2. 강제 타입 변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까?
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		double var1 = (double) intValue;
		byte var2 = (byte) intValue;
		int var3 = (int) doubleValue;
//		char var4 = (char) strValue;	*변환불가
	}

	private static void op1() {
		System.out.println("=====형 변환 확인문제1=====");
//		1. 자동 타입 변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까?
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue1 = byteValue;
		int intValue2 = charValue;
//		short shortValue = charValue;	*변환불가
		double doubleValue = byteValue;
	}
}