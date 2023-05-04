package sales;

public class Print extends Sales {
	//멤버필드
	int amount;	//총금액
	
	//멤버 메소드: 총 금액을 구하는 기능
	public void setProcess() {
		//총금액 = 수량 * 단가
		amount = getQty() * getCost();
	}
	//멤버 메소드: 데이터를 출력해주는 기능
	public void getDisplay() {
		//구입금액 => 총금액 - (총금액 * 할인율)
		System.out.println(getArticle() + "\t" +(amount - (amount * getDiscount())) + "원");
	}
}