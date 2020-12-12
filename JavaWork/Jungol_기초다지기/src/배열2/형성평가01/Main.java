package 배열2.형성평가01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		int[] cnt = new int[6];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			for (int j = 0; j < cnt.length; j++) {
				if(input[i] == (j + 1)) {cnt[j]++;}
			}
		} // end for
		
		for (int i = 0; i < cnt.length; i++) {
			
			System.out.println((i + 1) + " : " + cnt[i]);
		} // end for
		
	} // end main()

} // end class