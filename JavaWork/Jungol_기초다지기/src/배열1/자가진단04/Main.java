package 배열1.자가진단04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[100];
		int cnt = 0;
		
		while (cnt < 100) {
			input[cnt] = sc.nextInt();
			if(input[cnt] == 0) {break;}
			cnt++;
		}
		
		for (int i = cnt - 1; i >= 0; i--) {
			System.out.print(input[i] + " ");
		}
		
	}

}