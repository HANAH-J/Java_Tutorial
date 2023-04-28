package classes;

public class Ex14_personExample {
	public static void main(String[] args) {
		Ex14_person p1 = new Ex14_person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.personalId);
		System.out.println(p1.name);
		
		//final키워드로 선언한 필드값은 한 번 초기화하면 값을 변경할 수 없다!!
//		p1.nation = "미국";
//		p1.personalId = "456789-1234567";
		p1.name = "홍삼원";
		
		System.out.println("===============");
		System.out.println(p1.nation);
		System.out.println(p1.personalId);
		System.out.println(p1.name);
	}
}