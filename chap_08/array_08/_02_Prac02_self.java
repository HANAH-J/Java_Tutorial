package array;

import java.util.Scanner;

public class _02_Prac02_self {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[5];
		int[] rank = {1, 1, 1, 1, 1};
		
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) +"번 점수 입력: ");
			score[i] = sc.nextInt();
		}
		for(int i=0; i<score.length; i++){
            rank[i] = 1;
            for (int j=0; j<score.length; j++) {                              
                if(score[i]<score[j]) {
                	rank[i]++;
                }
              }
            }
		System.out.println("*** 결과 ***");
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]+"점 : "+rank[i]+"등");        
        }
    }
}