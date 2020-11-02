package 클래스만들기;

public class 계산기2 {
	//각 부품의 기능을 정의할 때는 메서드를 쓴다.
	//메서드의 입력 값을 잠깐 저장 할 용도로 선언된 변수 , 메서드의
	//사용과 처리의 중간 다리 역할을 해주는 변수 : 매개변수(parameter)
	public void add(int x,int y) { //void == 없다.
		//x,y 변수는 add 메서드 지역에서만 쓸 수 있는 지역변수
		//local 변수, 로컬 변수
		//지역변수는 자동초기화 x
		int result = x + y;
		System.out.println("합은 : " + result);
	}
	
	public void minus() {
	}
	
	public int mul(int x,int y) { //int > return 값의 타입
		int result = x * y;
		return result; // 30000
	}
	
	public void div() {
	}
}