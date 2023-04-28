package classes;

public class Ex25_Address_self {
	private String name;
	private String num;
	private String address;
	
	public Ex25_Address_self(String name, String num, String address) {
		super();
		this.name = name;
		this.num = num;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showAddress(){
		System.out.println("이름: " + getName());
		System.out.println("전화: " + getNum());
		System.out.println("주소: " + getAddress());
	}
}