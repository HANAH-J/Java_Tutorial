package array;

public class _06_Ex01 {
	public static void main(String[] args) {
		//배열을 선언하고 초기화하는 방법1
		int[] hong;
		hong = new int[3];
		hong[0] = 70;
		hong[1] = 80;
		hong[2] = 90;
		
		System.out.println(hong);
		
		//배열을 선언하고 초기화하는 방법2
		int[] kim = new int[3];
		kim[0] = 100;
		kim[1] = 90;
		kim[2] = 80;
		
		System.out.println(kim);
		
		//배열을 선언하고 초기화하는 방법3
		int[] lee;
//		lee = {50, 60, 70}; //배열명만 만들어놓고 나중에 배열 안의 내용을 한꺼번에 채울 때는 new int[]{} 방식으로만 가능하다!
		lee = new int[] {50, 60, 70};
		
		//배열을 선언하고 초기화하는 방법4
		int[] kang = {60, 70, 80};
		int[] shin = new int[] {60, 70, 80};
		
		double sum1=0, sum2=0, sum3=0, sum4=0, sum5=0;
		for(int i=0; i<3; i++) {
			sum1 += hong[i];
		}
		for(int i=0; i<3; i++) {
			sum2 += kim[i];
		}
		for(int i=0; i<3; i++) {
			sum3 += lee[i];
		}
		for(int i=0; i<3; i++) {
			sum4 += kang[i];
		}
		for(int i=0; i<3; i++) {
			sum5 += shin[i];
		}

		//출력
		System.out.println("홍길동의 평균: " + sum1 / hong.length);
		System.out.println("김씨의 평균: " + sum2 / kim.length);
		System.out.println("이씨의 평균: " + sum3 / lee.length);
		System.out.println("강씨동의 평균: " + sum4 / kang.length);
		System.out.println("신씨의 평균: " + sum5 / shin.length);
	}
}