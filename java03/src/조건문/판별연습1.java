package 조건문;

import javax.swing.JOptionPane;

public class 판별연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = JOptionPane.showInputDialog("사원번호입력");
		char spel = num.charAt(0);
		switch (spel) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서없음");
			break;
		}
		String sub =num.substring(1,4);
		//인덱스 1~3범위면 endIndex는 3보다 1큰 4를 써줘야함.
		System.out.println(sub);
		
	}

}
