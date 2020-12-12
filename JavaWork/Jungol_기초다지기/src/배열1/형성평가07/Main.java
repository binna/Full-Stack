package 배열1.형성평가07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[100];
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			if(input[i] == 999) {break;}
			
			if(i == 0) {
				max = input[i];
				min = input[i];
			} else {
				
				if(max < input[i]) {
					max = input[i];
				}
				if(min > input[i]) {
					min = input[i];
				}
				
			}
			
		} // end for
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
	} // end main()
	
} // end class