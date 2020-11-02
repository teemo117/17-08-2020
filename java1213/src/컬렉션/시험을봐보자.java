package 컬렉션;

import java.util.LinkedList;

public class 시험을봐보자 {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.add("국어");
		link.add("수학");
		link.add("영어");
		link.add("컴퓨터");
		
		System.out.println("전체 시험 볼 과목 : " + link);
		for (int i = 0; i < link.size()+1; i++) {
			link.remove();
			System.out.println((i+1) + "일차 시험본 후 남은 과목 : " + link);
		}
	}

}
