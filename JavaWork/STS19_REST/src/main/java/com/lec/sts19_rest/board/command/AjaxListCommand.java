package com.lec.sts19_rest.board.command;

import java.io.IOException;
import java.util.Arrays;

import javax.activation.CommandObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;


public class AjaxListCommand implements BCommand {

	@Override
	public void execute(Model model) {
//		WriteDTO [] dtoArr = (WriteDTO [])request.getAttribute("list");
//		
//		AjaxWriteList result = new AjaxWriteList();
//		
//		result.setStatus((String)request.getAttribute("status"));
//		result.setMessage((String)request.getAttribute("message"));
//		
//		if(dtoArr != null) {
//			result.setCount(dtoArr.length);
//			result.setList(Arrays.asList(dtoArr));
//		}
//		
//		// 페이징 할때 필요한 값들
//		try {			
//			result.setPage((Integer)request.getAttribute("page"));
//			result.setTotalPage((Integer)request.getAttribute("totalPage"));
//			result.setWritePages((Integer)request.getAttribute("writePages"));
//			result.setPageRows((Integer)request.getAttribute("pageRows"));
//			result.setTotalCnt((Integer)request.getAttribute("totalCnt"));
//		} catch(Exception e) {
//			// 무시하기...!!    
//			//view.ajax 에선 페이징 관련 변수값들이 없다..
//		}
//		
//		
//		ObjectMapper mapper = new ObjectMapper();  // Json 매핑할 객체
//		
//		try {
//			String jsonString = 
//					mapper.writerWithDefaultPrettyPrinter()
//						.writeValueAsString(result);
//			response.setContentType("application/json; charset=utf-8"); 
//			response.getWriter().write(jsonString);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
	} // end execute()

} // end Command