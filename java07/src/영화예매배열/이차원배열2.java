package 영화예매배열;

public class 이차원배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1 = { 1, 2, 3 }; // 3열
		int[] n2 = { 4, 5, 6, 7 }; // 4열
		int[][] n3 = new int[2][]; // 2행
		n3[0] = n1;
		n3[1] = n2;
		for (int i = 0; i < n3.length; i++) { // 2행
			for (int j = 0; j < n3[i].length; j++) {
				System.out.print(n3[i][j] + " "); // 00 01 02 ln 10 11 12 13
			}
			System.out.println();
		}
	}
}