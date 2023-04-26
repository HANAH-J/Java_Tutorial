package method.Ex11;

import java.util.Scanner;

public class Ex11_memberServiceExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex11_memberService memberService = new Ex11_memberService();
//		boolean result = memberService.login("hong", "12345");
		
		System.out.print("아이디를 입력해 주세요: ");
		String id = sc.next();
		System.out.print("비밀번호를 입력해 주세요: ");
		String pw = sc.next();
		
		boolean result = memberService.login(id, pw);
		
		if(result) {
			System.out.println("로그인 되었습니다.");
//			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}