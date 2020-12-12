package com.lec.java.collection09;

import java.util.Iterator;
import java.util.TreeSet;
/* TreeSet

 Collection<E>
  |__ Set<E>
       |__ HashSet<E>, TreeSet<E>

 TreeSet: 데이터가 정렬된 상태로 저장(오름차순, 내림차순)
 
 	(※ TreeXXX ← 주로 '정렬'에 특화된 자료구조 입니다)
*/
public class Collection09Main {

	public static void main(String[] args) {
		System.out.println("TreeSet 클래스");
		
		// Integer 타입을 저장할 수 있는 TreeSet 인스턴스 생성
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		
		// 데이터 저장 : add()
		tset.add(11);
		tset.add(2);
		tset.add(14);
		tset.add(1);
		tset.add(7);
		tset.add(15);
		tset.add(5);
		tset.add(8);
		
		
		// 데이터 검색 - Iterator 사용
		// TreeSet인 경우에 iterator() 메소드 오름차순 정렬
		System.out.println("오름차순:");
		Iterator<Integer> itr = tset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println();
		System.out.println("내림차순:");
		// 내림차순 Iterator : descendingIterator() 사용
		Iterator<Integer> itr2 = tset.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		// enhanced for
		System.out.println();
		System.out.println("enhanced for");
		for(Integer e : tset) {
			System.out.println(e);
		}
		
		
		// subset() 메소드
		// 시작값과 끝값을 매개변수로 받아, 그것을 범위로, 부분 set 추출
		System.out.println("\nsubSet()");
		TreeSet<Integer> subSet = (TreeSet<Integer>)tset.subSet(5, 14);	
												// 5부터 시작해서 14전까지
//		for(Integer e : subSet) {
//			System.out.println(e);
//		}
		
		// toString이 오버라이딩되어 있어서 [5, 7, 8, 11]로 출력 가능함
		System.out.println(subSet);
		
		subSet = (TreeSet<Integer>)tset.subSet(5, true, 14, true);
								// 5도 포함, 14도 포함한 범위
		System.out.println(subSet);
		
		
		subSet = (TreeSet<Integer>)tset.subSet(3, 10);
		System.out.println(subSet);
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class