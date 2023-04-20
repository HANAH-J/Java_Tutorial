package operator_03;

public class _01_Op01 {
	public static void main(String[] args) {
		op1();
		op2();
		op3();
		op4();
		op5();
		op6();
		op7();
		op8();
	}

	private static void op8() {
		System.out.println("=====8.연산자의 우선순위=====");
		int a =10, b=5, c=30, d=2, e=8;
		int x =(a/b)+(c*d%e);
		System.out.println(x);
		
		boolean y = (a>b+c)&&(d<8);
		System.out.println(y);
		
		int z =100;
		z +=a+b-(c*d/e);
		System.out.println(z);
	}

	private static void op7() {
		System.out.println("=====7.할당 연산자=====");
		System.out.println("오른쪽의 연산값을 등호 왼쪽에 넣는 연산자");
		int answer =30, b=20, c=10, d=5;
		answer += b+c-d;
		System.out.println(answer);
		answer %= b-c;
		System.out.println(answer);
		
	}

	private static void op6() {
		System.out.println("=====6.논리 연산자=====");
		System.out.println("논리 연산자의 피연산자는 참, 거짓을 구분할 수 있는 항목이 와야 한다.");
		int x =100, y=200, z=5, q=3;
		System.out.println(x<y && z<q); //두 조건식이 모두 참일 때만 true 리턴
		System.out.println(x<y || z<q); //하나의 조건식만 참이어도 true 리턴
		System.out.println(!(x<y || z>q)); //결과값의 반대를 리턴
	}

	private static void op5() {
		System.out.println("=====5.관계 연산자=====");
		System.out.println("식이 옳고 그른지 판단해서 true, false를 반환하는 연산자");
		System.out.println(5>3);
		System.out.println(5<3);
		System.out.println(5==3);
		System.out.println(5!=3);
		
	}

	private static void op4() {
		System.out.println("=====3.비트 연산자=====");
		// &연산자는 피연산자가 둘다 1일때만 1이 나온다.
		int x1 = 11, y1 = 13, z1 = x1 & y1;
		System.out.println(z1);
		// |연산자는 피연산자 주에 하나라도 1이 있으면 1이 나온다.
		int x2 = 11, y2 = 13, z2 = x2 | y2;
		System.out.println(z2);
		// ^연산자는 피연산자가 하나는 0이고 하나는 1일때만 1이 나온다.
		int x3 = 11, y3 = 13, z3 = x3 ^ y3;
		System.out.println(z3);
		
		System.out.println("=====4.시프트 연산자=====");
		int x = -4;
		int a = 2;
		int r1 = x >>a;
		int r2 = x >>>a;
		System.out.println("r1:"+r1);
		System.out.println("r1:"+r2);
		
	}

	private static void op3() {
		System.out.println("=====2.단항 연산자=====");
		int num = 1;
		System.out.println(num);
		num++;
		System.out.println(num);
		++num;
		System.out.println(num);
		num--;
		System.out.println(num);
		--num;
		System.out.println(num);
		
		//후위연산
		int a1 = 100;
		int x1 = 1;
		int y1 = a1 + x1++;
		System.out.println("후위 x1=="+x1);
		System.out.println("후위 y1=="+y1);
		
		//전위연산
		int a2 = 100;
		int x2 = 1;
		int y2 = a2 + ++x2;
		System.out.println("전위 x2=="+x2);
		System.out.println("전위 y2=="+y2);
		
		//단항연산자 코드예제
		int A = 10, B;
		B = A++;
		System.out.println("A :" +A);
		System.out.println("B :" +B);
		
		int C = 10, D;
		D = ++C;
		System.out.println("C :" +C);
		System.out.println("D :" +D);
	}

	private static void op2() {
		System.out.println("=====1.2항 연산자=====");
		int n1 = 100;
		System.out.println(n1);
		n1 = n1 + 100;
		System.out.println(n1);
		n1+=100;
		System.out.println(n1);
		n1-=100;
		System.out.println(n1);
		n1*=100;
		System.out.println(n1);
		n1/=100;
		System.out.println(n1);
		n1%=3;
		System.out.println(n1);
		
		byte b1 = 10, b2 = 20, b3;
		//byte, short 자료형은 연산을 할 때 자동으로 int형으로 변환된다.
		b3 = (byte)(b1+b2);
		System.out.println(b3);
	}

	private static void op1() {
		System.out.println("=====수치연산자=====");
		System.out.println(5/2); //정수의 나눗셈 몫 구하기
		System.out.println(5.0/2.0); //실수의 나눗셈 몫 구하기
		System.out.println(5.0/2); //정수와 실수의 나눗셈 몫 구하기
//		System.out.println(5/0); //정수를 0으로 나누기
		System.out.println(5/0.0); //정수를 0.0으로 나누기
		
	}
}