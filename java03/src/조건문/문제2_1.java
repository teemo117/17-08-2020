package 조건문;

import javax.swing.JOptionPane;

public class 문제2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			String data = JOptionPane.showInputDialog("숫자를 입력하세요");
			if (data.equals("88")) {
				System.out.println("축하합니다");
				System.exit(0);
			} else {
				System.out.println("다른 수를 입력해보세요");
			}
		}
	}
}