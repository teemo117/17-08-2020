package dbcp;

public class ConManager {
	// 싱글톤을 만들려고함
	static ConManager con; // 전역변수 자동초기화 null
	
	// 객체가 만들어졌는지 체크, 없으면 만들어줌, 있으면 안만듬, 객체를 리턴
	public static ConManager getInstance() {
		if (con == null) {
			con = new ConManager();
		}
		return con;
	}
	public void dbConnect() {
		System.out.println("db 연결함");
	}
}
