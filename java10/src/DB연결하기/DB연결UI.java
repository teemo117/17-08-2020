package DB연결하기;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DB연결UI {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("ID입력");
		//String pw = JOptionPane.showInputDialog("PW입력");
		DB처리전담 db = new DB처리전담();
		db.create(id);
	}

}

