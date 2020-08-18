package 기본입출력;

import javax.swing.JOptionPane;

public class 연습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 데이터: 입력		
		String a = JOptionPane.showInputDialog("숫자를입력하시오");
		String b = JOptionPane.showInputDialog("문자를입력하시오");
		
		//2. 처리
		int x = Integer.parseInt(a);
	
		//3. 결과: 출력
		for(int i=0; i<x; i++) {
			System.out.print(b);
		}
	}

}
