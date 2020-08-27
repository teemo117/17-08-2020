package 배열정리;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 문제2 {
	private static JTextField textField;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String image1 = "정육면체_사진4.jfif";
		String image2 = "정육면체_사진5.jfif";
		String image3 = "정육면체_사진6.jfif";
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setIcon(new ImageIcon("D:\\workspace\\java09\\정육면체_사진4.jfif"));
			}
		});
		btnNewButton.setBounds(12, 24, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("짜장");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon image = new ImageIcon(image1);
				btnNewButton_1.setIcon(new ImageIcon("D:\\workspace\\java09\\정육면체_사진5.jfif"));				
			}
		});
		btnNewButton_1.setBounds(116, 24, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("우동");
		btnNewButton_2.setBounds(218, 24, 97, 23);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\workspace\\project\\정육면체_사진4.jfif"));
		lblNewLabel.setBounds(43, 90, 364, 273);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("지불할 총 금액 ");
		lblNewLabel_1.setBounds(29, 405, 116, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("원");
		lblNewLabel_2.setBounds(157, 405, 57, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(335, 25, 116, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
		
		f.setVisible(true);
	}
}
