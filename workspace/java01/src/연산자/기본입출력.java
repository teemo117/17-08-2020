package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//창을 띄워서 입력을 받아보자
		//창을 띄워서 출력을 해보자
		//자주 사용하는 것은 부품의 대문자를 그대로 쓴다.
		//특정한 일을 전담하는 부품을 만들어
		//특정한 처리를 할 때 부품을 지정함
		String name = JOptionPane.showInputDialog("당신의 이름은");
		//jop ctrl+space.showIntputDialog("");""안에 입력값을 받는다.
		//입력된 값에 변수값을 지정한다. 입력받은 값이기에 String으로
		System.out.println("당신의 이름은 "+name);
		//syso ctrl+space(""+변수값);으로 출력
		String age = JOptionPane.showInputDialog("당신의 나이는");
		//키보드로 입력한 데이터 타입은 무조건 String!
		//String으로 저장된 데이터를 int/String 쓸지는 내가 결정!
		//계산의 유무에 따라 계산해야하는 경우는 int로 변환해주어야 함.
		//숫자로 바꿔보자!!
		//문자를 숫자로 바꿔주는 함수(CPU가 처리)
		int age2 = Integer.parseInt(age);
		//입력받은 age값(문자)을 age2 정수값으로 변환
		int lastAge = age2 - 1;
		//변환된 정수값을 계산하여 int값으로 변수지정
		System.out.println("당신의 작년 나이는 "+lastAge);
	}

}
