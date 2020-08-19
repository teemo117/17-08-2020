package 반복문;

import javax.swing.JOptionPane;

public class 연습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1=JOptionPane.showInputDialog("숫자를입력하세요");
		String num2=JOptionPane.showInputDialog("숫자를입력하세요");
		String operator=JOptionPane.showInputDialog("+-*/중 하나를 입력하세요");
		int no1 = Integer.parseInt(num1);
		int no2 = Integer.parseInt(num2);
		switch (operator) {
		case "+":
			System.out.println(no1+no2);
			break;
		case "-":
			System.out.println(no1-no2);
			break;
		case "*":
			System.out.println(no1*no2);
			break;
		case "/":
			System.out.println(no1/no2);
			break;
		}
	}

}
