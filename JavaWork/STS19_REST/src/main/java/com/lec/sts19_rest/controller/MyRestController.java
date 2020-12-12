package com.lec.sts19_rest.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lec.sts19_rest.board.C;
import com.lec.sts19_rest.board.beans.BWriteDTO;
import com.lec.sts19_rest.board.beans.EmployeeListVO;
import com.lec.sts19_rest.board.beans.EmployeeVO;
import com.lec.sts19_rest.board.beans.IWriteDAO;

@RestController
@RequestMapping("/MyRest")
public class MyRestController {
	
	@RequestMapping("/")
	public String helloTEXT() {
		return "Hello REST";
	} // end helloTEXT()
	
	@RequestMapping("/helloJSON")
	public BWriteDTO helloJSON() {
		BWriteDTO dto
			= new BWriteDTO(100, "안녕하세요", "REST", "JSON이당!", 123, new Timestamp(100000));
		
		return dto;
	} // end helloJSON()
	
	// JSON 데이터 <-- 자바 List<>
	@RequestMapping("/listSJON")
	public List<BWriteDTO> listJSON() {
		IWriteDAO dao = C.sqlSession.getMapper(IWriteDAO.class);
		return dao.select();
	} // end listJSON()
	
	// JSON 데이터 <-- 자바 배열
	@RequestMapping("/arrJSON")
	public BWriteDTO[] arrJSON() {
		IWriteDAO dao = C.sqlSession.getMapper(IWriteDAO.class);
		List<BWriteDTO> list = dao.select();
		BWriteDTO[] arr = new BWriteDTO[list.size()];
		return list.toArray(arr);
	}
	
	// JSON 데이터 <-- 자바 Map<k, v>
	@RequestMapping("/mapJSON")
	public Map<Integer, BWriteDTO> mapJSON() {
		IWriteDAO dao = C.sqlSession.getMapper(IWriteDAO.class);
		List<BWriteDTO> list = dao.select();
		
		Map<Integer, BWriteDTO> map = new HashMap<Integer, BWriteDTO>();
		
		for(BWriteDTO dto : list) {
			map.put(dto.getUid(), dto);
		}
		
		return map;
		
	} // end mapJSON()
	
	// XML데이터 <-- 자바객체
	@RequestMapping("/helloXML")
	public EmployeeVO helloXML() {
		return new EmployeeVO(100, "홍길동", 200, new int[] {10, 20, 30}, 34.2);
	} // end EmployeeVO()
	
	// XML데이터 <-- 자바 List<>
	@RequestMapping("/listXML")
	public EmployeeListVO listXML() {
		EmployeeListVO employees = new EmployeeListVO();
		
		EmployeeVO emp1 = new EmployeeVO(1, "김재현", 24, new int[] {78, 67, 92}, 34.2);
		EmployeeVO emp2 = new EmployeeVO(2, "킹재현", 25, new int[] {22, 55, 88}, 34.2);
		EmployeeVO emp3 = new EmployeeVO(3, "재현 킴", 27, new int[] {100, 200, 300}, 34.2);
		
		employees.getEmployees().add(emp1);
		employees.getEmployees().add(emp2);
		employees.getEmployees().add(emp3);
		
		return employees;
	
	} // end listXML()
	
	@RequestMapping("/read/{uid}")
	public ResponseEntity<BWriteDTO> read(@PathVariable("uid") int uid) {
		IWriteDAO dao = C.sqlSession.getMapper(IWriteDAO.class);
		
		// 없는 값도 Status Code가 200이란 점이 문제!
		// 없는 값은 404 에러가 발생할 수 있도록 처리 필요
		BWriteDTO dto = dao.selectByUid(uid);
		
		// 실패
		if(dto == null) {return new ResponseEntity(HttpStatus.NOT_FOUND);}	// 404 에러
		
		// 성공
		return new ResponseEntity<BWriteDTO>(dto, HttpStatus.OK);	// 200
	} // end read()
	
} // end Controller