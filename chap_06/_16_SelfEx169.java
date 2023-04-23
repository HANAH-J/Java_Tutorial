package conditional;

public class _16_SelfEx169 {
	public static void main(String[] args) {
//		ex01(); if(if, else if, else, 삼항연산자), switch
//		ex02(); o, o, o, x(int, char, string, int를 도출하는 조건식)
//		ex03();
		ex04();
	}

	private static void ex04() {
		System.out.println("어떤 헤택을 원하세요?");
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
		System.out.println("입니다.");
	}
}