package com.mvn.junitTest12;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class AppTest3 {
	
	private String expected;
	private String value;
	
	@Parameters
	public static Collection<String[]> getTestParameters() {
		return Arrays.asList(new String[][] {
			{"01012345678", "010-1234-5678"},
			{"01012121212", "010-1212-1212"},
			{"01099787788", "010-9978-7788"},
			{"01095143578", "010-9514-3578"}
		});
	}
	
	public AppTest3(String expected, String value) {
		super();
		System.out.println("AppTest3() 생성");
		this.expected = expected;
		this.value = value;
	}
	
	// 실습3
	@Test
	public void test3() {
		App app = new App();
		assertEquals(expected, app.toNumber(value));
		System.out.println("테스트 통과: " + expected + ", " + value);
	}

}