package 조건문;

import javax.swing.JOptionPane;

public class 은행입출금시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 0;
		int deposit2 = 0;
		int withdraw2 = 0;
		while (true) {
			String data = JOptionPane.showInputDialog("1)입금 2)출금 3)잔고 4)종료");
			int account = Integer.parseInt(data);
			if (account == 1) {
				String in = JOptionPane.showInputDialog("입금액을 입력하세요");
				int deposit = Integer.parseInt(in);
				deposit2 = deposit;
			} else {
				if (account == 3) {
					System.out.println("잔고는 "+(balance+deposit2-withdraw2)+"원입니다.");
				}
				if (account == 2) {
					String out = JOptionPane.showInputDialog("출금액을 입력하세요");
					int withdraw = Integer.parseInt(out);
					withdraw2 = withdraw;
				}
				if (account == 4) {
					System.out.println("종료합니다");
					break;
				}
			}
		
		}
		
	}
}