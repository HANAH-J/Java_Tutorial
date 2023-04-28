package classes;

import com.usebook.Book2;

public class Ex18_accessModifier {
	public static void main(String[] args) {
		//Book2 bk = new Book2("자바 프로그래밍"); // private
		//Book2 bk1 = new Book2("자바 프로그래밍", 25000); // protected
		//Book2 bk2 = new Book2("자바 프로그래밍", 25000, "지은이"); // default
		Book2 bk3 = new Book2("자바 프로그래밍", 25000, "지은이", "한빛미디어"); // public

//		bk.printBook();
//		bk1.printBook();
//		bk2.printBook();
		bk3.printBook();
	}
}