package 기본입출력;

import javax.swing.JOptionPane;

public class 연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = JOptionPane.showInputDialog("숫자를 입력하세요");
		String b = JOptionPane.showInputDialog("숫자를 입력하세요");
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		System.out.println("두수의 합은" + (x + y));
		System.out.println("두수의 차는" + (x - y));
		System.out.println("두수의 곱은" + (x * y));
		System.out.println("두수의 나눔은" + (double)x/y);

	}

}
