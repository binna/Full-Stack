package 입력.형성평가04;

import java.util.Scanner;

// 세 개의 정수를 입력받아 합과 평균을 출력하는 프로그램을 작성하시오.(단 평균은 소수 이하를 버림하여 정수 부분만 출력한다.)
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[3];
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			sum += input[i];
		}
		
		avg = sum / 3.0;
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (int)avg);
		
	}
}