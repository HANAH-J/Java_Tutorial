package method;

public class _04_Ex03_method03_computerExample {
	public static void main(String[] args) {
		//타입명 변수명 = new 클래스명(); => 해당 클래스의 객체를 생성
		_03_Ex03_method03_computer myCom = new _03_Ex03_method03_computer();
		
		//1. 매개변수로 배열을 사용하는 방법
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println(result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		//2. 매개변수로 가변인수를 사용하는 방법
		int result3 = myCom.sum2(1,2,3);
		System.out.println(result3);
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println(result4);
	}
}