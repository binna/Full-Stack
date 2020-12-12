package daily.dailysum;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * 연습 : 자치구단위 서울 생활인구 일별 집계표
 * ■자치구단위 서울 생활인구 일별 집계표
 * 	http://data.seoul.go.kr/dataList/datasetView.do?infId=OA-15379&srvType=S&serviceKind=1&currentPageNo=1
 * 	http://openapi.seoul.go.kr:8088/(인증키)/(요청파일타입)/SPOP_DAILYSUM_JACHI/(요청시작INDEX)/(요청종료INDEX)/(기준일ID)/(시군구코드)
 * 
 * 샘플url
 * 	XML 버젼 
 * 	http://openapi.seoul.go.kr:8088/704c4a6d7262696e33396a544e7551/xml/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/20190101
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/20190101/11000
 * 
 * 	JSON 버젼
 * 	http://openapi.seoul.go.kr:8088/704c4a6d7262696e33396a544e7551/json/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/	
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/20190101
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/20190101/11000
 * 
 * ※ 한번에 1000개 까지의 데이터만 볼수 있슴
 * 
 */

/*  입력예]
 *  날짜입력: 20190101
 *  시작Index : 1
 *  끝Index: 5
 *  
 *  [XML]
 *  날짜             구ID        총생활인구수           일최대이동인구수
 *  ----------------------------------------------------------------------
 *  20190101	11000    11121182.98210      4764635.18080 
 *  20190101    11110    274919.65940        177877.95000 
 *  20190101    11140    267096.65940        149729.45840 
 *  20190101    11170    315220.18480        149329.14120 
 *  20190101    11200    351993.77950        153738.94490
 *   
 *  [JSON]
 *  날짜             구ID        총생활인구수           일최대이동인구수
 *  ----------------------------------------------------------------------
 *  20190101	11000    11121182.98210      4764635.18080 
 *  20190101    11110    274919.65940        177877.95000 
 *  20190101    11140    267096.65940        149729.45840 
 *  20190101    11170    315220.18480        149329.14120 
 *  20190101    11200    351993.77950        153738.94490 
 * 
 */

// ★ 주목 ★
// XML 은 Jsoup 를 활용하여 파싱하세요
// JSON 은  jackson 을 활용하여 파싱하세요


public class DailySumMain {

	public static void main(String[] args) throws IOException {

		System.out.println("[XML]");
		
		String needUrl = "http://openapi.seoul.go.kr:8088/704c4a6d7262696e33396a544e7551/xml/SPOP_DAILYSUM_JACHI/1/5/";
		Response response;
		Document doc;
		Element element;
		Elements elements;
		
		response = Jsoup.connect(needUrl).execute();
		//System.out.println(response.statusCode());
		
		doc = response.parse();
		//System.out.println(doc.outerHtml());
		
		elements = doc.select("row");
		//System.out.println(elements.outerHtml());
		//System.out.println(elements.size() + " 개");
		
		System.out.println("      날짜\t\t구ID\t총생활인구수\t일최대이동인구수");
		System.out.println("----------------------------------------------------------------------");
		for(Element e : elements) {
			System.out.println(
					e.select("STDR_DE_ID").text().trim() + "\t"
					+ e.select("SIGNGU_CODE_SE").text().trim() + "\t"
					+ e.select("TOT_LVPOP_CO").text().trim() + "\t"
					+ e.select("DAIL_MXMM_LVPOP_CO").text().trim());
		}
				
		
		
		
		System.out.println("\n[JSON]");
		ObjectMapper mapper = new ObjectMapper();
		
		String urladdress = "http://openapi.seoul.go.kr:8088/704c4a6d7262696e33396a544e7551/json/SPOP_DAILYSUM_JACHI/1/5/";
		
		URL url = new URL(urladdress);
		
		Subway subway = mapper.readValue(url, Subway.class);
		
		System.out.println("      날짜\t\t구ID\t총생활인구수\t일최대이동인구수");
		System.out.println("----------------------------------------------------------------------");
		
		for(Row e : subway.getSPOP_DAILYSUM_JACHI().getRow()) {
			System.out.println(e.getDate() + "\t" + e.siGunGuCode + "\t" + e.total + "\t" + e.max);
		}
		
	} // end main

} // end class


class Subway{
	
	public Stats SPOP_DAILYSUM_JACHI;

	public Stats getSPOP_DAILYSUM_JACHI() {return SPOP_DAILYSUM_JACHI;}
	public void setSPOP_DAILYSUM_JACHI(Stats sPOP_DAILYSUM_JACHI) {SPOP_DAILYSUM_JACHI = sPOP_DAILYSUM_JACHI;}
	
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Stats {
	
	private List<Row> row;

	public List<Row> getRow() {return row;}
	public void setRow(List<Row> row) {this.row = row;}
	
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Row {
	
	@JsonProperty("STDR_DE_ID")
	int Date ;	// 기준일ID
	
	@JsonProperty("SIGNGU_CODE_SE")
	int siGunGuCode;	// 시군구코드
	
	@JsonProperty("TOT_LVPOP_CO")
	double total;	// 총생활인구
	
	@JsonProperty("DAIL_MXMM_LVPOP_CO")
	double max;	// 일최대인구수

	public int getDate() {return Date;}
	public void setDate(int date) {Date = date;}

	public int getSiGunGuCode() {return siGunGuCode;}
	public void setSiGunGuCode(int siGunGuCode) {this.siGunGuCode = siGunGuCode;}

	public double getTotal() {return total;}
	public void setTotal(double total) {this.total = total;}

	public double getMax() {return max;}
	public void setMax(double max) {this.max = max;}
	
}
















