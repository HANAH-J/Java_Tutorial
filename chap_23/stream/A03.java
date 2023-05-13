package chap17;

import java.util.function.IntPredicate;

public class A03 implements IntPredicate{
	@Override
	public boolean test(int value) {
		return value >= 80;
	}
}