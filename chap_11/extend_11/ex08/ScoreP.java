package extend.ex08;

public class ScoreP {
	String name;
	int kor, eng, mat;
	int tot;
	double avg;
	
	// 기본 생성자 선언
	public ScoreP() {}
	
	// 국어, 영어, 수학 과목 성적 생성자 선언
	public ScoreP(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// 총점 메소드
	public int getTot() {
		tot = kor + eng + mat;
		return tot;
	}
	
	// 평균 메소드
	public double getAvg() {
		avg = tot / 3;
		return avg;
	}
	// 국어, 영어, 수학 과목 성적 출력 메소드
	public void output_result() {
		System.out.println("이름 : " + name + ", 총점 : " + getTot() + ", 평균 : " + getAvg());
	}
}