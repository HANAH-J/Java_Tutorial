package conditional;

public class _15_SelfEx169_self {
	public static void main(String[] args) {
//		ex01();
//		ex02();
//		ex03();
		ex04();
	}

	private static void ex04() {
//		4. 다음 코드를 실행했을 때 출력되는 내용을 적어보세요.
		System.out.println("어떤 혜택을 원하세요?");
		char grade = 'C';
		switch(grade) {
		case 'A': System.out.println("VVIP 혜택을 받으실 수 있습니다."); 
		case 'B': System.out.println("VIP 혜택을 받으실 수 있습니다."); break;
		case 'C': System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
		case 'D': System.out.println("일반 회원 혜택을 받으실 수 있습니다."); break;
		default: System.out.println("혜택이 없습니다.");
		}
		System.out.println("감사합니다.");
	}

	private static void ex03() {
//		3. 다음 코드를 실행했을 때 출력되는 내용을 적어보세요.
		int score = 85;
		System.out.print("등급은 ");
		if(score < 70) {
			System.out.print("D");
		}else if(score < 80) {
			System.out.print("C");
		}else if(score < 90) {
			System.out.print("B");
		}else {
			System.out.print("A");
		}
		System.out.print("입니다.");
	}

	private static void ex02() {
//		2. 조건문을 설명한 것 중 맞는 것에 O표, 틀린 것에 X표 하세요.
//		① if문은 조건식의 결과에 따라 실행 흐름을 달리할 수 있다. ( O )
//		② if문은 조건식이 true이면 블록을 실행하고 false이면 블록을 실행하지 않는다. ( O )
//		③ if문의 블록 내부에는 또 다른 if문을 사용할 수 있다. ( O )
//		④ switch문에서 사용할 수 있는 변수의 타입은 int만 가능하다. ( X ) *정수 타입 외 String 타입 가능
	}

	private static void ex01() {
//		1. 조건문의 종류를 빈 칸에 넣어보세요.
//		＊조건문: ( if문 ), ( switch문 )
	}
}