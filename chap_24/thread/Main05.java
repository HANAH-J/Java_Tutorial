package chap18;

public class Main05 {
	public static void main(String[] args) {
		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();
		
		System.out.println("A, B 스레드 시작!");
		tA.start();
		tB.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		tA.work = false;
		System.out.println("스레드A 작동 중지!");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		tA.work = true;
		System.out.println("스레드A 작동 시작!");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		tA.stop = true;
		tB.stop = true;
	}
}