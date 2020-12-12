package 반복제어문3.자가진단04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			for (int j = input - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}