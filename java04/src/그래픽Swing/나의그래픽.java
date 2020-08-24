package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 나의그래픽 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바는 부품조립식 코드 => 객체지향형프로그래밍(OOP)
		//ctrl + shift + o: 자동 import
		JFrame fr = new JFrame(); //new는 복사의 의미
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "하앙 너무 좋아 더 격하게 눌러줘!");
			}
		});
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "난 그쪽취향이 아닌걸...");
			}
		});
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "나도 sky라구욧!");
			}
		});
		//String img = "sky.png";
		ImageIcon img = new ImageIcon("sky.png");
		b1.setText("나를눌러요");
		b2.setText("나도눌러요");
		b3.setIcon(img);
		fr.getContentPane().add(b1);
		fr.getContentPane().add(b2);
		fr.getContentPane().add(b3);
		
		fr.setSize(1000,500);
		FlowLayout flow = new FlowLayout();
		fr.getContentPane().setLayout(flow);
		//맨아래에 두어야한다.
		fr.setVisible(true);
	}

}
