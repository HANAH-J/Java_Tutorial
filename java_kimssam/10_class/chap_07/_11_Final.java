package chap_07;

public class _11_Final {
	// final 필드 : 값변경 금지, 최종적인 필드로 한번 초기값이 저장되면 값을 변경할 수 없다.
	final String nation ="대한민국";
	final String personalId;
	String name;
	
	_11_Final(String personalId, String name){
		this.personalId = personalId;
		this.name = name;
	}
}