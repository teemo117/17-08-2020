package DB연결하기;

public class 반환값연습2 {

	public static void main(String[] args) {
		String data = "나는 자바 프로그래머 정말";
		String[] dataset = data.split(" ");
		System.out.println(dataset.length);
		for (String s : dataset) {
			System.out.println(s);
		}

	}

}
