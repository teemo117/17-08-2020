package 배열응용;

import java.util.Random;

public class 연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제1000문제
		//원래 답안지 0~3까지 중 1000개 만드세요.
		//내답안지 0~3까지 총 1000개를 만드세요.
		//채점을 해보세요.
		Random r = new Random();
		int[] correct = new int[1000];
		int[] me = new int[1000];
		for (int i = 0; i < me.length; i++) {
			correct[i] = r.nextInt(4);
			me[i] = r.nextInt(4);
		}
		System.out.println("문항\t정답\t내답\t처리");
		int count =0;
		for (int i = 0; i < me.length; i++) {
			String result = "오답";
			if (correct[i] == me[i]) {
				result="오답";
				count++;
			}
			System.out.println(i+ "\t"+correct[i]+"\t"+me[i]+"\t"+result);
		}
		System.out.println("점수: "+count+"점");
	}

}
