package classes;

public class Ex21_memberDTO {
	//DTO(data transfer object), VO(value object) 자바빈즈
	private String name;
	private int age;
	private String id;
	
	//private 데이터에 값을 변경하는 방법은 두가지
	//1)setter를 이용하는 방법
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}