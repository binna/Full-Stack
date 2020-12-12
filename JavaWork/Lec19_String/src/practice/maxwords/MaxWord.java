package practice.maxwords;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/* MaxWrod
	여러문장으로 구성된 문자열을 입력받은뒤 
	문자열에서 가장 단어의 개수가 많은 문장을 찾아서, 
	그 문장과 문장의 단어의 개수를 출력
	'문장'의 구분은  .(마침표) !(느낌표) ?(물음표) 로 한다.
	'단어'구분은 '공백' 으로 한다
	
	입력예]
	We test coders. Give us a try. Can you make it out? It's awesome.
	
	출력예]
	5개
	Can you make it out
 */
public class MaxWord {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// We test coders. Give us a try. Can you make it out? It's awesome.
		// 사용자에게 문자 입력받기
		String expr = sc.nextLine();
		
		String[] sentence = sentenceDivision(expr);
		
		int[] wordCount = WordCount(sentence);

		int place = WordCountMAX(wordCount);
		
		// 제일 큰 문장을 출력한다.
		System.out.println(wordCount[place] + "개");
		System.out.println(sentence[place]);
		
		sc.close();
	} // end main
	
	
	// method name: sentenceDivision
	// return: String[]
	// arguments: String expr
	// 기능: 사용자에게 입력 받은 문자열을 문장 단위로 구분하기
	//      문장의 구분은 .(마침표), !(느낌표), ?(물음표)로 구분
	public static String[] sentenceDivision(String expr) {
		// 문장의 구분은 .(마침표), !(느낌표), ?(물음표)로 구분
		StringTokenizer exprTokenizer = new StringTokenizer(expr, ".!?");
		
		// 몇개의 문장으로 쪼개졌는지 갯수 파악하기
		// 그래야 각기 문장 별로 String 배열 인덱스 개수를 알 수 있기 때문에
		int count = exprTokenizer.countTokens();
		
		// 구분한 문장을 저장할 String 타입의 sentence 배열
		String[] sentence = new String[count];
		
		// 구분된 문장을 sentence 배열에 담기
		for(int i = 0; i < count; i++) {
			sentence[i] = exprTokenizer.nextToken();
		}
		
		// 맨 앞 공백 제거
		for(int i = 0; i < count; i++) {
			sentence[i] = sentence[i].trim();
		}
		
		// sentence를 메인으로 돌려줘야 함
		return sentence;
	}
	
	
	
	// method name: WordCount
	// return: String[]
	// arguments: int[]
	// 기능: 문장별로 단어가 몇개나 있는지 개수 파악하기
	public static int[] WordCount(String[] sentence) {
		//어느것이 제일 많은지 저장하기 위해서 각기 sentence 별로 개수 저장하기
		int[] wordCount = new int[sentence.length];
		
		for (int i = 0; i < sentence.length; i++) {
			String[] words = sentence[i].split("\\s+");
			wordCount[i] = words.length;
			
		}

		// 문장별 단어 개수가 저장되어 있는 int[]을 메인으로 돌려줘야 함
		return wordCount;
	}
	
	
	// method name: WordCountMAX
	// return: int[]
	// arguments: int
	// 기능: 가장 큰 문장의 인덱스 값을 찾기
	public static int WordCountMAX(int[] wordCount) {
		// 이때 몇번째 sentence가 제일 큰지 위치를 저장할 변수, 기본 위치 0번째로 저장
		int place = 0;
		
		// 가장 큰 값을 찾기
		for (int i = 0; i < wordCount.length - 1; i++) {
			if(wordCount[i] < wordCount[i + 1]) {
				place = i + 1;
				
			}
		}
		return place;
		
	}
	
} // end class