package quiz.chap01;

public class Ex03 {
	public static void main(String[] args) {
		// 3. 다음과 같이 출력되는 출력문을 만들어 봅시다.
		// 학생 이름 : OOO
		// 국어 점수 : 75점
		// 영어 점수 : 85점
		// 수학 점수 : 90점
		// 총    점 : 250점
		// 평    균 : 83.33점
		// 합격 여부 : 합격
		
		System.out.printf("학생 이름 : %s", "OOO\n");
		System.out.printf("국어 점수 : %d%s", 75, "점\n");
		System.out.printf("영어 점수 : %d%s", 85, "점\n");
		System.out.printf("수학 점수 : %d%s", 90, "점\n");
		System.out.printf("총    점 : %d%s", (75+85+90), "점\n");
		System.out.printf("평    균 : %.2f%s", (double)(75+85+90)/3, "점\n");
		System.out.printf("합격 여부 : %s", "합격");
	}
}