package chap_07;

class Friend{
	String name;
	int age;
	
	Friend(){
		System.out.println("Friend 생성자 함수가 호출되었습니다.");
	}
	
	void printFriend() {
		System.out.println("내 친구 " + name + "은(는) 나이가 " + age + "세이다.");
	}
}

class Company{
	String name;
	int duration;
	
	/*
	Company(String myName, int myDuration){
		name = myName;
		duration = myDuration;
	}
	*/
	
	Company(){
		System.out.println("Company 생성자 함수가 호출되었습니다.");
	} // 매개변수 없는 생성자 함수도 매개변수 있는 생성자함수와 같이 사용하고 싶다면 직접 생성한다!
	
	// ☆☆☆☆☆매개변수를 넣어서 생성자 함수를 만들면 매개변수 없는 기본생성자함수는 자동 생성하지 않는다!
	Company(String name, int duration){
		System.out.println("매개변수 있는 Company 생성자 함수가 호출되었습니다.");
		this.name = name; // this는 클래스 자기자신을 의미한다.
		this.duration = duration;
	}
	
	void printCompany() {
		System.out.println("나 " + name + "는 이 회사에 다닌지 " + duration + "년째이다.");
	}
}

public class _03_Constructor {
	public static void main(String[] args) {
		Friend friend = new Friend(); // new키워드로 객체를 생성하면 생성자함수가 호출된다!
		friend.name="정재현";
		friend.age = 27;
		friend.printFriend();
		
		Company company = new Company("하나", 1); // 생성자를 이용해서 데이터를 초기화 하는 방법
		company.printCompany();
		
		Company company2 = new Company();
		company2.name ="감자바";
		company2.duration = 30;
		company2.printCompany();
	}
}