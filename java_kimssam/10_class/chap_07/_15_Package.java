package chap_07;

import java.util.Scanner;

//import com.usebook.*;
import com.usebook.Book;

public class _15_Package {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// java.lang 패키지안에 있는 클래스는 패키지명 생략가능
		java.lang.String name = "강동원";
		int age = 40;
		java.lang.System.out.println(name + " is " + age + " years old.");
		
		// com.usebook.Book book = new com.usebook.Book("이것이 자바다", 50000);
		Book book = new Book("이것이 자바다", 50000);
		
	}
}