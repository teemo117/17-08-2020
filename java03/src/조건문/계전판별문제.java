package 조건문;

public class 계전판별문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 5;
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		default :
			System.out.println("31일까지");
		}
	}

}
