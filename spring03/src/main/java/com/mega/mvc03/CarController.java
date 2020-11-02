package com.mega.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//일반 자바 파일 : POJO(Plain Old Java Object)
//Controller 기능을 가진 클래스로 만들고 싶으면, 상속!!
//Controller 어노테이션을 쓰면 내부적으로 일어나는일
//1)상속
//2)핸들러 맵퍼에  키:값 등록 키 - 요청되는 주소 , 값 - 객체의 메서드
@Controller
public class CarController {
	
	//컨트롤러에서 view까지 넘어가기 위한 항목 : view페이지, model의 값
	//뷰페이지랑 MODEL값 따로넘김
	@RequestMapping("car.do")
	public String car(String color,Model model) { //이름을 달리할경우 @RequestParam("color")
		System.out.println("컨트롤러에서 받은 색은 " + color);
		model.addAttribute("color",color);
		return "img";
	}
}
