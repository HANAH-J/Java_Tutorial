package exam03;

public class ComputerBook extends Book{
	private int stock; //재고품

	public ComputerBook() {}
	
	public ComputerBook(int code, String title, int stock) {
		super(code, title);
		this.stock = stock;
	}
	
	@Override
	void printInfo() {
		System.out.println("=====컴퓨터 책 정보=====");
		System.out.println("code: " + getCode());
		System.out.println("title: " + getTitle());
		System.out.println("stock: " + this.stock);
	}
}