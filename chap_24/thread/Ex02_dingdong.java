package chap18;

public class Ex02_dingdong extends Thread {

	@Override
	public void run() { // 별도의 메인 메서드
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("동");
		}
	}
}