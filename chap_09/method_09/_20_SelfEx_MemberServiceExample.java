package method;

public class _20_SelfEx_MemberServiceExample {
	public static void main(String[] args) {
		_19_SelfEx_MemberService memberService = new _19_SelfEx_MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}