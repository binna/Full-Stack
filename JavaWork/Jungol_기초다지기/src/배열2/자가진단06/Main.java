package 배열2.자가진단06;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] score = new int[5][4];
		int[] sum = new int[5];
		int cnt = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = sc.nextInt();
				sum[i] += score[i][j];
			}
		} // end for
		
		for (int i = 0; i < sum.length; i++) {
			if((sum[i] / score[0].length) >= 80) {
				System.out.println("pass");
				cnt++;
			} else {
				System.out.println("fail");
			}
		}
		
		System.out.println("Successful : " + cnt);
		
	} // end main()

} // end class