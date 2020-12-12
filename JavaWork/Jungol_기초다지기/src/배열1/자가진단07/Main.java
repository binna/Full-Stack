package 배열1.자가진단07;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			if(input[i] > 10_000 || input[i] < 0) {
				input[i] = 100;
			}
		}
		
		int min = 10_000;
		int max = 0;
		for (int i = 0; i < input.length; i++) {
			if(input[i] < 100) {
				if(max < input[i]) {
					max = input[i];
				}
			}
			
			if(input[i] > 100) {
				if(min > input[i]) {
					min = input[i];
				}
			}
			
		}
		
		
		if(min == 10_000) {
			min = 100;
		} 
		
		if(max == 0) {
			max = 100;
		}
		
		System.out.println(max + " " + min);
		
	}

}