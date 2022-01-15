package com.readerkit.restapi.login;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping
	public String Home() {
		return "home";
	}
	
	@RequestMapping("jusoPopup")
	public String JusoPopup(HttpServletRequest request, Model model) {
		String inputYn = request.getParameter("inputYn");
		String roadAddrPart1 = request.getParameter("roadAddrPart1");
		String addrDetail = request.getParameter("addrDetail");
		String roadAddrPart2 = request.getParameter("roadAddrPart2");
		String zipNo = request.getParameter("zipNo");
		
		model.addAttribute("inputYn",inputYn);
		model.addAttribute("roadAddrPart1",roadAddrPart1);
		model.addAttribute("addrDetail",addrDetail);
		model.addAttribute("roadAddrPart2",roadAddrPart2);
		model.addAttribute("zipNo",zipNo);
		
		return "jusoPopup";
	}
	
	@RequestMapping("login")
	public String login(HttpServletRequest request, Model model) {
		return "login";
	}
	
	@RequestMapping("main")
	public String main(HttpServletRequest request, Model model) {
		String userId = request.getParameter("user_id");
		String userPw = request.getParameter("user_pw");
		Login login = new Login();
		login.setRkId(userId);
		login.setRkPw(userPw);
		
		int userCount = loginService.searchUser(login);
		
		if (userCount == 1) {
			return "main";
		} else {
			return "error";
		}
	}
	
	@RequestMapping("userReg")
	public String UserReg(HttpServletRequest request, Model model) {
		String uuid = UUID.randomUUID().toString();
		String userId = request.getParameter("user_id");
		String userPw = request.getParameter("user_pw");
		String userEmail = request.getParameter("user_email");
		String userTel = request.getParameter("user_tel");
		String roadAddrPart1 = request.getParameter("roadAddrPart1");
		String addrDetail = request.getParameter("addrDetail");
		String userChildAge = request.getParameter("user_child_age");
		String userChildName = request.getParameter("user_child_name");
		String userChildSex = request.getParameter("user_child_sex");
		
		Login RegInfo = new Login();
		RegInfo.setUuid(uuid);
		RegInfo.setRkId(userId);
		RegInfo.setRkPw(userPw);
		RegInfo.setRkEmail(userEmail);
		RegInfo.setRkTel(userTel);
		RegInfo.setRkAddress(roadAddrPart1 + " " + addrDetail);
		RegInfo.setRkChildAge(Integer.parseInt(userChildAge));
		RegInfo.setRkChildName(userChildName);
		RegInfo.setRkChildSex(userChildSex);
		RegInfo.setRkRegId("admin");
		RegInfo.setRkUpdId("admin");
		
		int insertResult = loginService.userReg(RegInfo);
		
		if (insertResult == 1) {
			return "home";	
		} else {
			return "error";
		}
	}
	
}
