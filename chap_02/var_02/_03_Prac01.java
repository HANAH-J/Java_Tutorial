package var_02;

public class _03_Prac01 {
public static void main(String[] args) {
	int num1=50;
	double num2=178.50;
	char ch='A';
	boolean b = true;
	
	System.out.println("num1 = "+num1);
	System.out.println("num2 = "+num2);
	System.out.println();
	System.out.println("ch =" + ch);
	System.out.println("b =" + b);
	
//	같은 결과 나오도록 코드 추가
	
	System.out.print("==============");
	System.out.printf("num1 =%d" , num1);
	System.out.println();
	System.out.printf("num2 = %.2f\n\n" , num2);
	System.out.printf("ch = %c\n" , ch);
	System.out.printf("b = %b" , b);
	}
}