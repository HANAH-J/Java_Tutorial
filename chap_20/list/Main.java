package chap14.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		System.out.println("리스트 길이 : " + names.size());
		
		names.add("박길동");
		
		System.out.println("리스트 길이 : " + names.size());
		
		names.add("최길동");
		names.add("장길동");
		names.add("오길동");
		names.add("박길동");
		names.add("마길동");
		names.add("피길동");
		
		System.out.println("리스트 길이 : " + names.size());
		
		System.out.println("3번째 이름 : " + names.get(2));
		
		names.add(2, "김길동");
		
		System.out.println("3번째 이름 : " + names.get(2));
		System.out.println("4번째 이름 : " + names.get(3));
		
		names.set(3, "조길동");
		
		System.out.println("4번째 이름 : " + names.get(3));
	}
}