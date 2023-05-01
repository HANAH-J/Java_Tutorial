package extend.ex09;

public class Parent {
	public String name;
	
	public Parent() {}; // 2) 두 번째 방법: 부모를 상속받을 자식 클래스에서 부모 생성자를 매개변수 없이 호출하려면 기본 생성자 함수가 필요하다!
	
	public Parent(String name) {
		this.name = name;
	}
}