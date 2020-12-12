package practice.wordcount;
/* 1] 문서(문자열) 안의 단어의 빈도수를 계수해서 출력하기
 * 	- 대소문자 구분하지 않기 :   The 와 the 는 같은 단어
 *  - 2글자 이상만 계수하기
 *  - 구두점/기호 ",.\"\'`!?;:-()" 잘라내기
 *  - 공백 짤라내기
 * ex)
 * 	an : 234
 * 	the : 314
 * ...
 * 
 * hint]
 * 	split("\\s+")  --> String[]   
 * 	--> StringTokenizer  (혹은 정규표현식)
 *  	  --> HashMap<String, Integer>   <단어, 빈도수>  사용
 * ───────────────────────────────────────────────────────────    
 * 2] 빈도수 내림차순으로 정렬하여 출력하기
 * 	ex)
 *	1 the:113개
 *	2 she:95개
 *	3 to:85개
 *	...   
 *
 * hint]
 *  토큰나이저 사용해서 잘라내기
 */

// TODO : 필요한 객체들 작성
// hint> 빈도수 담을 객체, Comparator<> ..

// the 113 she 92

// Ctrl + H : Search 창 뜨고 File Search 탭에서 
//            Containing text에 검색어 기입 > Search 클릭 
public class AliceInWonderland {
	
	public static void main(String[] args) {		
		
		AlicelnWonderlandField AlicelnWonder = new AlicelnWonderlandField();
		AlicelnWonder.view();
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class