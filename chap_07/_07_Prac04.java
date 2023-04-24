package repeat;

public class _07_Prac04 {
	public static void main(String[] args) {
		//*트리 출력 문제
		for(int i=1; i<=4; i++) { //층수
			for(int j=0; j<i; j++) { //별의 개수
				System.out.print("*");
			}
			System.out.println(); //줄넘김
		}
	}
}