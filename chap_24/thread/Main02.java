package chap18;

public class Main02 {
	public static void main(String[] args) {
		// 멀티 스레드
		// 만드는 방법 1 : Runnable 인터페이스를 이용한 방법
		//			1-1 : 익명구현객체도 가능
		
		Runnable dong = new Ex01_dingdong();
		Thread t = new Thread(dong);
		t.start(); // 또다른 스레드 동작 시작
		
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("딩");
		}
	}
}