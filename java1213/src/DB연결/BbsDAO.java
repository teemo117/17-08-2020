package DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BbsDAO {
	// 인자로 가방 전달받기
	public void create(BbsDTO dto) throws Exception {
		// DB프로그램 절차에 맞게 코딩
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결");
		// 2. db연결
		// String url "연결하는방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		System.out.println("2. db연결성공!");
		// 3. sql문을 만든다
		String sql = "insert into bbs values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 생성 성공");

		// 4. sql문을 전송 , type에 따라서 setint ~ 웬만하면 setsting
		ps.setInt(1, dto.getNo());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getWriter());
		ps.executeUpdate();
	}

	public BbsDTO one(int no) throws Exception {
		// DB프로그램 절차에 맞게 코딩
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결");
		// 2. db연결
		// String url "연결하는방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		System.out.println("2. db연결성공!");
		// 3. sql문을 만든다
		// select의 결과는 검색결과가 담긴 테이블(항복+내용)
		// 내용에는 없을 수도 있고, 많을 수도 있음.
		String sql = "select * from bbs where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		System.out.println("3. sql문 생성 성공");
		int result = 0;
		// 4. sql문을 전송 , type에 따라서 setint ~ 웬만하면 setsting
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql전송 성공");
		BbsDTO dto = new BbsDTO();
		; // 가방만들어서
		if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과있음");
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");
			dto.setNo(no2);
			dto.setTitle(title);
			dto.setContent(content);
			dto.setWriter(writer);
		} else {
			System.out.println("검색결과없음");
		}

		return dto;
		// bag은 참조형 변수, 주소를 전달!
	}

	public ArrayList<BbsDTO> all() throws Exception {
		// 가방을 넣는 컨테이너 역할을 하게 됨
		// <> 안에는 컨테이너에 무엇을 넣을 지 지정
		ArrayList<BbsDTO> list = new ArrayList<BbsDTO>();
		// DB프로그램 절차에 맞게 코딩
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결");
		// 2. db연결
		// String url "연결하는방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		System.out.println("2. db연결성공!");
		// 3. sql문을 만든다
		// select의 결과는 검색결과가 담긴 테이블(항복+내용)
		// 내용에는 없을 수도 있고, 많을 수도 있음.
		String sql = "select * from bbs";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 생성 성공");
		int result = 0;
		// 4. sql문을 전송 , type에 따라서 setint ~ 웬만하면 setsting
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql전송 성공");
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			BbsDTO dto = new BbsDTO(); // 가방만들어서
			//db데이터 추출
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");
			//가방에 넣기
			dto.setNo(no2);
			dto.setTitle(title);
			dto.setContent(content);
			dto.setWriter(writer);
			//컨테이너에 넣기
			list.add(dto);
		}

		return list;
		// bag은 참조형 변수, 주소를 전달!
	}

	public void update(BbsDTO dto) throws Exception {
		// 1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공.!!");

		// 2. db연결
		//String url = "연결하는방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");

		// 3. sql문을 만든다.(create)
		String sql = "update bbs set content = ? where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getContent());
		ps.setInt(2, dto.getNo());
		System.out.println("3. SQL생성 성공.!!");

		// 4. sql문은 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.!!");
	}

	public void delete(BbsDTO dto) throws Exception {
		// 1. connector 연결
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공");
		// 2. db 연결
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String pasword = "1234";
		Connection con = DriverManager.getConnection(url, user, pasword);
		System.out.println("2. db 연결 성공");
		// 3. sql 문작성
		String sql = "delete from bbs where no = (?)";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 생성 성공");
		ps.setInt(1, dto.getNo());
		ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");

	}

}
