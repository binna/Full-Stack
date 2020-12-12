package 반복제어문2.형성평가10;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[2];
		
		for (int i = 0; i < 2; i++) {
			input[i] = sc.nextInt();
		}
		
		if(input[0] < input[1]) {
			for (int i = 1; i <= 9; i++) {
				for (int j = input[0]; j <= input[1]; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, (i * j));
				}
				System.out.println();
			} // end for
		} else {
			for (int i = 1; i <= 9; i++) {
				for (int j = input[0]; j >= input[1]; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, (i * j));
				}
				System.out.println();
			} // end for
		} // end if
		
	}

}