package chap18;

public class Main01 {
	public static void main(String[] args) {
		// 싱글 스레드로 동작되는 경우 -> 딩딩딩딩딩 동동동동동
		
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("딩");
		}
		
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("동");
		}
	}
}