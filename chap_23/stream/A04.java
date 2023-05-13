package chap17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;

public class A04 implements IntConsumer{
	List<Integer> scores = new ArrayList<>();

	@Override
	public void accept(int value) {
		scores.add(value);
	}

	public List<Integer> getScores() {
		return scores;
	}	
}