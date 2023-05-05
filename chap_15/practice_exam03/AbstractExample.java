package exam03;

public class AbstractExample {
	public static void main(String[] args) {
		Book book[] = {
			new ComputerBook(1111, "자바", 15), 
			new EnglishBook(2000, "토플", 2019),
			new EnglishBook(2001, "토익", 2023),
			new ComputerBook(5000, "파이썬", 20),
			new EnglishBook(2010, "영어회화", 2023)
		};
		
		for(Book bk : book) {
			bk.printInfo();
			System.out.println();
		}
	}
}