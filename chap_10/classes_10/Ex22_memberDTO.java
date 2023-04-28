package classes;

public class Ex22_memberDTO {
	private String name;
	private int age;
	private String id;
	
	//private 데이터에 값을 변경하는 방법은 두가지
	//2)생성자를 이용하는 방법
	
	Ex22_memberDTO(String name, int age, String id) {
		this.name = name;
		this.age = age;
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