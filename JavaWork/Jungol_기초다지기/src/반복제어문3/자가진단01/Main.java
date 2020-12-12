package 반복제어문3.자가진단01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		int i = 1;
		
		while(sum < input) {
			if((i % 2) != 0) {
				sum += i;
				cnt++;
			} 
			i++;
		}
		
		System.out.println(cnt + " " + sum);
	}

}