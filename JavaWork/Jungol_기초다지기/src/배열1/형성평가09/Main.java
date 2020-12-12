package 배열1.형성평가09;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[100];
		int[] output = new int[100];
		
		int i = 0;
		for (i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			if(input[i] == 0) {break;}
			
			if((input[i] % 2) == 0) {
				output[i] = input[i] / 2;
			} else {
				output[i] = input[i] * 2;
			}
		} // end for
		
		System.out.println(i);
		
		for (int j = 0; j < i; j++) {
			System.out.print(output[j] + " ");
		} // end for
		
	} // end main()

} // end class