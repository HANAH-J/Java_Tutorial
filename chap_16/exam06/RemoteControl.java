package exam06;

//인터페이스는 객체 사용 설명서의 역할을 한다.
public interface RemoteControl {
	//상수: public static final이 생략되어 있다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드: public abstract가 생략되어 있다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}