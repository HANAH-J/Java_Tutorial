package extend.ex06;

public class Triangle extends Area{
	public Triangle(double base, double height) {
		super(base, height);
	}

	public double getArea() {
		return getBase() * getHeight() /2;
	}
}