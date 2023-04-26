package method.Ex11;

public class Ex11_memberService {
	public static boolean login(String id, String pw) {
		if(id.equals("hong") && pw.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	public static void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}