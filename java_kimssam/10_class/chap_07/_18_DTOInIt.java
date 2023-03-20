package chap_07;

public class _18_DTOInIt {
	public static void main(String[] args) {
		// private 멤버변수의 값을 변경하는 방법
		
		// 1) setter를 이용했을 때
		_16_MemberDTO member = new _16_MemberDTO();
		member.setName("김영수");
		member.setAge(30);
		member.setId("국영수");
		
		System.out.println("이름: " + member.getName());
		System.out.println("나이: " + member.getAge());
		System.out.println("별명: " + member.getId());
		
		System.out.println("====================");
		
		// 2) 생성자 이용했을 때
		_17_MemberDTO member2 = new _17_MemberDTO("김이름", 23, "김아름");
		System.out.println("이름: " + member2.getName());
		System.out.println("나이: " + member2.getAge());
		System.out.println("별명: " + member2.getId());
	}
}
