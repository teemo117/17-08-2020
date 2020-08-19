package 조건문;

import javax.swing.JOptionPane;

public class 문제2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			String data = JOptionPane.showInputDialog("숫자를 입력하세요");
			int num = Integer.parseInt(data);
			int target = 88;
			//비교연산자는 기본형 데이터만 사용할 수 있다.
			if (num == target) {
				System.out.println("축하합니다!");
				System.exit(0);
			} else if (num > target) {
				System.out.println("너무커요!");
			} else {
				System.out.println("너무작아요!");
			}
		}
	}
}