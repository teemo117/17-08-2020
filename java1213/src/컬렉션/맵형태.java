package 컬렉션;

import java.util.HashMap;
//utility(유틸리티,간단하게 사용하는 필수 라이브러리)

public class 맵형태 {
	
	public static void main(String[] args) {
		//키와 벨류로 만들어진다.
		HashMap phone = new HashMap();
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "친구");
		System.out.println(phone);
		System.out.println(phone.get(1));
		phone.put(3, "형");
		System.out.println(phone);
	}

}
