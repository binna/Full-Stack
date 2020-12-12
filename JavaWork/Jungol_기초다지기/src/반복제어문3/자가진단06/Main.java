package 반복제어문3.자가진단06;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		char character = 'A';
		
		for (int i = 0; i < input; i++) {
			for (int j = input - i; j > 0; j--) {
				System.out.print(character);
				character++;
			}
			System.out.println();
		}
				
	}

}