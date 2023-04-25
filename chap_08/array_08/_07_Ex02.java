package array;

import java.util.Arrays;

public class _07_Ex02 {

	public static void main(String[] args) {
		int[] score = new int[5];
		//Arrays.toString(배열명) 메소드를 사용하면 배열을 통째로 출력할 수 있다.
		System.out.println(Arrays.toString(score));
		
		score = new int[] {100, 90, 80, 70, 60};
		System.out.println("===============");
		for(int i=0; i<score.length; i++) { //베열명.length로 배열의 개수를 얻어온다.
			System.out.println(score[i]);
		}
		System.out.println("===============");
		System.out.println(Arrays.toString(score));
	}
}