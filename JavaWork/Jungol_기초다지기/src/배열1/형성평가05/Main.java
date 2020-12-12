package 배열1.형성평가05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] input = new double[6];
		double sum = 0.0;
		double avg = 0.0;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextDouble();
			
			sum += input[i];
		}
		
		avg = sum / input.length;
		
		System.out.println(String.format("%.1f", avg));
		
	} 
	
}