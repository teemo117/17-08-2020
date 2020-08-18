package 기본입출력;

import javax.swing.JOptionPane;

public class 연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = JOptionPane.showInputDialog("숫자를 입력하시오");
		String b = JOptionPane.showInputDialog("숫자를 입력하시오");
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		if (x == 5 && y == 1000) {
			for (int i = 5; i <= 1000; i++) {
				System.out.println(i);
			}
		}
	}

}
