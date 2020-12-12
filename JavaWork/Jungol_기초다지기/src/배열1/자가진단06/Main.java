package 배열1.자가진단06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		int min;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		min = input[0];
		
		for (int i = 1; i < input.length; i++) {
			if(min > input[i]) {
				min = input[i];
			}
		}
		
		System.out.println(min);
		
	}
	
}