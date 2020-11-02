package 컬렉션;

import java.util.HashSet;
import java.util.Scanner;

public class 컬렉션문제3 {

	public static void main(String[] args) {
		//한번 간 여행지 가지 않음 >> hashset(중복허용x)
		HashSet set = new HashSet();
		set.add("유럽");
		set.add("일본");
		set.add("필리핀");
		set.add("캐나다");
		set.add("미국");
		//중복 허용 하지 않음
		set.add("미국");
		System.out.println(set);
	}

}
