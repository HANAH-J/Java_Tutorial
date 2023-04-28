package classes;

//import com.usebook.*;
import com.usebook.Book;

public class Ex17_package {
	public static void main(String[] args) {
		//java.lang 패키지 안에 있는 클래스는 패키지명 생략이 가능하다.
		java.lang.String name = "강동원";
		int age = 43;
		java.lang.System.out.println(name + " is " + age + "years old.");
		
//		com.usebook.Book book = new com.usebook.Book("이것이 자바다", 50000);
		Book book = new Book("이것이 자바다", 50000);
	}
}