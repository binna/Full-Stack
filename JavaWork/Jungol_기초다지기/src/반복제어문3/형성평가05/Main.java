package 반복제어문3.형성평가05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int cnt = 1;
		
		for (int i = 0; i < input; i++) {
			for (int j = (input * 2) - 1 - cnt; j > 0 ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < cnt; j++) {
				System.out.print("*");
			}
			cnt += 2; 
			System.out.println();
		}
		
	}

}