package 배열2.형성평가05;

import java.util.Scanner;
		
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] score = new int[4][3];
		int[] sum = new int[4];
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "class? ");
			
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = sc.nextInt();
				sum[i] += score[i][j];
			}
		}
		
		for (int i = 0; i < sum.length; i++) {
			System.out.println((i + 1) + "class : " + sum[i]);
		}
		
	} // end main

} // end class