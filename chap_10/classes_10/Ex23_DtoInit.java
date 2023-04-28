package classes;

public class Ex23_DtoInit {
	public static void main(String[] args) {
		//private 멤버변수의 값을 변경하는 방법
		
		//1) setter를 이용했을 때
		Ex21_memberDTO member = new Ex21_memberDTO();
		member.setName("김영수");
		member.setAge(30);
		member.setId("국영수");
		
		System.out.println("이름: " + member.getName());
		System.out.println("나이: " + member.getAge());
		System.out.println("별명: " + member.getId());
		
		System.out.println("===============");
		//2) 생성자를 이용했을 때
		Ex22_memberDTO member2 = new Ex22_memberDTO("김이름", 23, "김아름");
		System.out.println("이름: " + member2.getName());
		System.out.println("나이: " + member2.getAge());
		System.out.println("별명: " + member2.getId());
	}
}