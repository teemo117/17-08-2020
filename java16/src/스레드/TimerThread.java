package 스레드;

import java.util.Date;

public class TimerThread extends Thread {
	// @ > Annotation (표시,표기) : 기능없음 지워도 됨
	// @Component => 기능 없음, 지우면 안됨, new 객체 생성
	@Override // 오버라이드, 재정의 부모에게 상속 받은것을 수정해서 사용
	public void run() {
		for (int i = 0; i < 300; i++) {
			Date date = new Date();
			System.out.println(date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
