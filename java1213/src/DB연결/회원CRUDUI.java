package DB연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원CRUDUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.setSize(500, 700);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(122, 117, 68, 22);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("PW");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_1.setBounds(123, 148, 76, 25);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("NAME");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(123, 182, 72, 28);
		f.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Tel");
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(123, 217, 79, 30);
		f.getContentPane().add(lblNewLabel_1_1_1);

		t1 = new JTextField();
		t1.setBounds(243, 115, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(244, 149, 116, 21);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(244, 187, 116, 21);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(243, 224, 116, 21);
		f.getContentPane().add(t4);

		JButton create = new JButton("회원가입");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 회원가입할 정보4개 입력값을 가지고 와서
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				// db처리(MemberDAO), create() 메서드 호출
				MemberDAO dao = new MemberDAO();
				try {
					dao.create(id, pw, name, tel);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		create.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		create.setBounds(48, 362, 103, 62);
		f.getContentPane().add(create);

		JButton read = new JButton("중복체크");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText(); // id로 검색
				MemberDAO dao = new MemberDAO();
				MemberVO vo = new MemberVO();
				try {
					int result = dao.read(id);
					if (result == 1) {
						

					} else {
						t1.setText("없음");
						t2.setText("없음");
						t3.setText("없음");
						t4.setText("없음");
						t1.setBackground(Color.gray);
						t2.setBackground(Color.gray);
						t3.setBackground(Color.gray);
						t4.setBackground(Color.gray);
					}

				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		read.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		read.setBounds(198, 362, 103, 62);
		f.getContentPane().add(read);

		JButton update = new JButton("회원수정");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// id 정보를 통해 tel 정보 수정
				String id = t1.getText();
				String tel = t4.getText();
				MemberDAO dao = new MemberDAO();
				try {
					dao.update(tel, id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		update.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		update.setBounds(103, 460, 103, 62);
		f.getContentPane().add(update);

		JButton delete = new JButton("회원삭제");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				try {
					dao.delete(id);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		delete.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		delete.setBounds(271, 460, 103, 62);
		f.getContentPane().add(delete);

		JLabel loginlb = new JLabel("");
		loginlb.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		loginlb.setBounds(274, 295, 100, 37);
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				String id = t1.getText();
				String pw = t2.getText();
				try {
					boolean result = dao.read(id, pw);
					if (result) {
						loginlb.setText("로그인ok");
					} else {
						loginlb.setText("로그인not");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(104, 295, 100, 37);
		f.getContentPane().add(btnNewButton);

		f.getContentPane().add(loginlb);

		JButton read_1 = new JButton("회원검색");
		read_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				try {
					MemberVO bag = dao.one(id);
					t1.setText(bag.getId());
					t2.setText(bag.getPw());
					t3.setText(bag.getName());
					t4.setText(bag.getTel());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		read_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		read_1.setBounds(344, 362, 103, 62);
		f.getContentPane().add(read_1);
		f.setVisible(true);

	}
}
