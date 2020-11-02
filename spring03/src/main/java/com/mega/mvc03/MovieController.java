package com.mega.mvc03;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //컨트롤러
public class MovieController {
	@Autowired
	CarPrice service;
	
	@RequestMapping("checkID.do")
	public void checkID(String id,Model model) {
		String result = service.checkID(id);
		model.addAttribute("result",result);
	}
	
	@RequestMapping("reply.do")
	public void reply(String reply, Model model) {
		//db처리했음
		//view로 넘어감
		model.addAttribute("reply",reply);
	}
	
	@RequestMapping("movielike.do")//헨들러맵핑
	public String movie(String title,int price,Model model) { //제목 관람료를 인자로 받기! , 객체생성도 가능하다구 CarPrice cp
		System.out.println(title);
		System.out.println(price);
		
		price = service.CarPrice(price);
		
		//view 페이지에 넘겨줘야할 값
		model.addAttribute("title",title);
		model.addAttribute("price",price);
		
		return "like"; //view페이지 like 호출
	}
}
