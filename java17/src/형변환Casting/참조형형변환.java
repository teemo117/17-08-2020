package 형변환Casting;

import java.util.ArrayList;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 상속관계에서 형변환(Casting,캐스팅) 가능
		// Car(부모,수퍼), Truck(자식,서브)
		// 클래스간의 대소비교할때는 개념적으로 접근
		// 부모클래스가 크고 자식클래스가 작다.
		ArrayList list = new ArrayList();
		// 모든 타입을 묶을수 있다. 크기가 유동
		// Object(큰) < String(작) : 자동형변환
		// 업케스팅
		list.add("홍길동");
		list.add(100);
		// Object <<(upcasting) Integer << (auto boxing) int
		list.add(11.22);
		list.add(true);
		list.add('A');
		list.add(new VO()); // object의 자식이므로 업캐스팅만, object의 상속받은 형태는 다 넣을 수 있음
		System.out.println("목록 내용 : " + list);
		//업캐스팅 자동형변환 으로 String을 Object으로 형변환하여 넣은것은
		//꺼냈을 때 Object 꺼내면 String 에서 추가된 기능을 쓸 수없다
		//꺼낼 때 String으로 형 변환해야한다.
		String name = (String)list.get(0); //강제형변환, downcasting
		int age = (Integer)list.get(1); // 기본형 <-- 오토 언박싱 <--Integer<--다운캐스팅<--object
	}

}
