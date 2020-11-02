package DB연결하기;

import java.util.Date;

public class 반환값연습사용 {

	public static void main(String[] args) {
		반환값연습 rt = new 반환값연습();
		int add1 = rt.add(10, 10);
		System.out.println(add1);
		double add2 = rt.add(10.2, 10);
		System.out.println(add2);
		int[] add3 = rt.add(10);
		for (int i : add3) {
			System.out.println(i);
		}
		
		String add4 = rt.add("콜", 10);
		System.out.println(add4);
		boolean add5 = rt.add(true);
		System.out.println(add5);
		Date date = rt.add();
		
		System.out.println(date.getDate());
		System.out.println(date.getHours());
		

	}

}
