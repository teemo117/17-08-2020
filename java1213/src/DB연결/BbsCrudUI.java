package DB연결;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BbsCrudUI {
	private static JTextField tf2;
	private static JTextField tf1;
	private static JTextField tf3;
	private static JTextField tf;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800, 500);
		f.getContentPane().setLayout(null);

		tf2 = new JTextField();
		tf2.setBounds(55, 134, 676, 88);
		f.getContentPane().add(tf2);
		tf2.setColumns(10);

		tf1 = new JTextField();
		tf1.setBounds(235, 68, 287, 21);
		f.getContentPane().add(tf1);
		tf1.setColumns(10);

		tf3 = new JTextField();
		tf3.setBounds(615, 68, 116, 21);
		f.getContentPane().add(tf3);
		tf3.setColumns(10);

		// 회원 등록
		JButton 회원등록 = new JButton("등록");
		회원등록.setBounds(115, 357, 97, 23);
		f.getContentPane().add(회원등록);
		회원등록.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// db 접근 객체 생성
				BbsDAO dao = new BbsDAO();
				// 데이터를 담을 가방 생성 , 참조형 변수 생성(주소)
				BbsDTO dto = new BbsDTO();
				int no = Integer.parseInt(tf.getText());
				String title = tf1.getText();
				String content = tf2.getText();
				String writer = tf3.getText();
				// 데이터를 vo에 저장
				dto.setNo(no);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setWriter(writer);
				try {
					// 가방 전달
					dao.create(dto);
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
		JTextArea all = new JTextArea();
		JButton btnNewButton = new JButton("전체목록");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BbsDAO dao = new BbsDAO();
					ArrayList<BbsDTO> list = dao.all();
					System.out.println("게시판의 개수 : " + list.size() + "개");
					for (int i = 0; i < list.size(); i++) {
						BbsDTO dto = list.get(i);
						all.append(dto.getNo() +", " + dto.getTitle() +", " + dto.getContent() + ", " +  dto.getWriter() + "\n");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(231, 357, 97, 23);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("검색");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = tf.getText();
				BbsDAO dao = new BbsDAO();
				try {
					BbsDTO dto = dao.one(Integer.parseInt(no));
					tf.setText(String.valueOf(dto.getNo()));
					tf1.setText(dto.getTitle());
					tf2.setText(dto.getContent());
					tf3.setText(dto.getWriter());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_1.setBounds(340, 357, 97, 23);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("글수정");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = tf.getText();
				String content = tf2.getText();
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = new BbsDTO();
				dto.setNo(Integer.parseInt(no));
				dto.setContent(content);
				try {
					dao.update(dto);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				;

			}
		});
		btnNewButton_1_1.setBounds(449, 357, 97, 23);
		f.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_1_1 = new JButton("글삭제");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = tf.getText();
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = new BbsDTO();
				dto.setNo(Integer.parseInt(no));
				try {
					dao.delete(dto);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_1_1.setBounds(563, 357, 97, 23);
		f.getContentPane().add(btnNewButton_1_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("Result");
		lblNewLabel_2_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(55, 232, 67, 15);
		f.getContentPane().add(lblNewLabel_2_1);
		
		
		all.setBounds(55, 257, 676, 90);
		f.getContentPane().add(all);
		f.setVisible(true);
	}
}
