package repeat;

public class _19_Review01_self {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<1+i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}