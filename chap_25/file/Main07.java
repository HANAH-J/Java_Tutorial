package chap19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Main07 {
	public static void main(String[] args) throws Exception {
		String targetFileName = "C:\\\\test\\\\object.xxx";
		File targetFile = new File(targetFileName);
		
		FileInputStream fis = new FileInputStream(targetFile);		// 기본 스트림
		ObjectInputStream ois = new ObjectInputStream(fis);			// 보조 스트림
		
		ClassA result = (ClassA) ois.readObject();
		
		System.out.println("field1 : " + result.field1);
		System.out.println("field2 : " + result.field2.fieldB);
		System.out.println("field3 : " + result.field3);
		
		ois.close();
		fis.close();
	}
}