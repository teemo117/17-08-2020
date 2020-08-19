package 조건문;

import javax.swing.JOptionPane;

public class 문제2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wrong = 0;
		int count = 0;
		while (true) {
			String data = JOptionPane.showInputDialog("숫자를 입력하세요");
			//창을 띄워 입력받은 값을 RAM안의 data변수공간을 만들어 스트링값으로 저장
			int num = Integer.parseInt(data);
			//비교연산자를 사용하기 위해 입력받은 값을 저장한 data를 정수화한 후 num으로 선언 
			int target = 88;
			//RAM에 target이라는 공간을 만들고 88이라는 숫자를 넣고 int값 선언
			count++;
			if (num == target) {
				System.out.println("축하합니다!");
				break;
				//입력받은값과 타겟값이 같은 경우 출력후 종료
			} else {
				System.out.println("다른숫자를 입력해보세요");
				if (num > target) {
					System.out.println("너무커요!");
					//입력받은 값이 타겟값보다 큰 경우 출력
					wrong++;
				} else {
					System.out.println("너무작아요!");
					//그 외의 경우(수가 작은 경우) 출력
					wrong++;
				}
			}
		}
		//틀린경우와 전체경우를 카운팅하기 위해 while문 밖(main처음)에 초기값을 각각 생성
		System.out.println("틀린횟수: " + wrong);
		System.out.println("전체횟수: " + count);
		//while문 밖에 프린트
	}
}