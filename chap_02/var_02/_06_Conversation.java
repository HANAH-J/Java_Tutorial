package var_02;

public class _06_Conversation {
	//conversation 변환문자
	//콘솔에 데이터 서식 지정문자를 사용하여 출력하는 방법
	public static void main(String[] args) {
		System.out.printf("%d %f %c %s %b" , 5,7.7,'A',"이름명",true);
		System.out.println("===============");
		System.out.printf("%10d %5.2f %5c %5s %5b" , 5,7.7,'A',"이름명",true);
	}
}