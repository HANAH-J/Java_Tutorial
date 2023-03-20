package chap_07;

class Book{
	static String title;
	static String author;
	static int ISBN;
	
	public Book(String title, String author, int ISBN){
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.printf("첫번째 생성자 호출! %s, %s, %d\n", title, author, ISBN);
	}
	
	public Book(String title, int ISBN){
		// this(매개변수의 갯수와 자료형)에 따라서 오버로딩된 다른 생성자 함수를 호출할 수 있다!
		this(title, author, ISBN); //this()로 Book(String title, String author, int ISBN)생성자를 호출, 반드시 생성자 첫줄에 한번만 사용 가능
		this.title = title;
		this.ISBN = ISBN;
		System.out.printf("두번째 생성자 호출! %s, %s, %d\n", title, author, ISBN);
	}
	
	public Book() {
		// 매개변수가 2개인 생성자 함수를 호출하면서 동시에 초기화까지 시킬 수 있다!
		this("자바탈출", 5000);
		System.out.printf("세번째 생성자 호출! %s, %s, %d\n", title, author, ISBN);
	}
	
}

public class _05_This {
	public static void main(String[] args) {
		Book javaBook = new Book("java Book", "지은이", 3333);
		Book theBible = new Book("The Bible", 5555);
		Book emptyBook = new Book();
	}
}