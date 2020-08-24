package 배열기본;

public class 배열개념2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열은 일반적으로 같은 타입을 묶을 때 사용!
		//다양한 타입을 묶을 때는 배열을 쓰지 않음.
		//배열은 고정된 크기를 가진다.(크기 조절 불가능)
		int [] tem = new int[7];
		tem[0]=34;
		tem[1]=32;
		tem[2]=31;
		tem[3]=39;
		tem[4]=38;
		tem[5]=37;
		tem[6]=37;
		for (int i = 0; i < tem.length; i++) {
			System.out.println(tem[i]);
			
		}
		
	}

}
