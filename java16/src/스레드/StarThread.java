package 스레드;

//import java.lang.* 
public class StarThread extends Thread {
	// 멤버변수, 멤버메서드

	@Override
	public void run() { // Thread 에 정의 되어있음
		for (int i = 0; i < 1000; i++) {
			System.out.println("★");
		}

	}
}
