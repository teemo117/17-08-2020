package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class 컬렉션문제2 {

	public static void main(String[] args) {
		//hashmap 사용
		HashMap map = new HashMap();
		map.put(100, "김데이");
		map.put(200, "김사전");
		map.put(300, "김구조");
		map.put(400, "김자료");
		
		//수정 전 DB
		//200번 고객 탈퇴 , 300번 고객 개명
		map.remove(200);
		map.put(300, "김충성");
		TreeMap name = new TreeMap(map);
		Iterator ikey = name.keySet().iterator();
		for (int i = 0; i < 3; i++) {
			int key = (int) ikey.next();
			System.out.println(key + ":" + name.get(key));
		}
		//System.out.println(map);
	}

}
