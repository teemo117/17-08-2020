package 스레드;

public class ThreadRun3 {

	public static void main(String[] args) {
		CountThread count = new CountThread();
		ImageThread img = new ImageThread();
		TimerThread timer = new TimerThread();
		count.start();
		img.start();
		timer.start();

	}

}
