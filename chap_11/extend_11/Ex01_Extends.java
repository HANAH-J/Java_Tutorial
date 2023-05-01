package extend;

public class Ex01_Extends {
	public static void main(String[] args) {
		//부모 클래스 사용
		Ex01_CalcParent parent = new Ex01_CalcParent();
		System.out.println(parent.plus(5, 7));
		System.out.println(parent.minus(5, 7));
		
		System.out.println("===============");
		//상속을 받은 자식 클래스를 사용하면 부모의 기능 뿐만 아니라 자식 자기 자신의 기능도 모두 사용이 가능하다!
		Ex01_CalcChild child = new Ex01_CalcChild();
		System.out.println(child.plus(5, 7));
		System.out.println(child.minus(5, 7));
		System.out.println(child.multifly(5, 7));
		System.out.println(child.divide(5, 7));
	}
}