package 클래스만들기;

public class 내방 {
	public static void main(String[] args) {
		휴대폰 p1 = new 휴대폰();
		//color, size, company 맴버변수 복사 => 자동초기화
		//p1 변수 생성 => 맴버변수들을 가르키는 주소가 들어감
		//. => 접근 연산자
		p1.color = "흰색";
		p1.size = 7;
		p1.company = "삼성";
		System.out.println("p1휴대폰의 색은 "+p1.color);
		System.out.println("p1휴대폰의 크기는 "+p1.size);
		System.out.println("p1휴대폰의 회사는 "+p1.company);
		p1.문자하다();
		System.out.println("---------------");
		휴대폰 p2 = new 휴대폰();
		p2.color = "빨간색";
		p2.size = 11;
		p2.company = "애플";
		System.out.println("p2휴대폰의 색은 "+p2.color);
		System.out.println("p2휴대폰의 크기는 "+p2.size);
		System.out.println("p2휴대폰의 회사는 "+p2.company);
		p2.전화하다();
		System.out.println("---------------");
		System.out.println("---------------");
		강아지 dog1 = new 강아지();
		dog1.color = "베이지색";
		dog1.var = "웰시코기";
		System.out.println("강아지1의 색은 "+dog1.color);
		System.out.println("강아지1의 종류는 "+dog1.var);
		dog1.손();
		dog1.반려();
		System.out.println("---------------");
		강아지 dog2 = new 강아지();
		dog2.color = "까만색";
		dog2.var = "시바";
		System.out.println("강아지2의 색은 "+dog2.color);
		System.out.println("강아지2의 종류는 "+dog2.var);
		dog2.빵야();
		dog2.반려();
		
	}
}
