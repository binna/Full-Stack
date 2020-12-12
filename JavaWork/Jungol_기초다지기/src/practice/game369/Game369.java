package practice.game369;
/*
 * 369게임
 * 1~100 까지의 자연수를 나열하되,
 * 10개 단위로 줄바꿈을 하고
 * 숫자에 3,6,9 중 하나라도 있으면 * 표시를 하기
 * 
 * 주의! 순환문, 조건문만 사용(문자열 관련하여 사용 금지)
 * 
 * 패키지: practice.game369
 * 클래스: Game369
 */
public class Game369 {
	public static void main(String[] args) {
		System.out.println("369 게임/n/n");
		
		int result1 = 0;
		int result2 = 0;
		
		for(int i = 1; i <= 100; i++) {
			//나머지 연산을 이용하여 끝에 3,6,9만 남기기
			result1 = i % 10;
			//몫 연산을 이용하여 십의 자리 3,6,9들을 * 하기 위해
			result2 = i / 10;
			
			//1~100 까지의 자연수를 나열하되,
			//숫자에 3,6,9 중 하나라도 있으면 * 표시하기 
			if(result1 % 3 == 0 && result1 != 0) {
				System.out.print("*\t");
				
			} else if(result2 % 3 == 0 && result2 != 0) {
				System.out.print("*\t");
				
			} else {
				System.out.print(i + "\t");
			}
			
			// 10개 단위로 줄바꿈
			if(i % 10 == 0) {
				System.out.println();
			}
			
		}
		
	}
}
