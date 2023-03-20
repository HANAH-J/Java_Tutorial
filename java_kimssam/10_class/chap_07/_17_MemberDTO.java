package chap_07;

public class _17_MemberDTO {
	private String name;
	private int age;
	private String id;
	
	// private 데이터에 값을 변경하는 방법은 두 가지
	// 2) 생성자를 이용하는 방법
	
	_17_MemberDTO(String name, int age, String id){
		this.name = name;
		this.age= age;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getId() {
		return id;
	}
}