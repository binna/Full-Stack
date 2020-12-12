package 반복제어문2.자가진단06;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int[] score = new int[cnt];		
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < cnt; i++) {
			score[i] = sc.nextInt();
			
			sum += score[i];
		}
		
		avg = sum / (double)cnt;
		System.out.println("avg : " + String.format("%.1f", avg));
		
		if(avg >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		
	}

}