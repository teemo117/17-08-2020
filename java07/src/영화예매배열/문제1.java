package 영화예매배열;

public class 문제1 {
	public static void main(String[] args) {
		int[] n1 = {0,10,20,30,40,50};
		int count =0;
		for (int i = 0; i < n1.length; i++) {
			if(n1[i]>30) {
				count++;
			}
		}
		System.out.println("30보다 큰 값의 개수는: "+count+"개");
		
		int[] n2 = n1.clone();
		n2[0]=60;
		System.out.print("두 배열의 동일한 수는: ");
		for (int i = 0; i < n2.length; i++) {
			if(n1[i]==n2[i]) {
				System.out.print(n2[i]+" ");
			}
		}
		
	}
}
