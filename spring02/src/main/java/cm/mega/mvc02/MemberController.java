package cm.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@RequestMapping("insert.do")
	public void member(String id, String pw, String name) {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
		System.out.println("이름 : " + name);
		String result = "성공";
		if(id.equals("")|| pw.equals("")|| name.equals("")) {
			result = "실패";
		}
		System.out.println(result);
		//DB처리
	}
}
