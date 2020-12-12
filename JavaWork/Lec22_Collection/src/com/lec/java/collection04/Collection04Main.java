package com.lec.java.collection04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collection04Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");

		// MemberModel 타입을 담는 ArrayList를 만들고
		// 사용자로부터 3개의 Student 데이터를 입력받아서
		// 		(id, passwd)
		// 3가지 방법으로 출력해보세요
		// for, Enhanced-for, Iterator
		ArrayList<MemberModel> list = new ArrayList<MemberModel>();

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.print("아이디를 입력하세요 : ");
			String id = sc.nextLine();
			
			System.out.print("패스워드를 입력하세요 : ");
			String pw = sc.nextLine();
			
			MemberModel model = new MemberModel(id, pw);
			list.add(model);
		}
		
		sc.close();
		
		// 1) Iterator
		System.out.println("\n1) Iterator");
		Iterator<MemberModel> itr = list.iterator();
		while(itr.hasNext()) {
			itr.next().displayInfo();
		}
		
		// 2) Enhanced-for
		System.out.println("\n2) Enhanced-for");
		for(MemberModel e : list) {
			e.displayInfo();
		}
		
		// 3) for
		System.out.println("\n3) for");
		for(int i = 0; i < list.size(); i++) {
			list.get(i).displayInfo();
		}
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












