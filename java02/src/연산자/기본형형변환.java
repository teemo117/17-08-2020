package 연산자;

public class 기본형형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100; //int는 -21억~21억, 4바이트
		byte y = 120; //byte -128~127, 1바이트
		//큰<-작: 자동형변환
		x = y;
		System.out.println("x: "+x);

		int z = 127;
		//작<-큰: 강제형변환 ()를 사용
		//(자르고싶은 데이터의 형태)변수명
		byte w = (byte)z;
		System.out.println(w);
	
		//int q = 1000;
		//byte t = q;
		//강제형변환하는 경우는 변환하고자하는 범위에
		//값이 들어가야 한다.
		
		byte a = 100;
		int b = a;
		System.out.println(b);
		//자동형변환
		
		//int x = 300;
		//byte y = x;
		//형변환불가
		
		double c = 400;
		int d = (int)c;
		System.out.println(d);
		//강제형변환
		
		int f = 400;
		double g = f;
		System.out.println(g);
		//자동형변환
	}

}
