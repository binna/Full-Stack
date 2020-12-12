package 반복제어문3.형성평가01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[20];
		int cnt = 0;
		int sum = 0;
		double avg = 0.0;
		
		while(cnt < 20) {
			input[cnt] = sc.nextInt();
			sum += input[cnt];
			if(input[cnt] == 0) {break;}

			cnt++;
		}
		
		avg = sum / (double)cnt;
		
		System.out.println(sum + " " + (int)avg);
		
	}

}