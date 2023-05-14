package chap18;

public class Main04 {
	public static void main(String[] args) {
		// 스레드 우선순위
		
		for(int i=0; i<10; i++) { // 10개의 스레드를 만들 예정
			Thread t = new Thread() {
				@Override
				public void run() {
					for(int i=0; i<99999999; i++) {}
					System.out.println(getName());
				}
			};
			t.setName("Thread: " + i);
			
			if(i != 10) {
				t.setPriority(1);
			}else {
				t.setPriority(10);
			}
			t.start();
		}
	}
}