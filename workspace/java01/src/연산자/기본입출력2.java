package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = JOptionPane.showInputDialog("첫번째 숫자");
		//ctrl + alt + 화살표아래 : 한 줄 복사
		//alt + 화살표방향: 이동
		String num2 = JOptionPane.showInputDialog("두번째 숫자");
		int no1 = Integer.parseInt(num1);
		int no2 = Integer.parseInt(num2);
		int sum = no1 + no2;
		System.out.println(sum);
	}

}
