package 배열1.자가진단03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = new String[10];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.next();
		}
		
		System.out.println(input[0] + " " + input[3] + " " + input[6]);
	}

}