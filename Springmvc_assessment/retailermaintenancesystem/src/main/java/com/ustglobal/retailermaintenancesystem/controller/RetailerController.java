package com.ustglobal.retailermaintenancesystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.retailermaintenancesystem.dto.RetailerBean;
import com.ustglobal.retailermaintenancesystem.service.RetailerService;

@Controller
public class RetailerController {
	@Autowired
	private RetailerService service;
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@PostMapping
	public String login(int rId,String password,HttpServletRequest request) {
		RetailerBean bean=service.login(rId, password);
		if(bean==null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
		
		
	}// end of login
	

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}// end of register page
	
	@PostMapping("/register")
	public String register(RetailerBean bean,ModelMap map) {
		int check=service.createProfile(bean);
		if(check>0) {
			map.addAttribute("msg","You are registered and ID is "+check);
			
		}else {
			map.addAttribute("msg","Email is repeated");
		}
		
		return "login";
		
		
	}// end of register()
	
	@GetMapping("/home")
	public String home(ModelMap map,@SessionAttribute(name="bean",required=false) RetailerBean bean) {
		if(bean==null) {
			map.addAttribute("msg","Login First !!!");
			return "login";
		}else {
			return "home";
		}
		
	}// end ofhome()
	@PostMapping("/home")
	public String home() {
		return "home";
	}// end of home
	
	
	@GetMapping("/search")
	public String search(@RequestParam("id")int rId,ModelMap map) {
		RetailerBean bean =service.search(rId);
		if(bean==null) {
			map.addAttribute("msg","Data Not Found");
		}else {
			map.addAttribute("bean",bean);
		}
		return "home";
	}// end of search()
	

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}// end of logout
	
	
	@PostMapping("/changepassword")
	public String changepassword(String password,
			String confirmpassword,
			@SessionAttribute(name="bean")RetailerBean bean,ModelMap map) {
	if(password.equals(confirmpassword)) {
		service.changePassword(bean.getrId(), password);
		map.addAttribute("msg","Password changed");
		
	}else {
		map.addAttribute("msg","Password not matching");
		
	}
	return "home";
	}// end of changepassword()

}
