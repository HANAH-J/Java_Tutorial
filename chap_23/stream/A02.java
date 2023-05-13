package chap17;

import java.util.function.ToIntFunction;

public class A02 implements ToIntFunction<Student>{
	@Override
	public int applyAsInt(Student value) {
		return value.getJavaScore();
	}
}