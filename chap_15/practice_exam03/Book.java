package exam03;

public abstract class Book {
	private int code; //책 코드
	private String title; //책 제목
	
	public Book() {}
	
	public Book(int code, String title) {
		super();
		this.code = code;
		this.title = title;
	}

	public int getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}
	
	abstract void printInfo();
}