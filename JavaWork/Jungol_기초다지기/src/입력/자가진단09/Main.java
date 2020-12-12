package 입력.자가진단09;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] input = new double[3];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextDouble();
		}
		
		System.out.println(String.format("%.3f", input[0]));
		System.out.println(String.format("%.3f", input[1]));
		System.out.println(String.format("%.3f", input[2]));
	
	}

}