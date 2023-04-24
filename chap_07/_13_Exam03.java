package repeat;

public class _13_Exam03 {
	public static void main(String[] args) {
		int a = 1;
		
		do {
			System.out.println("Hello~java!");
			System.out.println(a);
			a++;
		}while (a <= 5); //조건식 뒤에는 ;이 빠지면 안 된다!
	}
}