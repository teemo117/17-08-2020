package 클래스사용하기;

import 클래스만들기.Bbs;

public class 게시판작성 {

	public static void main(String[] args) {
		Bbs bbs = new Bbs();
		bbs.id = 1;
		bbs.title = "java";
		bbs.content = "fun java";
		bbs.writer = "park";
		bbs.write();
		System.out.println(bbs);
		
		Bbs bbs2 = new Bbs();
		bbs2.id = 2;
		bbs2.title = "jsp";
		bbs2.content = "fun jsp";
		bbs2.writer = "kim";
		bbs2.delete();
		System.out.println(bbs2);

	}

}
