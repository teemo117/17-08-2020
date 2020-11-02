package 스태틱;

public class 창업 {

	public static void main(String[] args) {
		//직원 멤버변수에 데이터 저장1
		직원 human1 = new 직원("정우", "남", 21);
		//static count 변수 호출(1증가)
		System.out.println("현재 직원 수 : " + 직원.count);
		System.out.println(human1); // 오버라이딩, 출력
		System.out.println("---------");
		//직원 멤버변수에 데이터 저장2
		직원 human2 = new 직원("민지", "여", 22);
		//static count 변수 호출(1증가)
		System.out.println("현재 직원 수 : " + 직원.count);
		System.out.println(human2);
		System.out.println("---------");
		//직원 멤버변수에 데이터 저장3
		직원 human3 = new 직원("민우", "남", 23);
		//static count 변수 호출(1증가)
		System.out.println("현재 직원 수 : " + 직원.count);
		System.out.println(human3);
		//직원나이 / 직원카운트 > 평균 출력
		System.out.println("직원 평균 나이 : " + 직원.sum / 직원.count);
	
	}

}
