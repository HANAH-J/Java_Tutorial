package classes;

public class Ex14_person {
	// final 필드: 값변경 금지, 최종적인 필드로 한 번 초기값이 저장되면 값을 변경할 수 없다.
	final String nation = "대한민국";
	final String personalId;
	String name;
	
	Ex14_person(String personalId, String name) {
		this.personalId = personalId;
		this.name = name;
	}
}