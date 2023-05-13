package chap17;

import java.util.function.Predicate;

public class A01 implements Predicate<Student> {
	@Override
	public boolean test(Student t) {
		return (t.getGender() == Gender.MALE);
	}
}