package 반복문;

public class 연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < (4 - i); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
