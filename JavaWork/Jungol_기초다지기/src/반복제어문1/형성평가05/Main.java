package 반복제어문1.형성평가05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Base = ");
			int base = sc.nextInt();
			
			
			System.out.print("Height = ");
			int height = sc.nextInt();
			
			double triangleWidth = (double)base * height / 2;
			System.out.println("Triangle width = " + String.format("%.1f", triangleWidth));
			
			
			System.out.print("Continue? ");
			
			String input = sc.next().trim();
			
			if(!input.equalsIgnoreCase("y")) {break;}
			
		}
	}
}