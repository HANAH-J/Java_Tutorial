package casting04;

import java.util.Scanner;

public class _03_SelfEx01 {
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
//		op11();
//		op12();
//		op13();
		op14();
	}
	
	private static void op14() {
		System.out.println("=====연산자 확인문제14=====");
//		14. 다음 코드를 실행했을 때 출력 결과는 무엇입니까?
		int score = 85;
		String result = (!(score>90)) ? "가" : "나";
		System.out.println(result);
	}

	private static void op13() {
		System.out.println("=====연산자 확인문제13=====");
//		13. 대입 연산자(=)와 산술 연산자(+, -, *, /)로 구성된 실행문을 대입 연산자 하나로 구성된 실행문으로 변경해보세요.
		int value = 0;
		
		value = value + 10;
		value = value - 10;
		value = value * 10;
		value = value / 10;
		
		System.out.println("value+= 10");
		System.out.println("value-= 10");
		System.out.println("value*= 10");
		System.out.println("value/= 10");
	}

	private static void op12() {
		System.out.println("=====연산자 확인문제12=====");
//		12. 다음 코드는 비교 연산자와 논리 연산자의 복합 연산식입니다. 연산식의 출력 결과를 괄호 () 속에 넣으세요.
		int x = 10;
		int y = 5;
		System.out.println( (x>7) && (y<=5) );
		System.out.println( (x%3 == 2) || (y%2 != 1) );
	}

	private static void op11() {
		System.out.println("=====연산자 확인문제11=====");
//		11. 키보드로 아이디와 패스워드를 입력받습니다. 입력 조건으로 이름은 문자열이고 패스워드는 정수입니다(패스워드는 int 타입으로 변환).문자열이고 입력된 내용을 비교해서 아이디가 "java"이고 패스워드가 12345라면 "로그인 성공"을 출력하고 그렇지 않으면 "로그인 실패"를 출력하도록 괄호에 알맞은 코드를 작성해보세요.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String name = scanner.nextLine();
		
		System.out.print("패스워드: ");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if((password == 12345)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패: 아이디 존재하지 않음");
		}
	}

	private static void op10() {
		System.out.println("=====연산자 확인문제10=====");
//		10. 반지름이 10인 원의 넓이를 구하는데 다음과 같이 var2, ".", var3 + 연산해서 원주율(π)을 얻은 다음 계산하려고 합니다. 올바른 결과가 나오도록 코드를 수정해보세요.
		int var1 = 10;
		String var2 = "3";	//*int를 String으로 수정한다.
		String var3 = "14";	//*int를 String으로 수정한다.
		String var4 = (var2 + "." + var3);	//*String 타입으로 통합한다.
		double pi = Double.parseDouble(var4);	//*String 타입을 double 타입으로 변환한다.
//		double var4 = var1 * var1 * var 2 + "." + var3;	//*삭제
		double var5 = var1 * var1 * pi;		
		System.out.println("원의 넓이: " + var5);	
	}

	private static void op9() {
		System.out.println("=====연산자 확인문제9=====");
//		9. 키보드로 두 실수를 다음과 같이 입력받습니다(Scanner이용). 입력된 첫 번째 수에 두 번째 수를 나눈 결과를 "결과:값"으로 출력하되, 두 번째 수에 0 또는 0.0이 입력되었을 경우 "결과:무한대"가 출력되도록 코드를 작성해보세요(Scanner의 next()사용).
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		String strX = scanner.nextLine();
		double x = Double.parseDouble(strX);
		
		System.out.print("두 번째 수: ");
		String strY = scanner.nextLine();
		double y = Double.parseDouble(strY);
		
		double result = x / y;
		System.out.println("결과: " + result);
	}

	private static void op8() {
		System.out.println("=====연산자 확인문제8=====");
//		8. 다음 코드는 사다리꼴의 넓이를 구하는 코드입니다. 정확히 소수 자릿수가 나올 수 있도록 괄호에 알맞은 코드를 작성하세요.
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2.0;	//*(윗변+아랫변)*높이/2 에서 소수 자릿수를 위해 2.0을 대입한다.
		System.out.println(area);
	}

	private static void op7() {
		System.out.println("=====연산자 확인문제7=====");
//		7. 다음 코드를 실행하면 출력 결과로 "10%입니다."를 기대했는데 "10%가 아닙니다."가 출력되었습니다. 어디에서 잘못 작성된 것일까요?
		float var1 = 10f;
		float var2 = var1 / 100;
		if(var2 == 0.1f) {	//*float 타입의 변수는 부동 소수점 때문에 같은 float 타입의 변수에 대입해야 같다고 인정된다.
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
	}

	private static void op6() {
		System.out.println("=====연산자 확인문제6=====");
//		6. 다음은 십의 자리 이하를 버리는 코드입니다. 변수 value의 값이 356이라면 300이 나올 수 있도록 괄호에 알맞은 코드를 작성하세요(산술 연산자만 사용).
		int value = 356;	//*정수 356 나누기 정수 100으로 3을 구하고 다시 100을 곱한다.
		System.out.println("결과: " + value / 100 * 100);
	}

	private static void op5() {
		System.out.println("=====연산자 확인문제5=====");
//		5. 다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디에서 잘못 작성된 것일까요?
		int var1 = 5;
		int var2 = 2;
		double var3 = (double) var1 / var2;	//*나누기를 실행했을 때 소수점 아래 값까지 구하기 위해 var1 혹은 var2 중 하나는 소수 타입으로 변환해야 한다.
		int var4 = (int) (var3 * var2);
		System.out.println("결과: " + var4);
	}

	private static void op4() {
		System.out.println("=====연산자 확인문제4=====");
//		4. 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 1인당 몇 개를 가질 수 있고, 몇 개가 남는지를 구하는 코드입니다. 괄호 안에 들어갈 알맞은 코드를 작성하세요.
		int pencils = 534;
		int students = 30;
		
		//학생 1명이 가지는 연필 개수
		int pencilsPerStudent = (pencils / students);
		System.out.println("학생 1명이 가지는 연필 개수: " + pencilsPerStudent);
		
		//남은 연필 개수
		int pencilsLeft = (pencils % students);
		System.out.println("남은 연필 개수: " + pencilsLeft);		
	}

	private static void op3() {
		System.out.println("=====연산자 확인문제3=====");
//		3. 다음 코드에서 stop이 true일 때 반복을 멈추고 싶습니다. 참고로 while(조건식) {}은 조건식이 true가 될 때 중괄호 {}안의 실행문을 반복해서 실행합니다. 빈칸에 들어갈 알맞은 조건식을 작성해보세요.
	}

	private static void op2() {
		System.out.println("=====연산자 확인문제2=====");
//		2. 다음 코드를 실행했을 때 출력 결과는 무엇입니까?
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);	//*후치형--이므로 11+20이 된다.
		System.out.println("결과: " + z);
	}

	private static void op1() {
		System.out.println("=====연산자 확인문제1=====");
//		1. 다음 코드에서 컴파일 에러가 발생하는 위치와 이유를 설명해보세요.
		byte b = 5;
//		b = -b;	*부호 변경 역시 연산이므로 int 타입 변수에 대입해야 한다.
		int typeb = -b;
		int result = 10 / typeb;
		System.out.println("결과: " + result);
	}
}