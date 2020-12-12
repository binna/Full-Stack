package 반복제어문1.형성평가01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int i = 1;
		
		while(i <= input) {
			System.out.print(i + " ");
			i++;
		}
		
	}
}