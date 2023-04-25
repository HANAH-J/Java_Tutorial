package array;

import java.util.Arrays;

public class _09_Ex04_copy {

	public static void main(String[] args) {
		//배열 복사
		int[] ori = {0, 1, 2, 3, 4, 5};
		int[] desti = {0, 10, 20, 30, 40, 50};
		
		System.arraycopy(ori, 1, desti, 2, 3);
		//arraycopy(복사하고 싶은 원본 소스, 원본 소스의 몇 번째부터 복사할건지, 최종 복제될 목표 소스, 목표 소스의 몇 번째부터 덮어쓸건지, 몇 개를 복사할건지)
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(desti));
		
		System.out.println("===============");
		int[] ori2 = {0, 1, 2, 3, 4, 5};
		int[] desti2 = new int[10];
		
		System.arraycopy(ori2, 0, desti2, 0, 6);
		System.out.println(Arrays.toString(desti2));
		desti2[6] = 6;
		System.out.println(Arrays.toString(desti2));
	}
}