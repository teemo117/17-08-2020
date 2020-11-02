package 컬렉션복습;

public class Day {
	String doing;
	int time;
	String location;
	static int count; // 전역변수는 자동초기화 , 변수를 공유할 때
	static int sum; // 시간 누적
	final static String company = "mega"; // 변경x 공유

	public Day(String doing, int time, String location) {
		this.count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	// static 메서드(정적 메서드) : 객체생성하지 않아도 이 기능을 바로 사용 가능
	// 클래스 이름으로 바로 접근해서 사용할 수 있는 메서드로 만드는 것이 좋다.
	public static String getName() {
		return company; // static 메서드에서는 인스턴스 사용 불가
		// 인스턴스변수는 객체 생성 후 접근 변수

	}
	// 자주 사용하는 기능의 메서드는 바로 바로 쓸수 있게 만들어주는 것이 좋다.
	// Integer.parseInt(), Jopionpane.showInputDialog()

	// 일반 메서드 : 객체 생성 후, 참조형 변수의 주소로 접근 가능
	public int getAvg() {
		return sum / count;
	}

	@Override // 재정의,오버라이드
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}

}
