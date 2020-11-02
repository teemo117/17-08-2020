package 스태틱;

public class 직원 {
	String name; //이름
	String gender; //성별
	int age; // 나이
	static int count; // 직원수 체크
	static int sum; // 나이저장 변수

	public 직원(String name, String gender, int age) {
		count++; // 호출될때마다 1씩 증가
		sum = sum + age; // 나이 합계 저장
		//입력 받은 데이터 멤버변수에 저장
		this.name = name; 
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "직원 [이름=" + name + ", 성별=" + gender + ", 나이=" + age + "]";
	}

}
