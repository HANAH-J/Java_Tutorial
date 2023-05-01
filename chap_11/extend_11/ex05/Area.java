package extend.ex05;

public class Area {
	private double base; //밑변
	private double height; //높이
	
//	public Area(double base,double height ) {
//		this.base = base;
//		this.height = height;
//	}
	
	public void setArea(double base,double height) {
		this.base = base;
		this.height = height;
	}
		
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}