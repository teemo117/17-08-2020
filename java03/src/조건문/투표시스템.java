package 조건문;

import javax.swing.JOptionPane;

public class 투표시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iu=0, u=0, bts=0;
		while(true) {
			String vote = JOptionPane.showInputDialog("1.아이유, 2.유재석, 3.방탄, 4.종료");
			if (vote.equals("1") || vote.equals("아이유")) {
				System.out.println("감사합니다");
				iu++;
			} else {
				if (vote.equals("2") || vote.equals("유재석")) {
					System.out.println("감사합니다");
					u++;
				}
				if (vote.equals("3") || vote.equals("방탄")) {
					System.out.println("감사합니다");
					bts++;
				}
				if (vote.equals("4") || vote.equals("종료")) {
					System.out.println("참여해주셔서 감사합니다");
					break;
				}
			}
		}
		System.out.println("아이유: "+iu+"표");
		System.out.println("유재석: "+u+"표");
		System.out.println("방탄: "+bts+"표");
	}

}
