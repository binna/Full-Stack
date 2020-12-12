package 배열1.형성평가04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[100];
		int cnt = 0;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			if(input[i] == -1) {
				break;
			} else {
				cnt++;
			}
		}
		
		if(cnt == 1) {
			System.out.println(input[0]);
		} else if (cnt == 2){
			System.out.println(input[0] + " " + input[1]);
		} else {
			for (int i = cnt - 3; i < cnt; i++) {
				System.out.print(input[i] + " ");
			}
		}
		
	}

}