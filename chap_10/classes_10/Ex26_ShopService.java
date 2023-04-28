package classes;

public class Ex26_ShopService {
	private static Ex26_ShopService singleton = new Ex26_ShopService();
	
	private Ex26_ShopService() {}
	
	static Ex26_ShopService getInstance() {
		return singleton;
	}
}