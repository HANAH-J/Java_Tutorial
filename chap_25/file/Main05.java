package chap19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main05 {
	public static void main(String[] args) throws Exception {
		// 기본 타입의 데이터를 기록하는 방법 -> 파일로 기록
		
		String targetFileName = "";
		File targetFile = new File("C:\\test\\data.xxx");
		
		FileOutputStream fos = new FileOutputStream(targetFile);	// 기본 스트림
		DataOutputStream dos = new DataOutputStream(fos);			// 보조 스트림
		
		dos.writeInt(1);
		dos.writeUTF("둘리");
		dos.writeDouble(79.35);
		
		dos.writeInt(2);
		dos.writeUTF("도우너");
		dos.writeDouble(82.13);
		
		dos.flush();
		dos.close();	// 닫을 때도 보조스트림부터 닫는다.
		fos.close();
		
		// 데이터 읽어오기
		FileInputStream fis = new FileInputStream(targetFile);		// 기본 스트림
		DataInputStream dis = new DataInputStream(fis);				// 보조 스트림
		
		for(int i=0; i<2; i++) {	// 두 그룹의 데이터 출력
			int num = dis.readInt();
			String name = dis.readUTF();
			double score = dis.readDouble();
			
			System.out.println(num + " : " + name + " : " + score);
		}
		dis.close();
		fis.close();
	}
}