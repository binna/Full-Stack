package 배열2.자가진단01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = new String[100];
		int[] cnt = new int[26];
		int i = 0;
		
		for (i = 0; i < input.length; i++) {
			input[i] = sc.next();
			
			int j = 0;
			for (j = 0; j <= 25; j++) {
				String temp = (char)(65 + j) + "";

				if(input[i].equals(temp)) {break;}
				else {continue;}
				
			}
			
			if(j > 25) {break;}
			
		} // end for
		
		for (int k = 0; k < i; k++) {
			
			for (int j = 0; j <= 25; j++) {
				String temp = (char)(65 + j) + "";
				
				if(input[k].equals(temp)) {
					cnt[j]++;
					break;
				}
				
			}
			
		} // end for
		
		for (int k = 0; k <= 25; k++) {
			if(cnt[k] != 0) {
				System.out.println((char)(65 + k) + " : " + cnt[k]);
			}
		} // end for
		
	} // end main()

} // end class