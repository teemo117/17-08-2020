package 배열기본;

public class 배열개념 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 많은 양의 데이터를 한꺼번에 다룰 때 편리
		int [] jumsu = new int[1000];
		//int jumsu[]도 가능
		System.out.println(jumsu);
		char [] gender= new char[500];
		//int변수 1000개가 모두 이름이 jumsu
		//jumsu를 인덱스(위치값)로 구분
		//첫 번째 jumsu의 index는 0 => jumsu[0]
		//마지막 jumsu의 index는 전체개수-1 => jumsu[전체개수-1]
		//기본형 변수: 기본형 데이터만 저장된 변수
		//         => 기본형 변수는 변수 안에 해당 타입의 값이 저장
		jumsu[0] = 100;
		jumsu[10] = 200;
		jumsu[999] = 1000;
//		jumsu[1000] 존재하지않음.
		System.out.println("첫번째 값: "+jumsu[0]);
		System.out.println("11번째 값: "+jumsu[10]);
		System.out.println("마지막 값: "+jumsu[999]);
		System.out.println("500번째 값: "+jumsu[499]);	
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(i+":"+jumsu[1]);
		}
		//배열은 자동초기화가 됨! 쓰레기값에 초기값 지정된 상태
		String[] names = new String[1000];
		System.out.println(names[0]);
		System.out.println(names.length);
		System.out.println(names[names.length-1]);
	}

}
