package 반복제어문3.자가진단05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < input - i; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < input - (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}