package chap18;

public class ThreadB extends Thread {
	boolean stop = false;
	boolean work = true;

	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("스레드B 동작!");
			}else {
				Thread.yield(); // 나의 스레드를 일시정지
			}
		}
		System.out.println("스레드B 종료!");
	}
}