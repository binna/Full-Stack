package 연잔자.형성평가01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[4];
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			
			sum += score[i];
		}
		
		avg = sum / 4.0;
		
		System.out.println("sum " + sum);
		System.out.println("avg " + (int)avg);
	}

}