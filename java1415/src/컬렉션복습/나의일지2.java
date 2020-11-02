package 컬렉션복습;

public class 나의일지2 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "서울");
		System.out.println(Day.sum);
		Day day2 = new Day("여행", 15, "태국");
		System.out.println(Day.sum);
		Day day3 = new Day("운동", 11, "집");
//		System.out.println(Day.sum);
//		System.out.println("평균 시간은 : " + Day.sum / Day.count);
		System.out.println("평균 시간은 : " +day1.getAvg() + "시간");
		System.out.println("회사는 : " + Day.getName());
//		System.out.println(day1);
//		System.out.println(day2);
//		System.out.println(day3);

	}

}
