package extend.ex11;

class Parent {
	void eat() {
		System.out.println("부모-손님들이 부모님의 전통음식을 먹습니다.");
	}

	void pay() {
		System.out.println("부모-손님들의 계산을 해드립니다.");
	}

	void drink() {
		System.out.println("부모-손님들이 부모님이 만드신 전통차를 마십니다.");
	}
}

class Child extends Parent {
	@Override
	void eat() {
		System.out.println("자식-손님들이 자식이 전수받은 전통음식을 먹습니다.");
	}
	
	@Override
	void drink() {
		System.out.println("자식-손님들이 자식이 전수받은 전통차를 마십니다.");
	}
	
	void newSkill() {
		System.out.println("자식-자식은 새로운 기술을 이용해서 기존과는 다른 메뉴를 개발하고 판매합니다.");
	}
}

class Child2 extends Parent {
	@Override
	void eat() {
		System.out.println("자식2-손님들이 자식2가 전수받은 전통음식을 먹습니다.");
	}
	
	@Override
	void drink() {
		System.out.println("자식2-손님들이 자식2가 전수받은 전통차를 마십니다.");
	}
	
	void newSkill() {
		System.out.println("자식2-자식2는 새로운 기술을 이용해서 기존과는 다른 메뉴를 개발하고 판매합니다.");
	}
}

public class Polymorphism1 {
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.eat();
		p.drink();
		p.pay();
//		p.newSkill();
		
		System.out.println("===============");
		
		Child c = new Child();
		c.eat();
		c.drink();
		c.pay();
		c.newSkill();
		
		System.out.println("===============");
		
		Parent x = new Child();
		x.eat();
		x.drink();
		x.pay();
//		x.newSkill(); // 에러 : 자식에게 있지만 부모에게는 없는 메소드는 다형성에서는 호출이 안 된다!!
	}
}