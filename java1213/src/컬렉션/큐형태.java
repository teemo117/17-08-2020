package 컬렉션;

import java.util.LinkedList;

public class 큐형태 {

	public static void main(String[] args) {
		//FIFO의 구조인 LinkList 먼저 들어온게 먼저 삭제됨
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.add("내일우유");
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		milk.remove();
		System.out.println("--------");
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		milk.remove();
		System.out.println("--------");
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		System.out.println(milk);
	}

}
