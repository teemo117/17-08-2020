package 배열기본;

public class 값이정해져있는경우2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"정훈","정후","정우","정하","승욱","승연","민석","민성","창호","창희"};
		for (String x : name) {
			System.out.println(x);
		}
		int[] age = {31,28,29};
		char[] gender = {'남','여','남'};
		double[] weight = {56.1,45.3,100.9};
		boolean[] food = {true,false};
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]+name[i]+gender[i]+weight[i]+age[i]);
		}
		for (int a : age) {
			System.out.println(a);
		}
		for (boolean a : food) {
			System.out.println(a);
		}
		
	}

}
