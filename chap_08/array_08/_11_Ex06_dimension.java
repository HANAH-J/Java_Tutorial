package array;

public class _11_Ex06_dimension {
	public static void main(String[] args) {
		//학급 성적을 위한 다차원 배열
		int[][] score = new int[3][2]; //크기가 3개인 1차원 배열을 2개 만듦
		String[] name = {"홍길동", "김철수", "이영희"};
		
		//홍길동의 점수
		score[0][0] = 70;
		score[0][1] = 80;
		
		//김철수의 점수
		score[1][0] = 100;
		score[1][1] = 90;
		
		//이영희의 점수
		score[2][0] = 100;
		score[2][1] = 100;
		
		System.out.println("score.length: " + score.length);
		System.out.println("score[0].length: " + score[0].length);
		System.out.println("score[1].length: " + score[1].length);
		System.out.println("score[2].length: " + score[2].length);
		
		//2차원 배열의 총점과 평균 구하기
		for(int i=0; i<score.length; i++) { //행 0,1,2
			int sum = 0;
			int avg = 0;
			
			//학생 1명의 총점과 평균 구하기
			for(int j=0; j<score[i].length; j++) { //열 0,1
				sum += score[i][j];
			}
			avg = sum/score[i].length;
			
			System.out.printf("%s, 총점 = %d, 평균 = %d\n", name[i], sum, avg);
		}
	}
}