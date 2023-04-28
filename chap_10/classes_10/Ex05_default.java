package classes;

class Dog {
	String name;
	String color;
	
	Dog(){}
	
	//2)생성자 함수를 이용하여 데이터를 초기화하는 방법
	Dog(String name, String color) {
		this.name = name;
		this.color  = color;
	}
	void printDog() {
		System.out.println("name: " + name);
		System.out.println("color: " + color);
	}
}

public class Ex05_default {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.printDog();
		
		//1)멤버변수에 직접 초기화하는 방법
		d.name = "뽀삐";
		d.color = "흰색";
		d.printDog();
		
		//2)매개변수가 있는 생성자 함수로 초기화하면서 객체생성
		Dog dd = new Dog("베리","회색");
		dd.printDog();
	}
}