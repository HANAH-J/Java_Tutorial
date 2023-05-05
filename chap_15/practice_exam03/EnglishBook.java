package exam03;

public class EnglishBook extends Book {
	private int publishedYear; //발행년도

	public EnglishBook() {}
	
	public EnglishBook(int code, String title, int publishedYear) {
		super(code, title);
		this.publishedYear = publishedYear;
	}
	
	@Override
	void printInfo() {
		System.out.println("=====영어 책 정보=====");
		System.out.println("code: " + getCode());
		System.out.println("title: " + getTitle());
		System.out.println("publishedYear: " + this.publishedYear);
	}
}