package chap19;

import java.io.File;
import java.io.FileInputStream;

public class Main03 {
	public static void main(String[] args) throws Exception {
		// Ex3 : 이미지 파일로부터 데이터 읽어오기
		
		File f = new File("C:\\Users\\GREEN\\Downloads\\church.jpg");
		
		FileInputStream fis = new FileInputStream(f);
		
		int data;
		byte[] b = new byte[100];
		
		while((data = fis.read(b)) != -1) { 	// 이미지로부터 1바이트씩 읽어서
//			System.out.write(data);			// 콘솔에 출력
			System.out.println(new String(b));
		}
		fis.close();
	}
}