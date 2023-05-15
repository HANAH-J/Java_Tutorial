package chap19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main04 {
	public static void main(String[] args) throws Exception {
		// Ex04 : 이미지 파일을 바이트 단위로 읽어와서
		// 제3의 폴더에 바이트 단위로 기록하는 내용
		
		File originFile = new File("C:\\Users\\GREEN\\Downloads\\church.jpg");
		File targetFile = new File("C:\\test\\test.jpg");
		
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		int readByteNo;
		byte[] readByte = new byte[100];
		
		while((readByteNo = fis.read(readByte)) != -1) {
			fos.write(readByte, 0, readByteNo);
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("이미지가 복사되었습니다.");
	}
}