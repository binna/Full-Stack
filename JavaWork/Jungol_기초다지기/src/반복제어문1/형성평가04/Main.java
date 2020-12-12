package 반복제어문1.형성평가04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		while (true) {
			
			int input = sc.nextInt();
			
			if(input == 0) {break;}
			
			if((input % 3) == 0) {
				continue;
			} else if ((input % 5) == 0) {
				continue;
			} else {
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
		
	}

}