package chap18;

public class User2 extends Thread {
	
	private Calc c;

	public User2(Calc c) {
		setName("USER2");
		this.c = c;
	}

	@Override
	public void run() {
		c.setMemory(50);
	}
	
}