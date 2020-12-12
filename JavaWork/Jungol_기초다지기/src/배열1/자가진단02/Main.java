package 배열1.자가진단02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = i + 1;
			System.out.print(input[i] + " ");
		}
	}

}