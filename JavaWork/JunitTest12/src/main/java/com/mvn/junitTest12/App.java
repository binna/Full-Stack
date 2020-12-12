package com.mvn.junitTest12;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {
    	
    	App binna = new App();
    	
    	int[] sortNeed = {2, 5, 3, 1};
    	
    	binna.sortArr(sortNeed);
    	
    	System.out.print("오름차순 : ");
    	for (int i = 0; i < sortNeed.length; i++) {
			System.out.print(sortNeed[i] + " ");
		}
    	
    	System.out.println();
    	System.out.println("max : " + binna.max(sortNeed));
    	System.out.println("min : " + binna.min(sortNeed));
    	
    	System.out.println("toNumber() : " + binna.toNumber("010-4537-2233"));
    	
    }
    
    // 실습 1
    // int[]을 매개변수로 받아 배열의 내용을 오름차순으로 정렬하는 메소드 작성
    public void sortArr(int[] arr) {
    	for (int i = 0; i < arr.length - 1; i++) {
    		for (int j = i + 1; j < arr.length; j++) {
    			if(arr[i] > arr[j]) {
    				int temp = arr[i]; 
    				arr[i] = arr[j];
    				arr[j] = temp; 
    			}
			}
		}
    } // end sortArr()
    
    // 실습 2
    public int max(int[] arr) {
    	int max = arr[0];
    	
    	for (int i = 1; i < arr.length; i++) {
    		if(max < arr[i]) {
    			max = arr[i];
    		}
		}
    	
    	return max;
    } // end max()
    public int min(int[] arr) {
    	int min = arr[0];
    	
    	for (int i = 1; i < arr.length; i++) {
    		if(min > arr[i]) {
    			min = arr[i];
    		}
		}
    	
    	return min;
    }
    
    // 실습3
    public String toNumber(String str) {
    	String result = "";
    	
    	for (int i = 0; i < str.length(); i++) {
    		char temp = str.charAt(i);
    		
    		if(48 <= temp && temp <= 57) {
    			result += temp + "";
    		}
		}
    	
    	return result;
    } // end toNumber()
    
}