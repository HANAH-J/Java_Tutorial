package extend.ex06;

public class Rectangle extends Area{
	public Rectangle(double base, double height) {
		super(base, height);
	}

	public double getArea() {
		return getBase() * getHeight();
	}
}