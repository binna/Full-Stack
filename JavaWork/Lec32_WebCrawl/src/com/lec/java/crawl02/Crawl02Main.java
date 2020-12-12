package com.lec.java.crawl02;

import org.jsoup.Jsoup;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl02Main {
	public static void main(String[] args) throws IOException {
		System.out.println("네이트 인기 검색어");
		
		// TODO
		// https://www.nate.com/
		String url;
		Response response;
		Document doc;
		Element element;
		
		url = "https://www.nate.com/";
		response = Jsoup.connect(url).execute();
	
		// 접속 성공, request 결과 코드 200 출력 완..!!
		System.out.println(response.statusCode());
		doc = response.parse();
		
		Elements search_elements = doc.select(".search_keyword dd a");
		System.out.println(search_elements.size() + "개");
		
		for(Element e : search_elements) {
			System.out.println(e.text().trim());
		}
		
		System.out.println();
		for(Element e : search_elements) {
			System.out.println(e.attr("href").trim());
		}
		
		
		System.out.println("\n프로그램 종료");
	}
}
