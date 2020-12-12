package 반복제어문2.자가진단05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		int cntMultipleOf3 = 0;
		int cntMultipleOf5 = 0;

		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			if((input[i] % 3) == 0) {
				cntMultipleOf3++;
				
			}
			
			if((input[i] % 5) == 0) {
				cntMultipleOf5++;
			}
		}
		
		System.out.println("Multiples of 3 : " + cntMultipleOf3);
		System.out.println("Multiples of 5 : " + cntMultipleOf5);
		
	}

}