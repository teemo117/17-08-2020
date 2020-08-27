package 배열정리;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[4][];
		int[] kor = {50,60,70,80,90};
		int[] math = {66,77,88};
		int[] eng = {33,44,55,66};
		int[] sci = {90,80,74};
		num[0] =kor;
		num[1] =math;
		num[2] =eng;
		num[3] =sci;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j <num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

}
