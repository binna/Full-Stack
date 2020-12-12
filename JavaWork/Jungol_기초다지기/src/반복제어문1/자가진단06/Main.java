package 반복제어문1.자가진단06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String msg = "1. Korea\r\n" + 
				"2. USA\r\n" + 
				"3. Japan\r\n" + 
				"4. China\r\n" + 
				"number?";
		
		while(true) {
			System.out.print(msg);
			
			int input = sc.nextInt();
			
			if(input == 1) {
				System.out.println();
				System.out.println("Seoul");
				System.out.println();
				
			} else if(input == 2) {
				System.out.println();
				System.out.println("Washington");
				System.out.println();
				
			} else if(input == 3) {
				System.out.println();
				System.out.println("Tokyo");
				System.out.println();
				
			} else if(input == 4) {
				System.out.println();
				System.out.println("Beijing");
				System.out.println();
				
			} else {
				System.out.println();
				System.out.println("none");
				System.out.println();
				break;
			}
			 
			
		}
		
	}
}