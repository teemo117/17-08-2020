package 배열정리;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 영화앨범배열이용 {
	static int now = 2; //현재 위치를 체크할 수 있는 변수

	public static void main(String[] args) {
		// 영화제목목록, 이미지목록, 감독목록, 평점목록
		String[] titles = { "다만 악에서", "오케이 마담", "테넷", "짱구는 못말려", "캐리비안 해적" };
		String[] images = { "다만.png", "오케이.png", "테넷.png", "짱구.png", "해적.png" };
		String[] directors = { "홍원찬", "오케이 감독", "크리스토퍼 놀란", "하시모토 마사카즈", "마리트 모움" };
		double[] rates = { 7.79, 6.61, 8.88, 9.99, 5.65 };

		JFrame f = new JFrame();
		f.setTitle("나의 영화앨범");
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(606, 477);
		f.getContentPane().setLayout(null);

		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\workspace\\java09\\테넷.png"));
		img.setBounds(96, 123, 195, 270);
		f.getContentPane().add(img);

		JLabel lblNewLabel_2 = new JLabel("감독");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 29));
		lblNewLabel_2.setBounds(303, 140, 67, 43);
		f.getContentPane().add(lblNewLabel_2);

		JLabel director = new JLabel("크리스토퍼 놀란");
		director.setForeground(Color.RED);
		director.setFont(new Font("굴림", Font.BOLD, 25));
		director.setBounds(303, 182, 203, 48);
		f.getContentPane().add(director);

		JLabel lblNewLabel_2_1 = new JLabel("평점");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 29));
		lblNewLabel_2_1.setBounds(303, 258, 67, 43);
		f.getContentPane().add(lblNewLabel_2_1);

		JLabel rate = new JLabel("8.63");
		rate.setForeground(Color.RED);
		rate.setFont(new Font("굴림", Font.BOLD, 25));
		rate.setBounds(303, 300, 179, 48);
		f.getContentPane().add(rate);

		JButton title = new JButton("테넷");
		title.setForeground(Color.WHITE);
		title.setBackground(Color.BLUE);
		title.setFont(new Font("굴림", Font.BOLD, 45));
		title.setBounds(94, 10, 400, 77);
		f.getContentPane().add(title);
		f.setVisible(true);
		
		JButton left = new JButton("<");
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (now == 0) {
					now =5;
				}
				now--;//1
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now]+"");
			}
		});
		left.setBackground(Color.GREEN);
		left.setFont(new Font("굴림", Font.BOLD, 40));
		left.setBounds(0, 0, 84, 438);
		f.getContentPane().add(left);

		JButton right = new JButton(">");
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (now == 4) {
					now =-1;
				}
				now++;//3
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now]+"");
			}
		});
		right.setFont(new Font("굴림", Font.BOLD, 40));
		right.setBackground(Color.GREEN);
		right.setBounds(506, 0, 84, 438);
		f.getContentPane().add(right);

	}
}
