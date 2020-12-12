package com.lec.java.crawl11;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/*
 * XML, JSON 파싱 연습
 * ■서울시 지하철 역사 정보
 * http://data.seoul.go.kr/dataList/datasetView.do?infId=OA-12753&srvType=A&serviceKind=1&currentPageNo=1
 * 
 * 샘플url
 * 
 * XML 버젼
 * http://swopenAPI.seoul.go.kr/api/subway/704c4a6d7262696e33396a544e7551/xml/stationInfo/1/5/서울
 * 
 * JSON 버젼
 * http://swopenAPI.seoul.go.kr/api/subway/704c4a6d7262696e33396a544e7551/json/stationInfo/1/5/서울
 * 
 */
public class Crawl11Main {
	
	public static final String REQ_SERVICE = "stationInfo";
	public static final String API_KEY = "704c4a6d7262696e33396a544e7551";	// 내 인증키

	public static void main(String[] args) throws IOException {
		System.out.println("서울시 지하철 역사(station) 정보");
		
		int startIndex;	// 요청 시작 위치 정수 입력 (페이징 시작번호입니다 : 데이터행 시작번호)
		int endIndex;	// 요청 종료 위치 정수 입력 (페이징 끝번호 입니다 : 데이터 행 끝번호)
		String place;	// 날짜 yyyymmdd 형식
		
		String url_address;
		StringBuffer sb;	// response 받은 텍스트
		
		startIndex = 1;
		endIndex = 5;
		place = "서울";
		
		System.out.println("--- XML 파싱 ---");
		url_address = buildUrlAddress("xml", startIndex, endIndex, place);
		//System.out.println(url_address);	// 확인용
		sb = readFromUrl(url_address);
		parseXML(sb.toString());
		
		System.out.println();
		System.out.println();
		System.out.println("--- JSON 파싱 ---");
		url_address = buildUrlAddress("json", startIndex, endIndex, place);
		//System.out.println(url_address);
		sb = readFromUrl(url_address);
		parseJSON(sb.toString());
		
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
	
	public static String buildUrlAddress(String reqType, int startIndex, int endIndex, String place) throws IOException {
		
		String url_address = (String.format("http://swopenapi.seoul.go.kr/api/subway/%s/%s/%s/%d/%d/",
				API_KEY, reqType, REQ_SERVICE, startIndex, endIndex)) + URLEncoder.encode(place, "utf-8");
		
		return url_address;
	}
	
	/**
	 * 
	 * @param urlAddress : 주어진 url 주소
	 * @return 서버로부터 받은 텍스트데이터(HTML) 리턴
	 */
	public static StringBuffer readFromUrl(String urlAddress) {
		
		StringBuffer sb = new StringBuffer();	// response 받은 데이터 담을 객체
		
		URL url = null;	// java.net.URL
		HttpURLConnection conn = null;	// java.net.HttpURLConnectrion
		
		InputStream in = null;
		InputStreamReader reader = null;	// byte 스트림 --> 문자기반 Reader
		BufferedReader br = null;
		
		char[] buf = new char[512];	// 문자용 버퍼
		
		// BufferedReader <- InputStreamReader <- InputStream <- HttpURLConnection 
		
		try {
			url = new URL(urlAddress);
			conn = (HttpURLConnection)url.openConnection();  // Connection 객체 생성
			
			if(conn != null) {
				conn.setConnectTimeout(2000);	// 2초이내에 '연결'이 수립안되면
												// java.net.SocketTimeoutException 발생
				
				conn.setRequestMethod("GET");	// GET 방식	request
				// "GET", "POST", ...
				conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
				conn.setUseCaches(false);	// 캐시사용안함
				
				System.out.println("request 시작: " + urlAddress);
				conn.connect();	// request 발생 --> 이후 response 받을때까지 delay
				System.out.println("response 완료");
				
				// response 받은 후 가장 먼저 response code 값 확인
				int restponseCode = conn.getResponseCode();
				System.out.println("response code: " + restponseCode);
				// 참조 : https://developer.mozilla.org/ko/docs/Web/HTTP/Status
				if(restponseCode == HttpURLConnection.HTTP_OK) {
					
					in = conn.getInputStream();		// InputStream <- HttpURLConnection
					reader = new InputStreamReader(in, "utf-8");// InputStreamReader <- InputStream
					br = new BufferedReader(reader); 	// BufferedReader <- InputStreamReader
					
					int cnt;	// 읽은 글자 개수
					while((cnt = br.read(buf)) != -1) {
						sb.append(buf, 0, cnt);	// response 받은 텍스트를 StringBuffer 에 추가
						
					}
					
				} else {
					System.out.println("response 실패");
					return null;
				}
				
			} else {
				System.out.println("conn null");
				return null;
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(conn != null) {conn.disconnect();}	// 작업 끝나고 Connection 해제
		}
		
		return sb;
		
	}

	public static void parseXML(String xmlText) {
		// XML 파싱
		DocumentBuilderFactory dbFactory;
		DocumentBuilder dBuiler;
		
		try {
			// DOM parser 객체 생성
			dbFactory = DocumentBuilderFactory.newInstance();
			dBuiler = dbFactory.newDocumentBuilder();
			
			// String -> InputStream 변환
			InputStream in = new ByteArrayInputStream(xmlText.getBytes("utf-8"));
			
			// InputStream -> DOM 객체 생성
			Document dom = dBuiler.parse(in);
			
			// DOM 최상위 document element 추출
			Element docElement = dom.getDocumentElement();	// DOM 의 최상위 element
			
			// 파싱하기전 꼭꼭 normalize()!!!
			docElement.normalize();	// 흩어진 text node 들을 정렬하는 등의 절차
			
			// DOM 내의 데이터 파싱.
			NodeList nList = docElement.getElementsByTagName("row");	// <row> ... </row> element 들로 구성된 NodeList 리턴
			
			System.out.println("<row> 개수 : " + nList.getLength());
			
			//statnNm     subwayId subwayNm
			//역이름	호선 id	이름
			
			System.out.println();
			for (int i = 0; i < nList.getLength(); i++) {
				Node node = nList.item(i);
				
				//System.out.println("node type : " + node.getNodeType());
				// element node 인 경우만 파싱 진행
				if(node.getNodeType() != Node.ELEMENT_NODE) {continue;}
				
				// 오른쪽이 부모일 때, 형변환이 필요...!!
				Element rowElement = (Element)node;
				
				String statnNm =
						rowElement.getElementsByTagName("statnNm").item(0).getChildNodes().item(0).getNodeValue().trim();
				String subwayId =
						rowElement.getElementsByTagName("subwayId").item(0).getChildNodes().item(0).getNodeValue().trim();
				String subwayNm =
						rowElement.getElementsByTagName("subwayNm").item(0).getChildNodes().item(0).getNodeValue().trim();
				
				System.out.println((i + 1) + " "+ statnNm + "역 " + subwayId + " " + subwayNm);
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // end parseXML()
	
	public static void parseJSON(String jsonText) {

		JSONObject jObj = new JSONObject(jsonText);	// JSON 파싱 <- String
		JSONArray row = jObj.getJSONArray("stationList");
		
		System.out.println("<row> 의 개수 : " + row.length());
		System.out.println();
		
		for(int i = 0; i < row.length(); i++) {
			JSONObject station = row.getJSONObject(i);
			
			String statnNm = station.getString("statnNm");
			String subwayId = station.getString("subwayId");
			String subwayNm = station.getString("subwayNm");
			
			System.out.println((i + 1) + " "+ statnNm + "역 " + subwayId + " " + subwayNm);

		} // end for
		
	} // end parseJSON()
	
} // end class



























