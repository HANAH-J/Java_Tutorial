package method;

public class _03_Ex03_method03_computer {
	//매개변수의 개수를 알 수 없는 경우1: 매개변수를 배열 타입으로 선언
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//매개변수의 개수를 알 수 없는 경우2: 가변 인수를 사용하는 방법은 매개변수를 ...을 이용하여 값의 목록만 넘겨주는 방법
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}