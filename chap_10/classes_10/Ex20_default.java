package classes;

class Data{
	public int x;
	private int y;
	protected int z;
	int alpha;
}

public class Ex20_default {
	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
//		data.y = 20; //서로 다른 클래스에 있는 private접근제한자의 필드는 접근 불가능
		data.z = 30;
		data.alpha = 40;
		
		Ex00_AccessModifier dataplus = new Ex00_AccessModifier();
		dataplus.x = 10;
//		dataplus.y = 20; //서로 다른 클래스에 있는 private접근제한자의 필드는 접근 불가능
		dataplus.z = 30;
		dataplus.alpha = 40;
	}
}