package 배열1.형성평가03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		int sumOdd = 0;
		int sumEven = 0;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			if((i % 2) == 0) {
				sumEven += input[i];
			} else {
				sumOdd += input[i];
			}
		}
		
		System.out.println("odd : " + sumEven);
		System.out.println("even : " + sumOdd);
		
	}

}