package chap19;

import java.io.Serializable;

public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	static int field3;		// 정적 멤버는 직렬화 불가능
	transient int field4;	// 직렬화 제외
}