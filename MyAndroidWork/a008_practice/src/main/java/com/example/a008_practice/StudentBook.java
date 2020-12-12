package com.example.a008_practice;

import java.io.Serializable;

// 학생들 명단을 담을 클래스
public class StudentBook implements Serializable {
    String name;    // 이름
    String age;    // 나이
    String address; // 주소

    public StudentBook() {
    }

    public StudentBook(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    // getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

} // end StudentBook