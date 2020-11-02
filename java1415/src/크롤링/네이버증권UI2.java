package 크롤링;

import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 네이버증권UI2 {

	public static void main(String[] args) {
		
		//주식 코드 > 셀트리온,삼성전자,현대약품
		String[] codes = { "068270", "005930", "004310" };
		//배열 초기화
		String[] result = null;
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.setSize(300, 600);
		f.getContentPane().setLayout(null);

		JTextField tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.CENTER);
		tf.setBounds(68, 291, 154, 42);
		f.getContentPane().add(tf);
		tf.setColumns(10);
		
		JTextArea tA = new JTextArea();
		tA.setBounds(61, 422, 184, 115);
		f.getContentPane().add(tA);
		
		//회사 버튼 클릭 시 해당 코드 텍스트 필드에 출력
		JButton btnNewButton = new JButton("셀트리온");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(codes[0]);
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton.setBounds(74, 46, 137, 42);
		f.getContentPane().add(btnNewButton);
		
		//회사 버튼 클릭 시 해당 코드 텍스트 필드에 출력
		JButton btnNewButton_1 = new JButton("삼성전자");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(codes[1]);
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton_1.setBounds(74, 109, 137, 42);
		f.getContentPane().add(btnNewButton_1);
		
		//회사 버튼 클릭 시 해당 코드 텍스트 필드에 출력
		JButton btnNewButton_1_1 = new JButton("현대약품");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(codes[2]);
			}
		});
		btnNewButton_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton_1_1.setBounds(74, 171, 137, 42);
		f.getContentPane().add(btnNewButton_1_1);

		JLabel lblNewLabel = new JLabel("CODE");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(74, 249, 137, 32);
		f.getContentPane().add(lblNewLabel);
		
		
		JButton btnNewButton_2 = new JButton("크롤링 시작");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//크롤링 메서드 객체 생성
				네이버증권크롤링2 naver = new 네이버증권크롤링2();
				//텍스트필드에 있는 코드 값을 code 에 저장
				String code = tf.getText();
				//코드 값을 인자로 저장 후 현재가,전일가,최고가 result 배열에 저장 후 출력
				String[] result =naver.crawl(code);
				tA.append("현재가 : " +result[0]+"\n"+ "어제가 : "+ result[1]+"\n"
						+"최고가 : " +result[2]);
			}
		});
		btnNewButton_2.setBounds(74, 369, 137, 32);
		f.getContentPane().add(btnNewButton_2);

		
		f.setVisible(true);
		//네이버증권크롤링2 naver = new 네이버증권크롤링2();
//		for (int i = 0; i < codes.length; i++) {
//			String[] result = naver.crawl(codes[i]);
//			try {
//				FileWriter file = new FileWriter(result[0]+".txt");
//				file.write(result[0] + " \n"); //이름
//				file.write(result[1] + " \n"); //code
//				file.write(result[2] + " \n"); //현재가
//				file.write(result[3] + " \n"); //어제와의 차이
//				file.write(result[4] + " \n"); //증감비율
//				file.close();
//			} catch (Exception e) {
//				System.out.println("파일 저장중 에러 발생");
//			}
	}

}
