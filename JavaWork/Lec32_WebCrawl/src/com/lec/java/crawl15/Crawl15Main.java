package com.lec.java.crawl15;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

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

public class Crawl15Main {

	public static void main(String[] args) throws IOException {
		System.out.println("jackson-databind 연습2 : URL -> json -> Java");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String needURL = "http://swopenapi.seoul.go.kr/api/subway/704c4a6d7262696e33396a544e7551/json/stationInfo/1/5/"
				+ URLEncoder.encode("서울", "utf-8");
		
		URL url = new URL(needURL);
		
		Subway subway = mapper.readValue(url, Subway.class);
		
		for(SubRow e : subway.getStationList()) {
			
			System.out.println(e.getStatnNm() + "역\t " + 
					e.getSubwayId() + "\t" + e.getSubwayNm());
		} // end for
		
	} // end main()

} // end class

@JsonIgnoreProperties(ignoreUnknown = true)
class Subway {
	
	private List<SubRow> stationList;

	public List<SubRow> getStationList() {return stationList;}
	public void setStationList(List<SubRow> stationList) {this.stationList = stationList;}
} // end Subway	
	

@JsonIgnoreProperties(ignoreUnknown = true)
class SubRow {
	private String statnNm;
	private String subwayId;
	private String subwayNm;
	
	public String getStatnNm() {return statnNm;}
	public void setStatnNm(String statnNm) {this.statnNm = statnNm;}
	
	public String getSubwayId() {return subwayId;}
	public void setSubwayId(String subwayId) {this.subwayId = subwayId;}
	
	public String getSubwayNm() {return subwayNm;}
	public void setSubwayNm(String subwayNm) {this.subwayNm = subwayNm;}
} // end SubRow









