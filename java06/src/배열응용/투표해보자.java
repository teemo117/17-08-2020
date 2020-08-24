package 배열응용;

import javax.swing.JOptionPane;

public class 투표해보자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"블랙핑크","유재석","아이유","이효리","비"};
		int[] 투표수 = new int[5];
//		int[] 투표수 = {0,0,0,0,0};
		for (int i = 0; i < 10; i++) {
			String choice =JOptionPane.showInputDialog("투표할사람");
			int choice2 = Integer.parseInt(choice);
			투표수[choice2]++;
		}
		for (int i = 0; i < 투표수.length; i++) {
			System.out.println(names[i]+": "+투표수[i]+"표");
		}
		int max = 투표수[0];
		for (int i = 0; i < 투표수.length; i++) {
			if (투표수[i]>max) {
				max=투표수[i];
			}
		}
		for (int i = 0; i < 투표수.length; i++) {
			if (투표수[i]==max) {
				System.out.println(i);
			}
		}
//		for (int x : 투표수) {
//			System.out.println(x + "");
//		}
	}

}
