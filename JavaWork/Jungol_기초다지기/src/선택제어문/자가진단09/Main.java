package 선택제어문.자가진단09;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[3];
		
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		int min = input[0];
		
		for (int i = 1; i < input.length; i++) {
			if(min > input[i]) {
				min = input[i];
			}
		}
		
		System.out.println(min);
		
	}

}