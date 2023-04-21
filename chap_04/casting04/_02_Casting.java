package casting04;

public class _02_Casting {
	public static void main(String[] args) {
		double d = 123456789123456789L;
		System.out.println(d);
		
		float f = (float) d;
		System.out.println(f);
		
		long l = (long) f;
		System.out.println(l);
		
		int i = (int) l;
		System.out.println(i);
		
		short s = (short) i;
		System.out.println(s);
	}
}