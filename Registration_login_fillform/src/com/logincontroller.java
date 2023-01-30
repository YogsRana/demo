package com;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.NewUser;

@Controller
public class logincontroller {
@Autowired
HttpServletRequest hrs;

@Autowired
NewUserDao nud;

public logincontroller() {

}
@RequestMapping("/")
public String showindex() {
	System.out.println("welcome to Index page");
	return "index";
	}
@RequestMapping("/infosys")
public String showinfosys() {
	System.out.println("welcome to infosys page");
	return "infosys";
	}
@RequestMapping("/login")
public String showlogin() {
	System.out.println("welcome to login page");
	return "login";
	}
@RequestMapping("/validation")
public String validation(@RequestParam("username")String data1,@RequestParam("password")String data2, Model m ) {
	System.out.println("in validate");
	NewUser nu=new NewUser();
	nu.setUsername(data1);
	nu.setPassword(data2);
	List<NewUser> li=nud.selectuser(nu);
	
	if(li.size()>0&&data1.equals(li.get(0).getUsername())&& (data2.equals(li.get(0).getPassword()))) {
		System.out.println("login successfully");
		m.addAttribute("message",data1);
		return "form";	
	}else {
		System.out.println("login not successfull");
		m.addAttribute("message","insert validit data");
	return "login";
	}
}	
@RequestMapping("/new")
public String shownewuser() {
	System.out.println("welcome to newuser page");
	return "newuser";	
	}
@RequestMapping("/form")
public String showform() {
	System.out.println("welcome to form page");
	return "form";	
	}
@RequestMapping("/e")
public String endback() {
	System.out.println(" end");
	return "index";
}
@RequestMapping("/forget")
 public String showForgetpassword() {
 System.out.println("forget password"); 
 return "Forgetpassword"; 
 }
 
 @RequestMapping("/validation3")
 public String validation1(@RequestParam("username")String data1,@RequestParam("password")String data2, Model m ) {
 	System.out.println("forget validate");
 	NewUser nu=new NewUser();
 	nu.setUsername(data1);
 	nu.setPassword(data2);
 	nud.updateuser(nu);
 	if(nu!=nu&&data1.equals(nu.getUsername())&& (data2.equals(nu.getPassword()))) {
 		System.out.println("password successfully changed");
 		m.addAttribute("message",data1);
 		return "login";	
 	}else {
 		System.out.println(" password not change pls try again");
 		m.addAttribute("message","not updated");
 	return "Forgetpassword";
 	}
}
}