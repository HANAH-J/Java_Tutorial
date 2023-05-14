package chap18;

public class User1 extends Thread {
	
	private Calc c;

	public User1(Calc c) {
		setName("USER1");
		this.c = c;
	}
	
	@Override
	public void run() {
		c.setMemory(1000);
	}

}