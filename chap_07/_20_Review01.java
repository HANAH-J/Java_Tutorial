package repeat;

public class _20_Review01 {
	public static void main(String[] args) {
		//별트리 출력
		for(int i=1; i<=5; i++) {//층수
			for(int j=1; j<=5-i; j++) {//공백문자 출력
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++) {//별문자 출력
				System.out.print("*");
			}
			System.out.println(); //줄넘김
		}
	}
}