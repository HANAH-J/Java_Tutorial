package exam02;

interface Things{
	void printInfo();
	//인터페이스를 통해서 호출된 메소드는 최종적으로 객체에서 실행되므로 인터페이스의 메소드는 주로 실행 블록이 없는 추상 메소드로 선언한다.
}

//1) 인터페이스가 인터페이스를 상속받을 때
interface Book extends Things{
	void showTitle();
}

//2)클래스가 인터페이스를 상속받을 때 implements 키워드를 사용한다!
class ChildrenBook implements Book{
	private String title;
	private String author;
	
	public ChildrenBook() {}
	
	public ChildrenBook(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	@Override
	public void printInfo() {
		System.out.println("==책 정보==");
	}
	
	@Override
	public void showTitle() {
		System.out.println("title: " + title);
		System.out.println("author: " + author);
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		ChildrenBook b = new ChildrenBook("자바책", "감자바");
		b.printInfo();
		b.showTitle();
	}
}