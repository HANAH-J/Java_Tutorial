package repeat;

public class _16_Exam06 {
	public static void main(String[] args) {
//		//2단
//		int i1;
//		for(i1=1; i1<=9; i1++) {
//			System.out.println("2 * " + i + " = " + 2*i);
//		}
		
		//2~9단
		int i2;
		int k;
		for(i2=2; i2<=9; i2++) {
			System.out.println("=====" + i2 + "단=====");
			for(k=1; k<=9; k++) {
				System.out.println(i2 + " X " + k + " = " + i2*k + "\t");
			}
		}
	}
}