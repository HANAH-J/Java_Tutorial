package array;

import java.util.Arrays;

public class _10_Ex05_put {

	public static void main(String[] args) {
		int data1[] = {10, 20, 30, 40, 50};
		int data2[];
		
		data2 = data1; //배열에 배열을 대입하는 방식
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		
		data1[4] = 5000; //배열을 대입했을 때에 대입된 배열이 수정되면 원본 배열도 수정된다.
		System.out.println("data1: " + Arrays.toString(data1));
		System.out.println("data2: " + Arrays.toString(data2));
	}
}