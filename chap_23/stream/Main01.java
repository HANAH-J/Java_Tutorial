package chap17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

public class Main01 {
	static List<Integer> scores = new ArrayList<>();
	
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 짝수들의 합계 : 일반적으로 사용하는 계산법
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("합계 : " + sum);
		
		// 스트림
		// 1단계 : 배열을 스트림으로 보내기 위한 준비단계
		IntStream stm1 = Arrays.stream(arr);
		
		// 2단계 : 스트림 중간연산을 거치는 단계(중복가능)
		IntStream stm2 = stm1.filter((x) -> {return x % 2 == 0;});
		
		// 3단계 : 결과를 출력하는 최종연산을 거치는 단계(하나만)
		int sum1 = stm2.sum();
		
		System.out.println("합계 : "+ sum1);
		
		// 스트림의 강점 : 메서드 체이닝
		int sum2 = Arrays.stream(arr)
						 .filter((x) -> {return x % 2 == 0;})
						 .sum();
		
		System.out.println("합계 : "+ sum2);
		
		// 리스트를 스트림 객체로 전환하는 방법
		List<String> names = new ArrayList<>();
		
		names.add("뽀로로");
		names.add("에디");
		names.add("패티");
		names.add("포비");
		names.add("루피");
		
//		Stream<String> nameStream = names.stream();
		
		// 중간단계 매핑
//		IntStream nameStream1 = nameStream.mapToInt((name) -> {return name.length();});
//		
//		nameStream.mapToInt(new ToIntFunction<String>() {
//			@Override
//			public int applyAsInt(String value) {
//				return value.length();
//			}
//		});
		
		// 학생 객체를 담은 리스트에서 성별이 남성인 학생의 자바점수를 추출하세요.
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("뽀로로", Gender.MALE, 78));
		list.add(new Student("에디", Gender.MALE, 97));
		list.add(new Student("패티", Gender.FEMALE, 89));
		list.add(new Student("포비", Gender.MALE, 83));
		list.add(new Student("루피", Gender.FEMALE, 79));
		
		// 1. 스트림 + 람다식
		list.stream()
			.filter((student) -> {return student.getGender() == Gender.MALE;})
			.mapToInt((student) -> {return student.getJavaScore();})
			.filter((score) -> {return score >= 80;})
			.forEach((s) -> {scores.add(s);});
		
		// 2. 스트림 + 익명구현객체
		list.stream().filter(new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				if (t.getGender() == Gender.MALE) {
					return true;
				} else {
					return false;
				}
			}
			
		}).mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getJavaScore();
			}

		}).filter(new IntPredicate() {
			@Override
			public boolean test(int value) {
				if (value >= 80) {
					return true;
				} else {
					return false;
				}
				// return value >= 80;
			}
			
		}).forEach(new IntConsumer() {
			@Override
			public void accept(int value) {
				scores.add(value);
			}
			
		});
		
		// 3. 스트림 + 일반구현객체
		A04 a04 = new A04();
		
		list.stream()
			.filter(new A01())
			.mapToInt(new A02())
			.filter(new A03())
			.forEach(a04);
		
		scores = a04.getScores();
		
		// 4. 조건과 반복
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getGender() == Gender.MALE
					&& list.get(i).getJavaScore() >= 80) {
				scores.add(list.get(i).getJavaScore());
			}
		}
	}
}