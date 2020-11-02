package 컬렉션복습;

public class 계좌 {
	String name; // 이름
	String field; // 계좌이름
	int money; // 금액

	public 계좌(String name, String field, int money) {
		this.name = name;
		this.field = field;
		this.money = money;
	}
	
	//기본생성자는 다른 생성자가 하나도 없을 때만 자동으로 만들어진다.
	// 입력값이 없으면서 클래스이름과 동일한 메서드 : 기본 생성자 메서드
	// 프로그래머가 메서드를 정의하지 않아도, 자동으로 만들어짐
	//public 계좌() { // 생성자는 반환유무를 명시하지 않습니다.
		// 생성자 메서드는 무조건 void
		// 기본 성격이 void인 경우 보통 생략
		// 객체 생성시 마다 자동으로 실행해주어야 하는 처리 내용
		// 초기화시킬 내용이 있으면 이 메서드에다가 처리내용을 쓰면됨
		// new를 이용해서 객체 생성 시 무조건 호출됨으로
		// 생성자 메서드(생성자)
		//System.out.println("내가 객체 생성시 마다 자동 호출 됩니다.");
		//System.out.println("보통 멤버변수 초기화 같은 처리를 넣어주는 편입니다.");
	//}

	// 계좌 객체를 생성할 때 name,field,money 넣지않으면
	// 객체를 하지 못하게 해야함
	// 세가지의 값을 넣었을 때만 계좌를 개설하도록 정의


	// 객체 생성 후 멤버 변수에 들어가있는 값들을 한꺼번에 확인하고자함
	// toString()을 만들자
	@Override
	public String toString() {
		return "계좌 [이름=" + name + ", 계좌종류=" + field + ", 금액=" + money + "]";
	}



}
