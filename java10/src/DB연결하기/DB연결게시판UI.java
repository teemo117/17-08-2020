package DB연결하기;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class DB연결게시판UI {

	public static void main(String[] args) throws Exception {
		
		String uID = JOptionPane.showInputDialog("아이디입력");
		String uPW = JOptionPane.showInputDialog("패스워드입력");
		String uPhone = JOptionPane.showInputDialog("핸드폰번호입력");
		//String tel = JOptionPane.showInputDialog("TEL입력");
		
		DB처리게시판전담 db = new DB처리게시판전담();
		db.create(uID,uPW,uPhone);
	}

}
