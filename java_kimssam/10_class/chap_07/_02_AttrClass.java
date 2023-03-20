package chap_07;
// 하나의 파일에 클래스를 여러개 생성할 수 있다. 단, 한개의 클래스에만 public키워드를 붙일 수 있다. 아니면 모든 클래스에 public키워드가 없을 수도 있다.
// 클래스의 접근 제한자로는 public, default 두 가지 뿐이다.
class Student{
	String name="홍길동";
	int age = 25;
}
public class _02_AttrClass {
	public static void main(String[] args) {
		// 인스턴스를 생성하는 new 키워드
		// 타입 객체명(변수명) = new 클래스명(생성자함수명)();
		Student student = new Student();
		
		System.out.println("이름 : " + student.name);
		System.out.println("나이 : " + student.age);
	}
}