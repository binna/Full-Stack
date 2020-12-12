package com.lec.java.file14;

import java.nio.charset.Charset;

public class File14Main {

	public static void main(String[] args) {
		System.out.println("시스템 정보 확인");
		
		System.out.println();
		System.out.println(System.getProperty("os.name"));
		
		// 출력 amd64: amd의 64비트라는 의미
		System.out.println(System.getProperty("os.arch"));	
		
		System.out.println(System.getProperty("os.version"));
		
		System.out.println();
		// JRE 경로 : Java Runtime Environment <-- JVM
		System.out.println(System.getProperty("java.home"));
		
		System.out.println(System.getProperty("java.version"));
		
		System.out.println();
		// current working directory : 현재 작업 경로
		System.out.println(System.getProperty("user.dir"));
		
		// user home directory("내 문서"가 있는 폴더)
		System.out.println(System.getProperty("user.home"));
		
		System.out.println();
		// 윈도우는 역슬래시를 씀, 그 운영체제에서 제공되는 file.separator가 뭐냐
		System.out.println(System.getProperty("file.separator"));
		
		System.out.println();
		// OS 기본 인코딩 값!
		System.out.println("Default Charset = " + Charset.defaultCharset());
		System.out.println("file.encoding = " + System.getProperty("file.encoding"));

		
		System.out.println("\n프로그램 종료");
		
	} // end main()

} // end class














