package com.lec.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AjaxCategoryList {
	
	private int count;   			// 데이터 개수
	@JsonProperty("data")
	private List<CategoryDTO> list;	// 리스트
	private String message;			// 처리 메세지
	private String status;			// 처리 결과
	
	
	// 기본생성자
	public AjaxCategoryList() {}

	
	// getter, setter
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public List<CategoryDTO> getList() {
		return list;
	}
	public void setList(List<CategoryDTO> list) {
		this.list = list;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

} // end AjaxCategoryList()