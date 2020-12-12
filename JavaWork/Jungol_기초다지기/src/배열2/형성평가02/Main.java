package 배열2.형성평가02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[100];
		int[] cnt = new int[11];
		int i = 0;
		
		for (i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			if(input[i] == 0) {break;}
		}
		
		for (int j = 0; j < i; j++) {
			for (int k = 0; k < cnt.length; k++) {
				if((input[j] / 10) == k) {
					cnt[k]++;
				}
			}
		} // end for
		
		for (int j = cnt.length - 1; j >= 0; j--) {
			if(cnt[j] == 0) {continue;}
			System.out.println((j * 10) + " : " + cnt[j] + " person");
			
		} // end for
		
	} // end main()

} // end class