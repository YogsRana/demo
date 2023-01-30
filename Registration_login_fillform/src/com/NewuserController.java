package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Form;
import com.bean.NewUser;

@Controller
public class NewuserController {
@Autowired
NewUserDao nud;
public NewuserController() {
	
}
@RequestMapping(value = "validation", method = RequestMethod.POST)
public ModelAndView newvalidation(@ModelAttribute NewUser nu) {
	int i=nud.addNewUserDao(nu);
	System.out.println(1+" row inserted");
	if(i==1) {
		System.out.println(nu);
	ModelAndView mv=new ModelAndView("form");
	mv.addObject("message", "registration successfully");
	return mv;
	}else {
	ModelAndView mv=new ModelAndView("newuser");
	mv.addObject("message", "please provide correct data");
	return mv;
		}
	}
@RequestMapping(value = "validation1", method = RequestMethod.POST)
public ModelAndView newformvalidation(@ModelAttribute Form f) {
	int i=nud.addform(f);
	System.out.println(1+" row inserted");
	if(i==1) {
		System.out.println(f);
	ModelAndView mv=new ModelAndView("end");
	mv.addObject("message", "registration successfully");
	return mv;
	}else {
	ModelAndView mv=new ModelAndView("form");
	mv.addObject("message", "please provide correct data");
	return mv;
		}
	}
}