package 입력.자가진단08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] input = new double[2];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextDouble();
		}
		
		String inputChar = sc.next();
		
		System.out.println(String.format("%.2f", input[0]));
		System.out.println(String.format("%.2f", input[1]));
		System.out.println(inputChar);
		
	}
}