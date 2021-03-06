package bean;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//CRUD 중심으로 기능을 정의
//데이터와 관련된 작업(Data Access object : DAO)
public class MemberDAO2 {
	// 기능을 정의할 때는 메서드(함수)를 사용한다.
	Connection con;

	public MemberDAO2() throws Exception {
		// DB프로그램 절차에 맞게 코딩
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		// 2. db연결
		// String url "연결하는방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/shop1?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, user, password);

	}

	public boolean create(MemberVO2 vo2) throws Exception {
		// DB프로그램 절차에 맞게 코딩
		// 3. sql문을 만든다
		String sql = "insert into member2 values (?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		// 4. sql문을 전송 , type에 따라서 setint ~ 웬만하면 setsting
		ps.setString(1, vo2.getId());
		ps.setString(2, vo2.getFirst_name());
		ps.setString(3, vo2.getLast_name());
		ps.setString(4, vo2.getEmail());
		ps.setString(5, vo2.getGender());
		ps.setString(6, vo2.getTel());

		int row = ps.executeUpdate();
		ps.close();
		con.close();
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		return result;

	}

}
