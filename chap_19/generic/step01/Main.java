package chap13.step01;

public class Main {
	public static void main(String[] args) {
		// 사과를 사과상자에 담아 봅시다.
		// 바나나를 바나나상자에 담아 봅시다.
		
		// 사과상자를 준비합니다.
		AppleBox ab = new AppleBox();
		// 바나나상자를 준비합니다.
		BananaBox bb = new BananaBox();
		
		// 상자에 사과를 담아볼까요?
		ab.setApple(new Apple());
		// 상자에 바나나를 담아볼까요?
		bb.setBanana(new Banana());
		
		// 상자에 담긴 사과를 꺼내 봅시다.
		Apple apple = ab.getApple();
		// 상자에 담긴 바나나를 꺼내 봅시다.
		Banana banana = bb.getBanana();
		
		// 사과가 맞는지 확인
		System.out.println(apple);
		// 바나나가 맞는지 확인
		System.out.println(banana);
	}
}