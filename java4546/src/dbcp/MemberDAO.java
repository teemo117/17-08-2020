package dbcp;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//CRUD 중심으로 기능을 정의
//데이터와 관련된 작업(Data Access object : DAO)
public class MemberDAO {
	// 기능을 정의할 때는 메서드(함수)를 사용한다.
	Connection con;
	DBConnectionMgr dbcp;
	public MemberDAO() throws Exception {
		dbcp = DBConnectionMgr.getInstance();
		System.out.println("2. db연결성공!");
	}
	public List<MemberVO> all() throws Exception {
		con = dbcp.getConnection();
		// 3. sql문을 만든다.
		String sql = "select * from member";
		PreparedStatement ps = con.prepareStatement(sql);

		// 4. sql문은 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");

		List<MemberVO> list = new ArrayList<MemberVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			MemberVO bag = new MemberVO();// 가방만들어서,
			bag.setId(rs.getString("id"));
			bag.setPw(rs.getString("pw"));
			bag.setName(rs.getString("name"));
			bag.setTel(rs.getString("tel"));
			list.add(bag);
		}
		dbcp.freeConnection(con, ps, rs);
		return list;
	}
	public List<MemberVO> all(String tel) throws Exception {
		con = dbcp.getConnection();
		// 3. sql문을 만든다.
		String sql = "select * from member where tel = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);

		// 4. sql문은 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		List<MemberVO> list = new ArrayList<MemberVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			MemberVO bag = new MemberVO();// 가방만들어서,
			bag.setId(rs.getString("id"));
			bag.setPw(rs.getString("pw"));
			bag.setName(rs.getString("name"));
			bag.setTel(rs.getString("tel"));
			list.add(bag);
		}
		dbcp.freeConnection(con, ps, rs);
		return list;
	}
	//특정 검색어로 가져오기2)
	public List<MemberVO> all2(String tel) throws Exception {
		con = dbcp.getConnection();
		// 3. sql문을 만든다.
		String sql = "select * from member where tel like '" + tel + "%'";
		PreparedStatement ps = con.prepareStatement(sql);

		// 4. sql문은 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		List<MemberVO> list = new ArrayList<MemberVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			MemberVO bag = new MemberVO();// 가방만들어서,
			bag.setId(rs.getString("id"));
			bag.setPw(rs.getString("pw"));
			bag.setName(rs.getString("name"));
			bag.setTel(rs.getString("tel"));
			list.add(bag);
		}
		dbcp.freeConnection(con, ps, rs);
		return list;
	}

	public boolean create(String id, String pw, String name, String tel) throws Exception {
		con = dbcp.getConnection();
		// DB프로그램 절차에 맞게 코딩
		// 3. sql문을 만든다
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql문 생성 성공");

		// 4. sql문을 전송
		int row = ps.executeUpdate();
		System.out.println("4. sql전송 성공");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		dbcp.freeConnection(con, ps);
		return result;
	}

	public boolean create(MemberVO vo) throws Exception {
		con = dbcp.getConnection();
		// DB프로그램 절차에 맞게 코딩
		// 3. sql문을 만든다
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 생성 성공");

		// 4. sql문을 전송 , type에 따라서 setint ~ 웬만하면 setsting
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getPw());
		ps.setString(3, vo.getName());
		ps.setString(4, vo.getTel());

		int row = ps.executeUpdate();
		System.out.println("4. sql전송 성공");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		dbcp.freeConnection(con, ps);
		return result;

	}

	// id 검색
	public MemberVO one(String id) throws Exception {
		con = dbcp.getConnection();
		// DB프로그램 절차에 맞게 코딩
		// 3. sql문을 만든다
		// select의 결과는 검색결과가 담긴 테이블(항복+내용)
		// 내용에는 없을 수도 있고, 많을 수도 있음.
		String sql = "select * from member where id =  ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공");
		int result = 0;
		// 4. sql문을 전송 , type에 따라서 setint ~ 웬만하면 setsting
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql전송 성공");
		MemberVO bag = new MemberVO(); // 가방만들어서
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과있음");
			String id2 = rs.getString("id");
			String pw2 = rs.getString("pw");
			String name2 = rs.getString("name");
			String tel2 = rs.getString("tel");
			bag.setId(id2);
			bag.setPw(pw2);
			bag.setName(name2);
			bag.setTel(tel2);
		} else {
			System.out.println("검색결과없음");
		}
		dbcp.freeConnection(con, ps, rs);
		return bag;
		// bag은 참조형 변수, 주소를 전달!
	}

	// id 중복 체크
	public int read(String id) throws Exception {
		con = dbcp.getConnection();
		String sql = "select * from member where id =  ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공");
		int result = 0;
		// 4. sql문을 전송 , type에 따라서 setint ~ 웬만하면 setsting
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql전송 성공");

		if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과있음");
			result = 1; // 검색결과 있음
			String id2 = rs.getString("id");
			String pw2 = rs.getString("pw");
			String name2 = rs.getString("name");
			String tel2 = rs.getString("tel");

		} else {
			System.out.println("검색결과없음");
		}
		dbcp.freeConnection(con, ps, rs);
		return result;
		// 0이 넘어가면 검색결과 x
		// 1이 넘어가면 검색결과 o

	}

	// id, pw 맞는지 로그인 처리
	public boolean read(String id, String pw) throws Exception {
		con = dbcp.getConnection();
		String sql = "select * from member where id =  ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);

		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 전송 , type에 따라서 setint ~ 웬만하면 setsting
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql전송 성공");
		boolean result = false;

		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("로그인ok");
			result = true; // 검색결과 있음
		} else {
			System.out.println("로그인not");
		}
		dbcp.freeConnection(con, ps, rs);
		return result;
		// false면 로그인not
		// true면 로그인ok

	}

	public boolean update(MemberVO vo) throws Exception {
		con = dbcp.getConnection();
		// 3. sql문을 만든다.(create)
		String sql = "update member set pw = ?, name = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getPw());
		ps.setString(2, vo.getName());
		ps.setString(3, vo.getTel());
		ps.setString(4, vo.getId());
		System.out.println("3. SQL생성 성공.!!");

		// 4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.!!");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		dbcp.freeConnection(con, ps);
		return result;
	}

	public boolean delete(String id) throws Exception {
		con = dbcp.getConnection();
		// 3. sql 문작성
		String sql = "delete from member where id = (?)";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 생성 성공");
		ps.setString(1, id);
		int row = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		dbcp.freeConnection(con, ps);
		return result;

	}

}
