package loop;

import java.util.Scanner;

public class 신체검사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ocount = 0;
		int xcount = 0;
		int score = 0;
		double average = 0;
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("주민번호입력>> ");
			String pn = scan.next();
			System.out.print("키입력(cm)>> ");
			double height = scan.nextDouble();
			System.out.print("몸무게입력>> ");
			double weight = scan.nextDouble();
//			double bmi = (weight/((height/100)*(height/100)));
//			System.out.println(bmi);
			System.out.print("시력입력>> ");
			double eye = scan.nextDouble();
			System.out.print("병명입력>> 1.없음 2.평발 3.고혈압:	 ");
			int disease = scan.nextInt();
//			if(height < 150 || height > 190) {
//				if(bmi>=30) {
//					if(eye<0.0) {
//						System.out.println("면제대상");
//						xcount++;
//					}
//				}
//			} else {
//				System.out.println("현역대상");
//				ocount++;
//			}
			if (height>150 && height<190) {
				System.out.println("키151~189사이면 "+(score+20));
				score=score+20;
			}
			if (weight>35 && weight<100) {
				System.out.println("몸무게36~99키로사이면 "+(score+20));
				score=score+20;
			}
			if (eye>1.0) {
				System.out.println("시력 1.0초과면 "+(score+30));
				score=score+30;
			} else if (eye>0.5) {
				System.out.println("시력 0.5초과면 "+(score+20));
				score=score+20;
			} else if (eye>0.1) {
				System.out.println("시력 0.1초과면 "+(score+10));
				score=score+10;
			}
			if (disease==1) {
				System.out.println("병명1에대한 "+(score+30));
				score=score+30;
			} else if (disease==2) {
				System.out.println("병명2에대한 "+(score+20));
				score=score+20;
			} else if (disease==3) {
				System.out.println("병명3에대한 "+(score+10));
				score=score+10;
			}
			System.out.println("총점은: "+score);
			if (score>=40) {
				System.out.println("현역대상");
				ocount++;
			} else {
				System.out.println("면제대상");
				xcount++;
			}
			average=score/(ocount+xcount);
			//반복시 score값이 누적돼 모두가 현역대상이 되는 오류가 있음
			System.out.println("평균값은 "+average);
			System.out.println("현역대상자의 수는 "+ocount);
			System.out.println("면제대상자의 수는 "+xcount);
		}
	}

}
