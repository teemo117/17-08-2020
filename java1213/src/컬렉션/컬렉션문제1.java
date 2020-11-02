package 컬렉션;

import java.util.ArrayList;
import java.util.LinkedList;

public class 컬렉션문제1 {

	public static void main(String[] args) {
	//Linkedlist 사용
		ArrayList link = new ArrayList();
		link.add("박소정");
		link.add("김정민");
		link.add("소지현");
		link.add("김개념");
		// 1 ~ 4등 출력
		for (int i = 0; i < link.size(); i++) {
			System.out.println((i+1) + " : " + link.get(i));
		}
		//2등 반칙 탈락
		link.remove(1);
		System.out.println("---------------2등반칙탈락");
		for (int i = 0; i < link.size(); i++) {
			System.out.println((i+1) + " : " + link.get(i));
		}
		
	}

}
