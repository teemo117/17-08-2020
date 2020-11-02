package com.mega.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	//2.컨트롤러에서 받아주고 
	@RequestMapping("page2.mega")//이게 요청되면 메서드 호출
	public void page2(String id, String pw, Model model) {
		System.out.println("이 메서드가 자동 호출됨");
		System.out.println("컨트롤러에서 받은 ID : "+id);
		System.out.println("컨트롤러에서 받은 PW : "+pw);
		//3.DAO 객체 써서 db처리
		 String result = "로그인 실패";
		    if(id.equals("root") && pw.equals("1234")){
		    	result = "로그인 성공";	
		    }
		//4.처리 결과를 가지고 jsp 페이지로 간다
		model.addAttribute("result",result);
	}
}
