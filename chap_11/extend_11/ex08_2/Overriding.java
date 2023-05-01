package extend.ex08_2;

public class Overriding {
	public static void main(String[] args) {
		//국어, 영어, 수학 과목 성적 처리
		ScoreP sp = new ScoreP("홍길동", 90, 80, 70);
		sp.output_result();
		
		System.out.println("--------------------");
		
		ScoreC sc = new ScoreC("김철수", 91, 81, 71, 82, 92);
		sc.output_result();
	}
}