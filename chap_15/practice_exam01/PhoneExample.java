package exam01;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();
		//추상 클래스는 new 키워드로 인스턴스화 할 수 없다!
		
		SmartPhone smartphone = new SmartPhone();
		DmbPhone dmbphone = new DmbPhone();
		
		smartphone.turnOn("정우성");
		smartphone.internetSearch();
		smartphone.turnOff("정우성");
		System.out.println("===============");
		dmbphone.turnOn("이정재");
		dmbphone.watchTV();
		dmbphone.turnOff("이정재");
	}
}