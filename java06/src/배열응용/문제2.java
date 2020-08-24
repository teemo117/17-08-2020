package 배열응용;

import javax.swing.JOptionPane;

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] text = new String[3];
		for (int i = 0; i < 3; i++) {
			text[i] = JOptionPane.showInputDialog("과목입력");
//			String data = JOptionPane.showInputDialog("입력");
//			text[i] = data;
		}
		System.out.println(text[0] + "보다는 " + text[1]);
	}
}