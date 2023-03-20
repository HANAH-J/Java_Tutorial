package chap_07;

public class _13_StatiFinal {
	// static final : 상수라는 의미로 객체마다 존재하지 않고 클래스에만 존재하는 공용성을 가진다.
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4  * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	// 상수명은 대문자로만 주도록 약속되어 있고, 서로 다른 단어가 혼합되면 _언더바로 연결한다.
}