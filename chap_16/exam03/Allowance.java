package exam03;

public interface Allowance {
	int MONTHLY_ALLOWANCE = 300000;
	
	void in(int value, String name);
	void out(int value, String name);
}