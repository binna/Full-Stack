package com.mvn.junitTest12;

import static org.junit.Assert.fail;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.junit.Test;

public class AppTest {
	
	private App app = new App();
	
    // 실습 1
    @Test
    public void test1() {
    	// 테스트할 int 배열 만들기
    	int[] testArr = {1, 5, 3, 7, 2};
    	
    	// 만약 정상적으로 sort 되었다면 나올 결과값
    	int[] resultArr = {1, 2, 3, 5, 7};
    	
    	// 검사하고자하는 메서드 실행
    	app.sortArr(testArr);
    	
        for (int i = 0; i < testArr.length; i++) {
        	
        	if(testArr[i] != resultArr[i]) {
        		fail();
        	}
			
		}
    }
    
    // 실습 2
    @Test
    public void test2() {
    	// 테스트할 int 배열 만들기
    	int[] testArr = {1, 5, 3, 7, 2};
    	
    	// 검사값
    	int resultMax = 7;
    	int resultMin = 1;
    	
    	// 검사하고자하는 메서드 실행, 리턴값 담기
    	int max = app.max(testArr);
    	int min = app.min(testArr);
    	
    	if(max == resultMax && min == resultMin) {
    		
    		try {
    			OutputStream out = new FileOutputStream("test/report.txt");
    			
    		    String str = "최대값 : " + max + ", 최소값 : " + min;
    		    byte[] by = str.getBytes();
    		    
    		    out.write(by);
    		} catch (Exception e) {
    	            e.getStackTrace();
    		}
    	} else {
    		fail();
    	}
    	
    }
    
}