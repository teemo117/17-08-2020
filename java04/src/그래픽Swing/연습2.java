package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.PLAIN, 49));
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.PLAIN, 37));
		JLabel result = new JLabel();
		JTextField t1 = new JTextField(10);
		t1.setFont(new Font("굴림", Font.PLAIN, 27));
		JTextField t2 = new JTextField(4);
		t2.setFont(new Font("굴림", Font.PLAIN, 49));
		JButton b1 = new JButton("확인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int no2 = Integer.parseInt(s2);
				if (2020-no2+1 >= 18) {
					JOptionPane.showMessageDialog(f, s1 + "은 성인입니다");
				} else {
					JOptionPane.showMessageDialog(f, s1 + "은 미성년자입니다");
				}
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 50));
		FlowLayout flow = new FlowLayout();
		l1.setText("이름");
		l2.setText("출생년도(예)1990)");
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(b1);
		f.getContentPane().add(result);
		f.setSize(500, 500);
		f.getContentPane().setLayout(flow);
		f.setVisible(true);

	}

}
