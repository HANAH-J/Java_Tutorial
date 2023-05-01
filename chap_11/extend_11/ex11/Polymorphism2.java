package extend.ex11;

class DrawData {
	private int height;
	private char outchar;
	
	public void draw() {
		
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height*2;
	}
	
	public char getOutchar() {
		return outchar;
	}
	
	public void setOutchar(char outchar) {
		this.outchar = outchar;
	}
}

class IsoTriangle extends DrawData {
	@Override
	public void draw() {
		for(int i = 1; i <= getHeight(); i++) { //층수
			for(int j = 0; j < i; j++) { // 문자 출력
				System.out.print(getOutchar());
			}
			System.out.println();
		}
		System.out.println();
	}
}

class Pyramid extends DrawData {
	@Override
	public void draw() {
		for(int i = 1; i <= getHeight(); i++) { //층수
			for(int j = 1; j <= getHeight() - i; j++) { // 공백문자 출력
				System.out.print(" ");
			}
			for(int s = 0; s <= (2*i-1); s++) { // 문자 출력
				System.out.print(getOutchar());
			}
			System.out.println();
		}
		System.out.println();
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		DrawData drawData;
		
		drawData = new IsoTriangle(); // 다형성 구현
//		drawData = new Pyramid(); // 다형성 구현
		drawData.setHeight(5);
		drawData.setOutchar('*');
		drawData.draw();
	}
}