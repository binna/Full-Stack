package 배열1.형성평가08;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[100];
		int sum = 0;
		double avg = 0.0;
		int cntMultiplesOf5 = 0;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			if(input[i] == 0) {break;}
			
			if((input[i] % 5) == 0) {
				cntMultiplesOf5++;
				sum += input[i];
			}
		}
		
		avg = sum / (double)cntMultiplesOf5;
		
		System.out.println("Multiples of 5 : " + cntMultiplesOf5);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + String.format("%.1f", avg));
		
	} // end main()

} // end class