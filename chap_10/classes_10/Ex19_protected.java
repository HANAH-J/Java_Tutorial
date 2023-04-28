package classes;

public class Ex19_protected {
	protected void say() {
		System.out.println("나는 부모이다.");
	}
	protected void parent() {
		say();
	}
}