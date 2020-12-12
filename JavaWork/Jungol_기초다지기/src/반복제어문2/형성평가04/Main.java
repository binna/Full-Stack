package 반복제어문2.형성평가04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		int[] input = new int[cnt];
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < cnt; i++) {
			input[i] = sc.nextInt();
			
			sum += input[i];
		}
		
		avg = sum / (double) cnt;
		
		System.out.println(String.format("%.2f", avg));
		
	}

}