package 클래스만들기;

public class 계산기3 {
	
	//void형 > return 값 없음
	public void add(int x,int y) {
		int result = x + y;
		System.out.println("당신이 일년 동안 받은 용돈은 : " + result);
	}
	
	//int형  > return 값이 int형(result)
	public int mul(int x, int y) {
		int result = x * y;
		return result;
	}
}
