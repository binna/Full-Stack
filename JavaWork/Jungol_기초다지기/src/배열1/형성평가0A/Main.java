package 배열1.형성평가0A;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int[] score = new int[input];
		int[] output = new int[input];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		} // end for
		
		for (int i = 0; i < score.length; i++) {
			int temp = 0;
			
			int cnt = 0;
			for (int j = 0; j < score.length; j++) {
				if(j == 0) {
					temp = score[j];
					cnt = j;
				} else {
					if(temp < score[j]) {
						temp = score[j];
						cnt = j;
					}
				}
			} // end for
			score[cnt] = 0;
			output[i] = temp;
			
		} // end for
		
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		} // end for
		
	} // end main()

} // end class