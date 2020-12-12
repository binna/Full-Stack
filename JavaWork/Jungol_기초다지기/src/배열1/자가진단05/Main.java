package 배열1.자가진단05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[2];
		double[] classScore = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		double sum = 0.0;
		
		for (int i = 0; i < 2; i++) {
			input[i] = sc.nextInt();
			
			sum += classScore[input[i] - 1];
		}
		
		System.out.println(String.format("%.1f", sum));
		
	}

}