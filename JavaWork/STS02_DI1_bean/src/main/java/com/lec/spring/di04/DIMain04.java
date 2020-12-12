package com.lec.spring.di04;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.lec.spring.Student;

public class DIMain04 {

	public static void main(String[] args) {
		System.out.println("Main 시작");
		
		// 컨테이너 생성
		GenericXmlApplicationContext ctx
				= new GenericXmlApplicationContext("classpath:studentCtx.xml");
		System.out.println("--컨테이너 생성--");
		
		Student stu1 = ctx.getBean("Hong", Student.class);
		System.out.println(stu1);
		
		Student stu2 = ctx.getBean("Joo", Student.class);
		System.out.println(stu2);
		
		System.out.println();
		stu2.getScore().setKor(100);
		System.out.println(stu2);

		System.out.println(stu1);	// Hong의 국어 점수도 바뀌어 있다
									// 왜냐하면 Hong과 Joo는 같은 score의 레퍼런싱 하고 있어서 그럼...!!
		
		ctx.close();
		System.out.println("Main 종료");
	}

}
