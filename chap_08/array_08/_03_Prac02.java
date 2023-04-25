package array;

import java.util.Scanner;

public class _03_Prac02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] rank = new int[5]; //등수를 넣을 배열
		int[] score = new int[5]; //점수를 넣을 배열
		
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) + "번 점수 입력: ");
			score[i] = sc.nextInt();
			rank[i] = 1; //랭킹에는 1로 모두 초기화시킨다.
		}
		System.out.println("*** 결과 ***");
		//연산
		for(int i=0; i<score.length; i++) { //기준값
			for(int j=0; j<score.length; j++) {
				if(score[i] < score[j]) rank[i]+=1;
			}
			System.out.println(score[i] + "점 :" + rank[i] + "등");
		}
    }
}