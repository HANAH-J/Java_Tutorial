package chap_07;

public class _16_MemberDTO {
	// DTO(Data Transfer Object), VO(Value Object) 자바빈즈
	private String name;
	private int age;
	private String id;
	
	// private데이터에 값을 변경하는 방법은 두 가지
	// 1) setter를 이용하는 방법
	
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