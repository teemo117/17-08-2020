package 제어문;

import javax.swing.JOptionPane;

public class 조건문연습1 {
	public static void main(String[] args) {
		String food = JOptionPane.showInputDialog("먹고싶은 음식은?");
		String result = "";
		if (food.equals("아이스크림")) {
			//System.out.println("뚜레주르로 가요");
			result = "뚜레주르로 가요";
		}else if (food.equals("아이스커피")) {
			//System.out.println("이디야로 가요");
			result = "이디야로 가요";
		}else {
			//System.out.println("물마셔요");
			result = "물마셔요";
		}
		System.out.println(result);
	}
}
