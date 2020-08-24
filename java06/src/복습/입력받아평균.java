package 복습;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jumsu = new int[5];
		for (int i= 0; i < 5; i++) {
			String data = JOptionPane.showInputDialog("5개숫자입력");
			jumsu[i] = Integer.parseInt(data);
		}
//		System.out.println(jumsu[0]+jumsu[1]+jumsu[2]+jumsu[4]);
		int sum = 0;
		//1,2,3,4,5
		for (int i = 0; i < jumsu.length; i++) {
			sum = sum + jumsu[i];
//      i=0  1  =  0  +   1
//		i=1  3  =  1  +   2
//		i=2  6  =  3  +   3
//		i=3  10 =  6  +   4
//		i=4  15 =  10 +   5
		}
		System.out.println("총합은: "+sum);
	}

}
