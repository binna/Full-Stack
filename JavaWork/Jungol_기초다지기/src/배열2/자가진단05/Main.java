package 배열2.자가진단05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("first array");
		int[] first = new int[8];
		for (int i = 0; i < first.length; i++) {
			first[i] = sc.nextInt();
		}
		
		System.out.println("second array");
		int[] second = new int[8];
		for (int i = 0; i < second.length; i++) {
			second[i] = sc.nextInt();
		}
		
		for (int i = 0; i < second.length; i++) {
			System.out.print((first[i] * second[i]) + " ");
			if(i == 3) {
				System.out.println();
			}
		}
		
	}

}