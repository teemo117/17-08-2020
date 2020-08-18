package 제어문;

public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정해진 횟수만큼 반복해보자.
		int start = 1; //시작값
		//RAM에 start라는 변수공간 생성 후 1이라는 값을 넣어주고 int 선언
		int end = 100; //끝값
		//RAM에 end라는 변수공간 생성 후 100이라는 값을 넣어주고 int 선언
		int add = 2; //증가값
		//RAM에 add라는 변수공간 생성 후 2이라는 값을 넣어주고 int 선언
		while (start<=end) {
			//()시작값이 끝값보다 작거나 같다면 true-> while(반복문) 작동(CPU)
			System.out.println(start);
			//시작값을 보여줘! 보여줘! 보여줘! 보여줘! 보여줘! 보여줘!
			start = start + add;
			//언제까지? ()의 시작값이 false가 될 때까지
		}
	}

}
