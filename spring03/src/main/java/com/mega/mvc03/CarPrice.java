package com.mega.mvc03;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CarPrice {
	@Autowired
	MemberDAO dao;
	
	public String checkID(String id) {
		String[] idArr = {"root","admin","apple","melon","mint"};
		List<String> list = Arrays.asList(idArr);
		String result = "<p id='r1'>사용가능</p>";//"<font color=blue>사용가능";
		if(list.contains(id)) {
			result = "<p id='r2'>사용불가능</p>";
		}
		return result;
	}
	//가격 받아와서 할인 후 리턴
	public int CarPrice(int price) {
		if(price>=10000) { //1만원ㅇ면 할인
			price -= 1000;
		}
		
		return price;
	}
}
