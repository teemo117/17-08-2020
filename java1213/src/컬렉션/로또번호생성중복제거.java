package 컬렉션;

import java.awt.List;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class 로또번호생성중복제거 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet hash = new HashSet();
		while (hash.size() < 6) {
			hash.add(r.nextInt(45) + 1);

		}
		TreeSet tree = new TreeSet();
		tree.addAll(hash);
		System.out.println(tree);
	}

}
