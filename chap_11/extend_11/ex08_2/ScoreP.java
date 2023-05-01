package extend.ex08_2;

public class ScoreP {
	String name;
//	int kor, eng, mat;
	int[] curri = new int[3];
	int tot;
	double avg;
	int num = curri.length;
	
	// 기본 생성자 선언
	public ScoreP() {}
	
	// 국어, 영어, 수학 과목 성적 생성자 선언
	public ScoreP(String name, int kor, int eng, int mat) {
		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.mat = mat;
		curri[0] = kor;
		curri[1] = eng;
		curri[2] = mat;
	}
	
	// 총점 메소드
	public int getTot() {
//		tot = kor + eng + mat;
		for(int score : curri) {
			tot += score;
		}
		return tot;
	}
	
	// 평균 메소드
	public double getAvg() {
//		avg = tot / 3;
		avg = tot / num;
		return avg;
	}
	// 국어, 영어, 수학 과목 성적 출력 메소드
	public void output_result() {
		System.out.println("이름 : " + name + ", 과목 수 : " + num + ", 총점 : " + getTot() + ", 평균 : " + getAvg());
	}
}