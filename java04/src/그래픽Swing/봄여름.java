package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;

public class 봄여름 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fr = new JFrame();
		JButton b1 = new JButton();
		b1.setBackground(Color.PINK);
		b1.setFont(new Font("굴림", Font.PLAIN, 70));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "날이좋아서");
			}
		});
		JButton b2 = new JButton();
		b2.setBackground(Color.GREEN);
		b2.setFont(new Font("굴림", Font.PLAIN, 70));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "개덥습니다");
			}
		});
		b1.setText("봄");
		b2.setText("여름");
		fr.setSize(1000,500);
		FlowLayout flow = new FlowLayout();
		fr.getContentPane().setLayout(flow);
		fr.getContentPane().add(b1);
		fr.getContentPane().add(b2);
		fr.setVisible(true);
	}

}
