package dbcp;

public class dao {

	static dao con;
	public static dao getInstance() {
		if(dao.con == null) {
			con = new dao();
		}
		return con;
	}
	
}
