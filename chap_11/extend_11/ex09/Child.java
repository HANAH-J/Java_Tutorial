package extend.ex09;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		// super(name); // 1) 첫 번째 방법: 부모의 매개변수 name이 있는 생성자 함수를 호출하려면 사용하며 매개변수 있는 생성자 함수를 호출하면 부모에 기본 생성자 함수는 없어도 된다!
		this.name = name;
		this.studentNo = studentNo;
	}
	
	public void print() {
		System.out.println("이름: " + name + ", 학생번호: " + studentNo);
	}
	
	public static void main(String[] args) {
		Child child = new Child("김청수", 12345);
		child.print();
	}
}