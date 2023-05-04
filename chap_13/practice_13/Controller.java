package salary;

import java.util.Scanner;

public class Controller {
	//직원수 저장
	int n = 0;
	//직원 객체를 저장하기 위한 객체 배열을 생성
	EmpVO[] emp = new EmpVO[5];
	
	//데이터를 입력받는 함수
	void input() {
		if(n < 5) {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("연봉: ");
			int salary = sc.nextInt();
			System.out.print("부서: ");
			String department = sc.next();
			
			emp[n] = new EmpVO(name, salary, department);
			n++;
			
		}else {
			System.out.println("직원은 5명까지 입니다.");
		}
	}//input()
		
	// 데이터를 출력하는 함수
	void output() {
		for (int i = 0; i < n; i++) {
			System.out.println(emp[i].toString());
		}
	}// output()
}