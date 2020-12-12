package com.command;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lec.beans.AjaxCategoryList;
import com.lec.beans.CategoryDTO;

public class AjaxCategoryListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		CategoryDTO[] dtoArr = (CategoryDTO[]) request.getAttribute("list");
		
		AjaxCategoryList list  = new AjaxCategoryList();	// response할 자바 객체
		
		list.setStatus((String)request.getAttribute("status"));
		list.setMessage((String)request.getAttribute("message"));
		
		if(dtoArr != null) {
			list.setCount(dtoArr.length);
			list.setList(Arrays.asList(dtoArr));
		} // end if
		
		// depth 가 2이상인데 parent 가 없거나 parent가 유효하지 않은 uid인 경우
		if(list.getCount() == 0) {
			list.setMessage("0개의 데이터");
		}
		
		
		// json 매핑
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			String jsonStirng = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
			response.setContentType("application/json; charset=utf-8");
			response.getWriter().write(jsonStirng);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // end execute()

} // end Command