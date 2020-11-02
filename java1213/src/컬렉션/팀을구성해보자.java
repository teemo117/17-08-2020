package 컬렉션;

import java.util.HashSet;

public class 팀을구성해보자 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("디자이너");
		bag.add("프로그래머");
		bag.add("DB관리자");
		bag.add("DB관리자");
		System.out.println(bag);
		//중복을 허용하지 않는 HashSet
	}

}
