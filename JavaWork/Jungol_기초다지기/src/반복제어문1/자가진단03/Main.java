package 반복제어문1.자가진단03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("number?");
			int input = sc.nextInt();
			
			if (input < 0) {
				System.out.println("negative number");
			} else if(input > 0) {
				System.out.println("positive integer");
			} else {
				break;
			}
			
		}
		
	}
}