package com.lec.sts19_rest.board.beans;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")	// <employee>
public class EmployeeVO {
	@XmlAttribute	// "id" attribute
	private Integer id;
	
	@XmlElement		// <name> element
	private String name;
	
	@XmlElement		// <age> element
	private int age;
	
	@XmlElement		// <score> elements(즉, element 들)
	private int[] score;
	
	// 어노테이션 없으면 XML변환에 포함 안됨
	private double point;
	
	public EmployeeVO() {}
	public EmployeeVO(Integer id, String name, int age, int[] score, double point) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
		this.point = point;
	}


	// getter만 제공 : read-only 속성, immutable
	public final Integer getId() {
		return id;
	}
	public final String getName() {
		return name;
	}
	public final int getAge() {
		return age;
	}
	public final int[] getScore() {
		return score;
	}
	public final double getPoint() {
		return point;
	}
	
}