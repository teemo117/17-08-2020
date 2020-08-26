package 영화예매배열;

public class 이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[2][4];
		num[1][3]=900;
		num[0][1]=800;
		System.out.println(num.length);
		System.out.println(num[0].length);
		System.out.println(num[1].length);
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
