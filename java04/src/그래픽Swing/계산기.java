package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프레임1
		JFrame f = new JFrame();
		//이미지1
		ImageIcon img = new ImageIcon("cal.png");
		//라벨3
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.BOLD, 80));
		JLabel l3 = new JLabel();
		l3.setFont(new Font("굴림", Font.BOLD, 80));
		JLabel result = new JLabel();
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.PLAIN, 71));
		//텍스트입력2
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.PLAIN, 50));
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.YELLOW);
		t2.setFont(new Font("굴림", Font.PLAIN, 50));
		//버튼1
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1, t2에 입력한 값을 가지고 와야함.
				//가지고 온 값의 데이터 타입은 무조건 String
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println("t1값: " + s1);
				System.out.println("t2값: " + s2);
				int no1 = Integer.parseInt(s1);
				int no2 = Integer.parseInt(s2);
				int sum = no1 + no2;
				//result.setText(sum + "");
				String sum2 = String.valueOf(sum);
				result.setText(sum2);
			}
		});
		b1.setForeground(Color.RED);
		b1.setBackground(Color.BLUE);
		b1.setFont(new Font("굴림", Font.PLAIN, 49));
		//레이아웃1
		FlowLayout flow = new FlowLayout();
		f.setSize(500, 700);
		l1.setIcon(img);
		l2.setText("숫자1");
		l3.setText("숫자2");
		b1.setText("+");
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t1);
		f.getContentPane().add(l3);
		f.getContentPane().add(t2);

		f.getContentPane().add(b1);

		f.getContentPane().setLayout(flow);
		
		JButton b1_1 = new JButton();
		b1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println("t1값: " + s1);
				System.out.println("t2값: " + s2);
				int no1 = Integer.parseInt(s1);
				int no2 = Integer.parseInt(s2);
				int sum = no1 - no2;
				//result.setText(sum + "");
				String sum2 = String.valueOf(sum);
				result.setText(sum2);
			}
		});
		b1_1.setText("-");
		b1_1.setForeground(Color.RED);
		b1_1.setFont(new Font("굴림", Font.PLAIN, 49));
		b1_1.setBackground(Color.BLUE);
		f.getContentPane().add(b1_1);
		
		JButton b1_1_1 = new JButton();
		b1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println("t1값: " + s1);
				System.out.println("t2값: " + s2);
				int no1 = Integer.parseInt(s1);
				int no2 = Integer.parseInt(s2);
				int sum = no1 * no2;
				//result.setText(sum + "");
				String sum2 = String.valueOf(sum);
				result.setText(sum2);
			}
		});
		b1_1_1.setText("*");
		b1_1_1.setForeground(Color.RED);
		b1_1_1.setFont(new Font("굴림", Font.PLAIN, 49));
		b1_1_1.setBackground(Color.BLUE);
		f.getContentPane().add(b1_1_1);
		
		JButton b1_1_1_1 = new JButton();
		b1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println("t1값: " + s1);
				System.out.println("t2값: " + s2);
				int no1 = Integer.parseInt(s1);
				int no2 = Integer.parseInt(s2);
				int sum = no1 / no2;
				//result.setText(sum + "");
				String sum2 = String.valueOf(sum);
				result.setText(sum2);
			}
		});
		b1_1_1_1.setText("/");
		b1_1_1_1.setForeground(Color.RED);
		b1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 49));
		b1_1_1_1.setBackground(Color.BLUE);
		f.getContentPane().add(b1_1_1_1);
		f.getContentPane().add(result);
		f.setVisible(true);
	}

}
