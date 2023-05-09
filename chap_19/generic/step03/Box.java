package chap13.step03;

public class Box<T> { // T 타입 매개변수
	
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}