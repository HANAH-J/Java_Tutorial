package extend.ex10;

public class Overriding {
	public static void main(String[] args) {
		//육군
		Army army = new Army("육군");
		army.attack();
		army.tank();
		System.out.println("---------------");
		
//		//해군
		Navy navy = new Navy("해군");
		navy.attack();
		navy.nucleus();
		System.out.println("---------------");
		
		//공군
		AirForce airForce = new AirForce("공군");
		airForce.attack();
		airForce.bombing();
	}
}