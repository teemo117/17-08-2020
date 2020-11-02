package 스레드;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadRun4 extends JFrame {
	JLabel top = new JLabel("1"); // 전역변수 글로벌변수
	JLabel center = new JLabel("");
	JLabel sub = new JLabel("");

	public ThreadRun4() { // 생성자
		setTitle("나의멀티스레드");
		setSize(800, 300);
		getContentPane().setBackground(Color.green);
		top.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		getContentPane().add(top, BorderLayout.NORTH);

		sub.setBackground(Color.CYAN);
		sub.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		getContentPane().add(sub, BorderLayout.SOUTH);

		center.setBackground(Color.CYAN);
		getContentPane().add(center, BorderLayout.CENTER);
		//객체 생성(카운트,이미지,날짜)
		CountThread2 count = new CountThread2();
		count.start(); //thread 시작
		ImageThread2 img = new ImageThread2();
		img.start();//thread 시작
		TimerThread2 timer = new TimerThread2();
		timer.start();//thread 시작

		setVisible(true);
	}

	// 내부클래스(inner class)
	// 변수를 다른 클래스와 공유할 목적
	// 단점 : 내부클래스는 독립적으로 사용 불가
	//카운터 500 > 1
	public class CountThread2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				top.setText("카운터 : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	//이미지 슬라이드
	public class ImageThread2 extends Thread { 
		@Override // 재정의
		public void run() {
			String[] imgages = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < imgages.length; i++) { // 5번 반복
				ImageIcon img = new ImageIcon(imgages[i]); // img 아이콘 생성
				center.setIcon(img);//이미지 배치
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}

	//현재시간 
	public class TimerThread2 extends Thread {
		// @ > Annotation (표시,표기) : 기능없음 지워도 됨
		// @Component => 기능 없음, 지우면 안됨, new 객체 생성
		@Override // 오버라이드, 재정의 부모에게 상속 받은것을 수정해서 사용
		public void run() {
			for (int i = 0; i < 300; i++) {
				//date 객체 생성 및 포맷 변경
				Date date = new Date();
				SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String date2 = fm.format(date);
				System.out.println(date2);
				sub.setText(date2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		ThreadRun4 t = new ThreadRun4(); // 생성자 호출
	}

}
