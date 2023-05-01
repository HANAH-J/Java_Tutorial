package extend.ex08_2;

public class ScoreC extends ScoreP{
//	int mus, com;
	int[] curri = new int[5];
	int num = curri.length;
	
	// 생성자 선언
	public ScoreC(String name, int kor, int eng, int mat, int mus, int com) {
//		super(name, kor, eng, mat);
//		this.mus = mus;
//		this.com = com;
		super.name = name;
		curri[0] = kor;
		curri[1] = eng;
		curri[2] = mat;
		curri[3] = mus;
		curri[4] = com;
	};
	
	// 총점 메소드 오버라이드
	@Override
	public int getTot() {
//		tot = kor + eng + mat + mus + com;
		for(int score : curri) {
			tot += score;
		}
		return tot;
	}
	
	// 평균 메소드 오버라이드
	@Override
	public double getAvg() {
//		avg = (double) tot / 5;
		avg = (double) tot / num;
		return avg;
	}
	
	// 국어, 영어, 수학, 음악, 컴퓨터 과목 성적 출력 메소드 오버라이드
	@Override
	public void output_result() {
		System.out.println("이름 : " + name + ", 과목 수 : " + num + ", 총점 : " + getTot() + ", 평균 : " + getAvg());
	}
}