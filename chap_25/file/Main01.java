package chap19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main01 {
	public static void main(String[] args) throws Exception {
		// Ex1 : 문자로 된 파일로부터 데이터 읽어오기
		File f = new File("D:\\풀스택\\BACK\\자바\\quiz\\src\\quiz\\chap01\\Ex01.java");
		
		FileReader fr = new FileReader(f);
		
		int ch;
		
		char[] c = new char[100];	// 100개의 글자를 담을 수 있는 트럭
		
		while((ch = fr.read(c)) != -1) {
			String str = new String(c, 0, ch);	//트럭으로 가져온 데이터를 합치는 코드
			
			System.out.print(str);
		}
		fr.close();
	}
}