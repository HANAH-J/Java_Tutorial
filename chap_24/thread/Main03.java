package chap18;

public class Main03 {
	public static void main(String[] args) {
		// 멀티 스레드
		// 만드는 방법 2 : Thread 클래스를 상속받는 방법
		//			2-1 : 익명자식객체도 가능
		
		Thread t = new Ex02_dingdong();
		t.start();
		
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