package var_02;

public class _05_Prac02 {
public static void main(String[] args) {
	String name = "이효리";
	String department = "개발부";
	String posi = "대리";
	int pay = 1500000;
	
	System.out.println("name="+name);
	System.out.println("department="+department);
	System.out.println("posi="+posi);
	System.out.println("pay="+pay+"원");
	System.out.println("나는"+name+posi+"의 \"성격\"이 좋습니다.");
	
	System.out.println("=================");
	System.out.printf("name=%s \ndepartment=%s \n직위=%s \n급여=%d원 \n나는 %s %s의 \"성격\"이 좋습니다.", name, department, posi, pay, name, posi);
	
	
	}
}