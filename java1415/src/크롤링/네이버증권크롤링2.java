package 크롤링;

import java.io.IOException;
import java.util.ArrayList;

import javax.print.Doc;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {
//	sk하이닉스 000660
//	삼선전자 005935
//	카카오게임즈 293490
//	랩지노믹스 084650
//	시노펙스 025320
	public String[] crawl(String codes) { //codes 를 전달받아 해당페이지 소스 가져오기
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + codes);
		String[] result = null;
		try {
			Document doc = con.get();
//			Elements list = doc.select("h2 > a");
//			String name = list.get(0).text();
//			System.out.println("회사 이름 : " + name);

//			Elements list2 = doc.select("span.code");
//			String code = list2.get(0).text();
//			System.out.println("회사 코드 : " + code);

			Elements list3 = doc.select("div.today"); //현재가 2번 select
			Elements list4 = list3.select(".blind");
			String now = list4.get(0).text(); // 현재가
//			String dif = list4.get(1).text(); // 차이
//			String percent = list4.get(2).text(); // 증감비율
//			System.out.println("현재가 : " + now);
//			System.out.println("어제와의 차이 : " + dif);
//			System.out.println("증감비율 : " + percent);
//			System.out.println("-------");
			
			//result = new String[] {name,code,now,dif,percent};
			//한번에 가져오기
			Elements list5 = doc.select("td.first span.blind"); //전일가
			Elements list6 = doc.select("em.no_up > span.blind");//고가
			String yesterday = list5.get(0).text();
			String TodayStart = list6.get(0).text();
			result = new String[] {now,yesterday,TodayStart}; // result배열에 담아 return
//			System.out.println("-------");
//			System.out.println("전일가격 : " + yesterday);
//			System.out.println("고가 : " + TodayStart);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
