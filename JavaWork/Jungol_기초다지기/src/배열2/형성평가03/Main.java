package 배열2.형성평가03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[2];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		System.out.print(input[0] + " " + input[1] + " ");
		
		for (int i = 0; i < 8; i++) {
			int temp = input[0] + input[1];
			
			System.out.print((temp % 10) + " ");
			
			input[0] = input[1];
			input[1] = temp;
			
		} // end for
		
	} // end main()

} // end class
