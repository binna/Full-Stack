package 연잔자.형성평가03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[2];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		// 가로의 길이는 5 증가
		input[0] += 5;
		
		// 세로의 길이는 2배
		input[1] *= 2;
		
		System.out.println("width = " + input[0]);
		System.out.println("length = " + input[1]);
		System.out.println("area = " + (input[0] * input[1]));
		
	}

}