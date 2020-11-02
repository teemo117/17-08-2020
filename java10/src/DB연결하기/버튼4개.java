package DB연결하기;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//UI,View역할
public class 버튼4개 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		//f.setLayout(new FlowLayout());
		
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//입력한값 가지고 와서 DB처리 전담 클래스에게 
				//DB에 저장하라고 데이터를 넘김.control역할
				DB처리전담 db = new DB처리전담();
				//db.create();
			}
			
		});
		b1.setText(100+"");
		
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 db = new DB처리전담();
				db.read();
			}
		});
		b2.setText("Read");
		
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 db  = new DB처리전담();
				db.update();
			}
		});
		b3.setText("Update");
		
		JButton b4 = new JButton();
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 db = new DB처리전담();
				db.delete();
			}
		});
		b4.setText("Delete");
		
		f.getContentPane().add(b1,BorderLayout.NORTH);
		f.getContentPane().add(b2,BorderLayout.EAST);
		f.getContentPane().add(b3,BorderLayout.WEST);
		f.getContentPane().add(b4,BorderLayout.SOUTH);
		
		
		f.setVisible(true);
		

	}

}
