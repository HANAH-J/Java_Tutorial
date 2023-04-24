package repeat;

public class _23_SelfEX_188 {
	public static void main(String[] args) {
//		random();
//		ex01();
//		ex02();
//		ex03();
		ex04();
	}
	
	private static void ex04() {
//		4. 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력해보세요. 단, x와 y는 10 이하의 자연수입니다.
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x) + (5*y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
	
	private static void ex03() {
//		3. while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 눈의 합이 5가 되는 조합은 (1, 4), (4, 1), (2, 3), (3, 2)입니다.
		while(true) {
		int num1 = (int)(Math.random()*6) + 1;
		int num2 = (int)(Math.random()*6) + 1;
		System.out.println("(" + num1 +", " + num2 + ")");
		
		if((num1+num2) == 5) break;
	}
		System.out.println("실행을 종료합니다.");
}
	
	private static void ex02() {
//		2. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요.
		int plus = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) plus += i;
		}
		System.out.println("1부터 100까지의 정수 중에서 3의 배수의 총합: " + plus);
	}
	
	private static void ex01() {
//		1. 반복문의 종류를 빈 칸에 넣어보세요.
//		반복문: ( for문 ), ( while문 ), ( do-while문 )
	}
	
	// 1~10까지의 정수 중에서 임의의 정수를 얻고 싶다!
	private static void random() {
		double num = 0;
		num = Math.random(); // 0~1 사이의 실수가 추출된다.
		System.out.println((int) (num*10) +1);
	}
}