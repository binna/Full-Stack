package 배열1.자가진단01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = new String[10];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.next();
		}
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
		}

	}

}