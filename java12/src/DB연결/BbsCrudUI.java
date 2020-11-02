package DB연결;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsCrudUI {
	private static JTextField tf3;
	private static JTextField tf1;
	private static JTextField tf2;
	private static JTextField tf;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800,500);
		f.getContentPane().setLayout(null);
		
		
		tf3 = new JTextField();
		tf3.setBounds(55, 132, 676, 215);
		f.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		tf1 = new JTextField();
		tf1.setBounds(235, 68, 287, 21);
		f.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(615, 68, 116, 21);
		f.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		//회원 등록
		JButton 회원등록 = new JButton("등록");
		회원등록.setBounds(115, 357, 97, 23);
		f.getContentPane().add(회원등록);
		회원등록.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//db 접근 객체 생성
				BbsDAO dao = new BbsDAO();
				//데이터를 담을 가방 생성 , 참조형 변수 생성(주소)
				BbsDTO bag = new BbsDTO();
				String no = tf.getText();
				int no2 = Integer.parseInt(no);
				String title = tf1.getText();
				String content = tf2.getText();
				String writer = tf3.getText();
				//데이터를 vo에 저장
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				try {
					//가방 전달
					dao.create(bag);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		JLabel lblNewLabel = new JLabel("Title");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel.setBounds(235, 43, 287, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Writer");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1.setBounds(615, 45, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Content");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_2.setBounds(55, 109, 67, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		tf = new JTextField();
		tf.setBounds(52, 68, 116, 21);
		f.getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lblNo = new JLabel("No");
		lblNo.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNo.setBounds(50, 43, 97, 15);
		f.getContentPane().add(lblNo);
		
		JButton btnNewButton = new JButton("전체목록");
		btnNewButton.setBounds(231, 357, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("검색");
		btnNewButton_1.setBounds(340, 357, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("글수정");
		btnNewButton_1_1.setBounds(449, 357, 97, 23);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("글삭제");
		btnNewButton_1_1_1.setBounds(563, 357, 97, 23);
		f.getContentPane().add(btnNewButton_1_1_1);
		f.setVisible(true);
	}
}
