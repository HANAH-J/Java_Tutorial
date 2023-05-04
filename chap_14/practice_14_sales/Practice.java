package sales;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Print[] op = new Print[2];
		
		for(int i=0; i<2; i++) {
			op[i] = new Print();
			op[i].input();	//부모가 가지고 있는 메소드, 데이터 입력 가능
			op[i].setProcess();	//자식이 가지고 있는 메소드, 총액 계산
			System.out.println();
		}
		System.out.print("할인율: ");
		Sales.setDiscount(sc.nextDouble());
		System.out.println();
		
		System.out.println("==[판매가: 구입목록 계산서]==");
		for(int i=0; i<op.length; i++) {
			op[i].getDisplay();
		}
		System.out.println();
		System.out.println("판매건수: " + Sales.getCnt() + "건");
	}
}