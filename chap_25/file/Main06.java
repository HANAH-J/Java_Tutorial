package chap19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main06 {
	public static void main(String[] args) throws Exception {
		// 인스턴스 객체를 파일로 저장하기
		String targetFileName = "C:\\\\test\\\\object.xxx";
		File targetFile = new File(targetFileName);
		
		FileOutputStream fos = new FileOutputStream(targetFile);	// 기본 스트림
		ObjectOutputStream oos = new ObjectOutputStream(fos);		// 보조 스트림
		
		ClassA classA = new ClassA();
		
		classA.field1 = 10;
		classA.field2.fieldB = 20;
		classA.field3 = 30;
		classA.field4 = 40;
		
		oos.writeObject(classA);
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(targetFile);		// 기본 스트림
		ObjectInputStream ois = new ObjectInputStream(fis);			// 보조 스트림
		
		ClassA result = (ClassA) ois.readObject();
		
		System.out.println("field1 : " + result.field1);
		System.out.println("field2 : " + result.field2.fieldB);
		System.out.println("field3 : " + result.field3);
		System.out.println("field4 : " + result.field4);
		
		ois.close();
		fis.close();
	}
}