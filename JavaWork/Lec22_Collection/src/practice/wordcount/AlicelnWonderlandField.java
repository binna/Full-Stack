package practice.wordcount;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlicelnWonderlandField {
	
	// method name : textLengthJudge
	// return : boolean
	// arguments : String words
	// 기능 : 두 글자 이상인지 검사하기
	// 전달받은 글자가 두 개 이상이면 참, 두개 미만이면  거짓리턴
	public boolean textLengthJudge(String words) {
		boolean check = false;
		String regex = "^[a-zA-Z]{2,}$";
		
		// Pattern 클래스의 pattern의 객체 생성
		// Regex(조건)을 coupon(입력 받은 문장)에서 컴파일(찾아서)하여 Pattern 객체로 생성
		Matcher matcher = Pattern.compile(regex).matcher(words);

		// find() : 패턴이 일치하면 true를 반환
		// matches() : 패턴이 전체 문자열과 일치할 경우 true 반환
		if (matcher.matches()) {
			check = true;
		} else {
			check = false;
		}

		// 2글자 이상인지 확인, 판정한 결과를 메인에 넘겨줘야 함
		return check;
	} // end textLengthJudge()
	
	
	// method name : wordFrequent
	// return : void
	// 기능 : 단어별 발생 빈도를 계산하여 
	//       hmap에 값을 넣는다
	public void wordFrequent(HashMap<String, Integer> hmap, String[] words) {
		for (int i = 0; i < words.length; i++) {
			int count = 0;
			for (int j = 0; j < words.length; j++) {
				if(words[i].equals(words[j])){
					count++;
				}
			}
			hmap.put(words[i], count);
		}
	} // end wordFrequent()
	
	
	// method name : twoOverCount
	// return : int count
	// arguments : String[] words
	// 기능 : 두 글자 이상의 단어가 몇개인지 파악한다
	//       파악하는 이유는 그 만큼의 배열 방을 만들기 위해서..!!
	public int twoOverCount(String[] words) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if(textLengthJudge(words[i])) {
				count++;
			}
		}
		return count;
	} // end twoOverCount()
	
	
	// method name : twoWordInput
	// return : void
	// 기능 : 2개 이상 단어들만 모아서 넣기..!!
	public void twoWordInput(String[] words, String[] words2) {
		int j = 0;
		for (int i = 0; i < words.length; i++) {
			if(textLengthJudge(words[i])) {
				words2[j] = words[i];
				j++;
			}
		}
	} // end twoWordInput()
	
	
	// method name : descSortPrint 
	// return : void
	// arguments : HashMap<String, Integer> hmap
	// 기능: 내림차순 정렬한 뒤 최종 결과 값을 출력한다.
	public void descSortPrint(HashMap<String, Integer> hmap) {
		System.out.println("단어\t:\t빈도수");
		System.out.println("--------------------------");
		TreeMap<String, Integer> treeMapReverse = new TreeMap<String, Integer>(Collections.reverseOrder());
        treeMapReverse.putAll(hmap);
 
        Iterator<String> treeMapReverseIter = treeMapReverse.keySet().iterator();
 
        while(treeMapReverseIter.hasNext()) {
            String key = treeMapReverseIter.next();
            int value = treeMapReverse.get(key);
 
            System.out.println(key + " 단어 : " + value + "번");
        }
	} // end descSort()
	
	
	// method name : view
	// return : void
	// arguments : 없음
	// 기능 : 화면 출력한다.
	public void view() {
		System.out.println("실습\t:\t단어 발생 빈도");
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		// 공백 제거, 대소문자 구분하지 않기
		String [] words = C.ALICE30.trim().toLowerCase().split("\\s+");
		
		// 구두점/기호 ",.\"\'`!?;:-()" 잘라내기
		for (int i = 0; i < words.length; i++) {
			StringTokenizer tokenizer = new StringTokenizer(words[i], ",.\\\"\\'`!?;:-()");
			words[i] = tokenizer.nextToken();
		}
		
		// 2글자 이상만 계수하기
		int count = twoOverCount(words);

		// 2개 이상의 단어를 넣기 위한 배열 선언
		String[] words2 = new String[count];
		
		// 2개 이상의 단어를 words2에 넣는다..!!
		twoWordInput(words, words2);
		
		// 발생빈도 계산하여 hmap로 단어별 발생빈도 값 넣기
		// 이때 단어는 key값, 발생빈도는 value값
		wordFrequent(hmap, words2);
		
		// 내림차순 정렬, 결과 출력
		descSortPrint(hmap);
	} // end view()
	
} // end class