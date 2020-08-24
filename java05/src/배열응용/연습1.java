package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 연습1 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] data = new int[100];
		for (int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(100);			
		}
		for (int j : data) {
			System.out.println(j);
		}
		System.out.println("더한값은: "+(data[0]+data[99]));
	}

}
