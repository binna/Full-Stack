package 연잔자.자가진단06;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[2];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		System.out.println(input[0] + " > " + input[1] + " --- " + (input[0] > input[1]));
		System.out.println(input[0] + " < " + input[1] + " --- " + (input[0] < input[1]));
		System.out.println(input[0] + " >= " + input[1] + " --- " + (input[0] >= input[1]));
		System.out.println(input[0] + " <= " + input[1] + " --- " + (input[0] <= input[1]));
		
	}

}