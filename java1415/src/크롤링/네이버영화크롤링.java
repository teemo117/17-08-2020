package 크롤링;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버영화크롤링 {

	public static void main(String[] args) {
		// 크롤링 : 웹사이트에서 정보를 가지고 오는 것
		// 단순 : 스크랩핑
		// 단순+@ : 크롤링
		// 크롤링 순서
		// 1. 사이트 연결
		// 2. 해당페이지다운로드(html)
		// 3. 원하는 위치의 정보를 추출해냄
		Connection con = Jsoup.connect("https://movie.naver.com/movie/bi/mi/basic.nhn?code=190010");
		System.out.println("1. 사이트 연결 성공");
		try {
			Document doc = con.get();
			//ArrayList<Element> list1 = doc.select("dl.info_spec");
			Elements list = doc.select("dl.info_spec");
			System.out.println(list.get(0).text());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
