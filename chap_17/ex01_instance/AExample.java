package ex01_instance;

import java.util.Scanner;

//중첩 클래스 nested class(내부 클래스 inner class): 클래스 내부에 선언한 클래스로 멤버 클래스와 로컬 클래스가 있다.
//멤버 클래스는 클래스의 멤버로서 선언되는 중첩 클래스로 1)인스턴스 멤버 클래스와 2)정적 멤버 클래스로 나뉘고 3)로컬 클래스는 메소드 내부에서 선언되는 중첩 클래스이다.
class Club {//1) 인스턴스 멤버 클래스
	String clubName;
	
	//생성자
	public Club(String clubName) {
		this.clubName = clubName;
	}
	
	//인스턴스 인스턴스 멤버 클래스
	class ClubMember{
		String name;
		
		void memberPrint() {
			Scanner sc = new Scanner(System.in);
			System.out.println(clubName + " 클럽의 반장 이름을 입력해주세요.");
			name = sc.nextLine();
			System.out.println(clubName + " 클럽의 반장 이름은 " + name + "입니다.");
		}
	}
}

public class AExample{
	public static void main(String[] args) {
		//A객체 생성 후
		Club club = new Club("탁구");
		//B객체 생성
		Club.ClubMember clubMember = club.new ClubMember();
		clubMember.memberPrint();
	}
}