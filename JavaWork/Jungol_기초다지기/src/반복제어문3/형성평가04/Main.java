package 반복제어문3.형성평가04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = input - i; j > 0; j--) {
				System.out.print("*");
			}
			for (int j = (input - 1) - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i < input; i++) {
			for (int j = (input - 1) - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			for (int j = input; j < input + i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}