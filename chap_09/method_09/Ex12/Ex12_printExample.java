package method.Ex12;

public class Ex12_printExample {
	public static void main(String[] args) {
		Ex12_printer printer = new Ex12_printer();
//		Ex12_printer.print(10);
//		Ex12_printer.print(true);
//		Ex12_printer.print(5.7);
//		Ex12_printer.print("홍길동");
		
		printer.print(10);
		printer.print(true);
		printer.print(5.7);
		printer.print("홍길동");
		
		System.out.println("static 메소드를 사용할 때 클래스명.메소드명()으로도 사용 가능하고, 해당 클래스를 객체로 인스턴스화해서 사용도 가능하다!");
	}
}