package 반복문;

public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < 10; i++) {
			if(i%2==1) {
				continue;}
			for (int j = 1; j < 10; j++) {
				
			System.out.println(i + "*" + j + "=" + i*j);
		}
		
		System.out.println("");
		}
		

//		int sum=i*j
//				continue;				

//		System.out.println(sum);
	}
}
