package exam03;

public class Student implements Allowance, Academy{
	//인터페이스는 클래스와는 달리 다중 상속을 허용한다.
	@Override
	public void in(int value, String name) {
		System.out.printf("%s에게서 %d원 용돈을 받았습니다.\n", name, value);
	}
	@Override
	public void out(int value, String name) {
		System.out.printf("금액 %d원을 %s(으)로 지출하였습니다.\n", value, name);
	}
	@Override
	public void pay(int academy_fee, String name) {
		System.out.printf("%s의 학원비 %d원 입금 완료\n", name, academy_fee);
	}
}