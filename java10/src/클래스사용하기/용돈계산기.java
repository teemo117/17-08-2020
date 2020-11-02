package 클래스사용하기;

import 클래스만들기.계산기3;

public class 용돈계산기 {

	public static void main(String[] args) {
		계산기3 cal = new 계산기3();
		
		//mul 메서드 호출을 위한 변수
		int 기간 = 6;
		int 용돈 = 100000;
		
		//add 메서드를 호출하기 위한 변수
		int 상반기 = 600000;
		int 하반기 = 500000;
		
		//600000,500000 값을 파라미터로 add 메서드 호출
		cal.add(상반기,하반기);
		System.out.println("");
		
		//mul 메서드 호출 후 return 값 sum 에 저장
		int sum = cal.mul(기간,용돈);
		//sum 값이 50만원이 넘는다면
		if(sum > 50000) {
			System.out.println("당신의 용돈은 " + sum +"원");
		}else {
			System.out.println("당신의 용돈은 : " + (sum+150000)+"원");
		}
		
	}

}
