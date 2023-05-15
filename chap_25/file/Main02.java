package chap19;

import java.io.File;
import java.io.FileWriter;

public class Main02 {
	public static void main(String[] args) throws Exception {
		// Ex2 : 문자열을 파일에 기록하기
		
		File f = new File("C:\\test\\test.txt");
		
		FileWriter fw = new FileWriter(f);
		
		fw.write("Hello~");
		fw.write(" World");
		fw.write("\n안녕하세요!");
		fw.write("\n반갑습니다!");
		
		fw.flush();
		fw.close();
		
		System.out.println("파일 기록이 완료되었습니다.");
	}
}