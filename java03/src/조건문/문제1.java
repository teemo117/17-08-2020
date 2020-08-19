package 조건문;

import javax.swing.JOptionPane;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ok=0, no=0, etc=0;
		while (true) {
			String data = JOptionPane.showInputDialog
					("ok)긍정, no)부정, ex)종료, etc)기타");
			if (data.equals("ok")) {
				System.out.println("긍정");
				ok++;
			} else if (data.equals("no")) {
				System.out.println("부정");
				no++;
			} else if (data.equals("ex")) {
				System.out.println("반복문 종료합니다");
				break;
			} else {
				System.out.println("잘모르겠음");
				etc++;
			}
		}
		System.out.println("긍정횟수: "+ok+"회");
		System.out.println("부정횟수: "+no+"회");
		System.out.println("잘모르겠음횟수: "+etc+"회");
}

}
