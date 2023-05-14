package chap18;

public class Ex01_dingdong implements Runnable {

	@Override
	public void run() { // 또다른 main 메서드
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