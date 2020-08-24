package 배열응용;

public class 여러개의배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"아버지","어머니","형","나","동생"};
		int[] ages = {100,88,33,24,10};
		double[] tall = {177.5, 152.2, 190.3, 167.7, 155.3};
//		System.out.println(names[0]+" "+ages[0]+" "+tall[0]);
//		System.out.println(names[1]+" "+ages[1]+" "+tall[1]);
		for (int i = 0; i < tall.length; i++) {
			System.out.println(names[i]+"\t"+ages[i]+"\t"+tall[i]);
		}
	}

}
