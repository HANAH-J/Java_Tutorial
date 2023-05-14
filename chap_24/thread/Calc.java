package chap18;

public class Calc { // 두 스레드가 공유할 객체
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		System.out.println(현재 동작중인 스레드 이름 + 현재 입력된 값);
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}