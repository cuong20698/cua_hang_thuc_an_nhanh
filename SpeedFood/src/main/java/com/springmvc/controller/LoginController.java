package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entity.TaiKhoan;
import com.springmvc.service.TaiKhoanService;

@Controller
public class LoginController {

	@Autowired
	private TaiKhoanService service;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String loginPage(ModelMap mm, HttpSession session) {
		if(session.getAttribute("username") != null) {
			return "admin/masterPageAdmin";
		}else {
			mm.put("tk", new TaiKhoan());
			return "admin/login";
		}
	}

	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPage(@ModelAttribute("tk") TaiKhoan tk ,ModelMap mm, HttpSession session) {
		TaiKhoan taikhoan = service.getTaiKhoan(tk.getUsername());
		if(taikhoan != null && taikhoan.getPassword().equals(tk.getPassword())) {
			session.setAttribute("username", tk.getUsername());
			return "redirect:/trangchu";
		}else {
			mm.put("thongbao", "Tên đăng nhập hay mật khẩu không chính xác!");
			return "admin/login";
		}
		
	}
	
	@RequestMapping(value = "/trangchu", method = RequestMethod.GET)
	public String homePage() {
		return "admin/masterPageAdmin";
	}
	
	@RequestMapping(value = "/dangky", method = RequestMethod.GET)
	public String registerPage(ModelMap mm) {
		mm.put("tk", new TaiKhoan());
		return "admin/dangky";
	}
	
	@RequestMapping(value = "/dangky", method = RequestMethod.POST)
	public String registerPage(@ModelAttribute("tk") TaiKhoan tk, ModelMap mm) {
		
		if(service.add(tk)) {
			mm.put("thongbao", "Đăng ký thành công!");
		}
		return "admin/dangky";
	}
	
	@RequestMapping(value = "/dangxuat", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest req) {
		req.getSession().invalidate();
		return "redirect:/home";
	}
	
}
