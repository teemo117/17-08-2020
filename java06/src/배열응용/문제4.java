package 배열응용;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i]=i+1;
		}
		for (int x : num) {
			System.out.println(x + "");
		}
		System.out.println();
//		for (int i = 0; i < num.length; i++) {
//			String data = JOptionPane.showInputDialog("1~5까지");
//			int num2 = Integer.parseInt(data);
//			num[i]=num2;
//			System.out.println(i+"번째"+num[i]);
//		}
	}
}
