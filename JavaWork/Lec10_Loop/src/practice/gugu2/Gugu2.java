package practice.gugu2;
/*
 * 구구단 ver.2
 * 
 * 3개 열로 출력될수 있도록
 * 작성해보세요
 * 
 * 패키지: practice.gugu2
 * 클래스: Gugu2
*/
public class Gugu2 {

	public static void main(String[] args) {

		int start = 2;
		int end = 4;
		
		while(end < 10) {
			for(int n = 1; n < 10; n++) { 
				for(int dan = start; dan <= end; dan++) {
					System.out.print(dan + " x "+ n + " = " + (dan * n) + "\t");
				}
				System.out.println();
			}
			start += 3;
			end += 3;
			
			if(end == 10) {end -= 1;}
		}
	}

}
