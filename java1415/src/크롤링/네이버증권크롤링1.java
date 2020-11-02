package 크롤링;

import java.io.IOException;
import java.util.ArrayList;

import javax.print.Doc;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링1 {

	public static void main(String[] args) {
		// 크롤링 : 웹사이트에서 정보를 가지고 오는 것
		// 단순 : 스크랩핑
		// 단순+@ : 크롤링
		// 크롤링 순서
		// 1. 사이트 연결
		// 2. 해당페이지다운로드(html)
		// 3. 원하는 위치의 정보를 추출해냄
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=293490");
		try {
			Document doc = con.get();
			Elements list = doc.select("h2 > a");
			String name = list.get(0).text();
			System.out.println("회사 이름 : " + name);

			Elements list2 = doc.select("span.code");
			String code = list2.get(0).text();
			System.out.println("회사 코드 : " + code);

			Elements list3 = doc.select("div.today");
			Elements list4 = list3.select(".blind");
			String now = list4.get(0).text(); // 현재가
			String dif = list4.get(1).text(); // 차이
			String percent = list4.get(2).text(); // 증감비율
			System.out.println("현재가 : " + now);
			System.out.println("어제와의 차이 : " + dif);
			System.out.println("증감비율 : " + percent);
			
			//한번에 가져오기
			Elements list5 = doc.select("td.first span.blind");
			Elements list6 = doc.select("em.no_up > span.blind");
			String yesterday = list5.get(0).text();
			String TodayStart = list6.get(0).text();
			System.out.println("-------");
			System.out.println("전일가격 : " + yesterday);
			System.out.println("고가 : " + TodayStart);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
