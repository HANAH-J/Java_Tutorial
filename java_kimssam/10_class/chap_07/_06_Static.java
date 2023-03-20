package chap_07;

class Person{
	static int count = 10; // static변수
	String name;
	
	Person(){
		System.out.println(count);
		count++;
		System.out.println(count);
		System.out.println("====================");
	}
	
	static void printCount() { // static메소드
		System.out.println("count :" +count);
	}
}

public class _06_Static {
	public static void main(String[] args) {
		System.out.println(Person.count); // 클래스명.클래스변수명
		System.out.println("====================");
		
		Person.printCount(); // 클래스명.메소드명()
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.printCount();
		p2.printCount();
	}
}