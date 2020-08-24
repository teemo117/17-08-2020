package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.PLAIN, 50));
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.PLAIN, 50));
		JTextField t1 = new JTextField(10);
		t1.setFont(new Font("굴림", Font.PLAIN, 50));
		JTextField t2 = new JTextField(10);
		t2.setFont(new Font("굴림", Font.PLAIN, 50));
		JLabel result = new JLabel();
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int no1 = Integer.parseInt(s1);
				int no2 = Integer.parseInt(s2);
				if (no1>no2) {
					result.setText("첫번째 값이 큽니다");
				} else {
					result.setText("두번째 값이 큽니다");
				}
				
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 35));
		FlowLayout flow = new FlowLayout();
		l1.setText("숫자1");
		l2.setText("숫자2");
		b1.setText("비교");
		f.setSize(500,500);
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(b1);
		f.getContentPane().add(result);
		f.setVisible(true);
	}

}
