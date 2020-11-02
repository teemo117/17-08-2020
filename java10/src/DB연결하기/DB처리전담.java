package DB연결하기;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;



//특정한 방법을 처리하는 클래스 : 방법(MODEL,db처리)클래스
public class DB처리전담 {
	//DB 처리하는 방법이 4단계로 정해져있다.
	public void create(String id) throws Exception {
		System.out.println("DB에 저장 처리 함.");
		//1. connector 연결
		Class.forName("com.mysql.jdbc.Driver");
		//자바에서는 에러가 너무 많이 발생할것 같은 상황에서는 반드시
		//에러처처리를 반드시 해줘야함
		//네트워크 연결,db 연결, 파일연결,cpu연결
		System.out.println("1.connector 설정 성공");
		//2. db연결
			//1)ip+port+db명_
			//2)username : root
			//3)password : 1234
		String url = "jdbc:mysql://localhost:3366/test1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. shop 연결 성공!!");
		
		//db연동 index는 1부터 시작 !
		String sql = "insert into user values(?)";
		//컴퓨터는 이 문장을 그냥 String으로 인식
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		//ps.setString(2, pw);
		System.out.println("3. SQL 문 생성 성공!");
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공!!");
		
	}
//	public void create() {
////		JOptionPane.showMessageDialog(null, "DB에 저장 처리 함.");
//		System.out.println("DB에 저장 처리 함.");
//		//1. 
//	}
	public void read() {
		JOptionPane.showMessageDialog(null, "DB에 검색 처리 함.");
	}
	public void update() {
		JOptionPane.showMessageDialog(null, "DB에 수정 처리 함.");
	}
	public void delete() {
		JOptionPane.showMessageDialog(null, "DB에 삭제 처리 함.");
	}
}
