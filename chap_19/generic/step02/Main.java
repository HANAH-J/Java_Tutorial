package chap13.step02;

public class Main {

	public static void main(String[] args) {
		// 사과를 상자에 담아 봅시다.
		// 바나나를 상자에 담아 봅시다.
		
		// 사과를 담기 위한 박스를 준비합니다.
		Box aBox = new Box();
		// 바나나를 담기 위한 박스를 준비합니다.
		Box bBox = new Box();
		
		// 박스에 사과를 담아 봅시다.
		aBox.setObj(new Apple());
		// 박스에 바나나를 담아 봅시다.
		bBox.setObj(new Banana());
		
		// 박스에서 사과를 꺼내 봅시다.
		Apple apple = (Apple)aBox.getObj();
		// 박스에서 바나나를 꺼내 봅시다.
		Banana banana = (Banana)bBox.getObj();

		// 사과가 맞는지 확인
		System.out.println(apple);
		// 바나나가 맞는지 확인
		System.out.println(banana);
		
		//--------------------
		// 에러
		// 사과상자를 준비합니다.
		Box aBox2 = new Box();
		
		// "사과"를 담아 봅시다.
		aBox2.setObj("Apple");
		
		// "사과"를 꺼내서 출력해봅시다.
		System.out.println(aBox2.getObj());
	}

}