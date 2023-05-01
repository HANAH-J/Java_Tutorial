package extend.ex08;

public class ScoreC extends ScoreP{
	int mus, com;
	
	// 생성자 선언
	public ScoreC(String name, int kor, int eng, int mat, int mus, int com) {
		super(name, kor, eng, mat);
		this.mus = mus;
		this.com = com;
	};
	
	// 총점 메소드 오버라이드
	@Override
	public int getTot() {
		tot = kor + eng + mat + mus + com;
		return tot;
	}
	
	// 평균 메소드 오버라이드
	@Override
		public double getAvg() {
		avg = (double) tot / 5;
			return avg;
		}
}