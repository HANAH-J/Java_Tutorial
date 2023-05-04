package salaryProgram;

import java.util.Scanner;

public class Controller {
	final static int EMP_NUM = 5;
	EmpVO[] emp = new EmpVO[EMP_NUM]; // 직원 객체를 저장할 배열
	int n = 0; // 직원 수 저장
	
	void input() {
		if(n < 5) {
			Scanner sc = new Scanner(System.in);
			System.out.print("사원명 : ");
			String name = sc.next();
			System.out.print("직급 : ");
			String position = sc.next();
			System.out.print("기본급 : ");
			int basepay = sc.nextInt();
			System.out.print("수당 : ");
			int bonus = sc.nextInt();
			
			double taxrate = tax(basepay, bonus);
			int salary = salaryCalc(basepay, bonus, taxrate);
			
			emp[n] = new EmpVO(name, position, basepay, bonus, taxrate, salary);
			n++;
		} else {
			System.out.println("직원은 " + EMP_NUM + "명까지 입니다.");
		}
	}
	
	//세율을 return 하는 tax() 메소드
	double tax(int basepay, int bonus) {
		double taxrate;
		
		if((basepay + bonus) <= 2000000) {
			taxrate = 0.01;
		} if((basepay + bonus) <= 4000000) {
			taxrate = 0.02;
		} else {
			taxrate = 0.03;
		}
		return taxrate;
	}
	
	// 실제 받는 봉급을 계산하는 salaryCalc() 메소드
	int salaryCalc(int basepay, int bonus, double taxrate) {
		int salary;
		salary = (int) (basepay + bonus - (basepay + bonus) * taxrate);
		
        return salary;
	}
	
	void output() {
		System.out.println("----직원 월급 명세서----");
		System.out.println("사원명\t 직급\t 기본급\t 수당\t 세율\t 월급");
		for (int i = 0; i < n; i++) {
			System.out.println(emp[i].toString());
		}
		System.out.println(); // 줄바꿈
	}
}