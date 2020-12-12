package com.lec.spring.config04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigMain04 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx
			= new AnnotationConfigApplicationContext(Appconfig04.class);
		System.out.println("-- ctx 생성 --");
		
		// 중복된 값 -> XML에 적용된 값이 나중에...!!
		
		
		// XML에서 설정
		System.out.println(ctx.getBean("score1"));
		
		// Java에서 설정
		System.out.println(ctx.getBean("score2"));

		ctx.close();
	}

}