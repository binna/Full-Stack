package 반복제어문1.형성평가02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int oddCnt = 0;
		int evenCnt = 0;
		
		while (true) {
			
			int input = sc.nextInt();
			
			if(input == 0) { break; }
					
			if((input % 2) == 0) {
				evenCnt++;
				
			} else {
				oddCnt++;
				
			}
		}
		
		System.out.println("odd : " + oddCnt);
		System.out.println("even : " + evenCnt);
	}

}