package chap17;

public class Student {
	private String name;
	private Gender gender; // 데이터 타입 중 Enum
	private int javaScore;
	
	public Student(String name, Gender gender, int javaScore) {
		this.name = name;
		this.gender = gender;
		this.javaScore = javaScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
}