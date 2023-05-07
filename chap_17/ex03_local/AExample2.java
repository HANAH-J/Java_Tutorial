package ex03_local;

import java.util.Scanner;

class Parent{//3)로컬 클래스는 생성자 또는 메소드 내부에서 선언된 클래스를 말한다.
	static String place;
	
	//생성자
	public Parent() {
		System.out.println("parent 객체가 생성되었습니다.");
		
		//로컬 클래스 선언
		class Child{
			Child() {
				System.out.println("child 객체가 생성되었습니다.");
			}
			
			public String playPlace() {
				Scanner sc = new Scanner(System.in);
				System.out.println("이번 주말에 놀러가고 싶은 장소는?");
				place = sc.next();
				return place;
			}
		}
		
		//로컬 객체 생성
		Child child = new Child();
		place = child.playPlace();
	}
	
	//A클래스의 메소드
	public void printPlace(String place) {
		System.out.println("당신이 이번 주말에 가고 싶은 장소는 \'" + place + "\' 이군요.");
		
		//로컬 클래스 선언
		class Child2{
			void voicePlay() {
				System.out.println("행복한 주말 되세요^0^");
			}
		}
		
		//로컬 객체 생성
		Child2 child2 = new Child2();
		child2.voicePlay();
	}
}

public class AExample2 {
	public static void main(String[] args) {
		//A객체 생성 후
		Parent parent = new Parent();
		System.out.println("==========");
		parent.printPlace(Parent.place);
	}
}