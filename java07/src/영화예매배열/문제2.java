package 영화예매배열;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		int[][] seat = new int[3][10];
		char a = 'A';
		while (true) {
			System.out.println("----------------------");
			System.out.print("   ");
			for (int i = 0; i < num.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println("");
			System.out.println("----------------------");

			for (int i = 0; i < seat.length; i++) {
				System.out.print((char)(a+i) + "  ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + " ");
				}
				System.out.println();
			}
			System.out.print("원하는 좌석 입력(종료 -1)>> ");
			int choice = scan.nextInt();
			if (choice==-1) {
				System.out.println("시스템을 종료합니다");
				break;
			}
			int choice2= scan.nextInt();
			if (seat[choice][choice2]==0) {
				seat[choice][choice2]= 1;
				System.out.println("예약되었습니다");
			} else {
				System.out.println("이미 예약되었습니다");
				System.out.println("다른자리를 선택해주세요");
			}
		}
	}
}