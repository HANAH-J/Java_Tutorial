package classes;

public class Ex26_ShopServiceExample {
	public static void main(String[] args) {
		Ex26_ShopService obj1 = Ex26_ShopService.getInstance();
		Ex26_ShopService obj2 = Ex26_ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}
}