package classes;

class Member {
	public String name;
	public String id;
	
	Member(String name, String id) {
		this.name = name;
		this.id = id;
		System.out.println(name + ", " + id);
	}
}

public class Ex08_page305 {
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
	}
}