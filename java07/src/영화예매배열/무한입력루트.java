package 영화예매배열;

import java.util.Scanner;

public class 무한입력루트 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] seat = new int[10]; //좌석마다 예매상황을 저장할 공간
		int count = 0;
		while (true) {
			System.out.println("-----------------------------");
			for (int i = 1; i <= seat.length; i++) {
				System.out.print(i+"  ");
			}
			System.out.println();
			System.out.println("-----------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i]+"  ");
			}
			System.out.println();
			System.out.print("원하는 좌석 입력(종료 -1)>> ");
			int choice = scan.nextInt();
			if (choice == -1) {
				System.out.println("프로그램 종료!");
				System.out.println(count);
				System.out.println(count*10000);
				break;
			}
			//선택한 번호의 좌석을 예약처리
			if (seat[choice]==0) {
				seat[choice]= 1;
				System.out.println("예약되었습니다");
				count++;
			} else {
				System.out.println("다른자리를 선택해주세요");
			}
		}
	}
}
