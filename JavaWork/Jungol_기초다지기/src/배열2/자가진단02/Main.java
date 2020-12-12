package 배열2.자가진단02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[100];
		int[] cnt = new int[10];
		int i = 0;
		
		for (i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			if(input[i] == 0) {break;}
			
		} // end for
		
		for (int j = 0; j < i; j++) {
			for (int k = 0; k < cnt.length; k++) {
				if((input[j] / 10) == k) {
					cnt[k]++;
					break;
				} 
			}
		} // end for
		
		for (int j = 0; j < cnt.length; j++) {
			
			if(cnt[j] != 0) {
				System.out.println(j + " : " + cnt[j]);
			}
		}
		
	} // end main()

} // end class