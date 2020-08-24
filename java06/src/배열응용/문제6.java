package 배열응용;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {66,77,88,99};
		int imsi = num[0]; // imsi <- 66
		num[0] = num[3]; //num[0] <- 99
		num[3] = imsi;
		for (int x : num) {
			System.out.println(x +"");
		}
		System.out.println();
	}

}
