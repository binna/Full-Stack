package 연잔자.자가진단01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[3];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		System.out.println("sum : " + (input[0] + input[1] + input[2]));
		System.out.println("avg : " + ((input[0] + input[1] + input[2])/3));
	}

}