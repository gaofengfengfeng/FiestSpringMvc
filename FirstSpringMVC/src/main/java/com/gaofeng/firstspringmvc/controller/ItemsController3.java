package com.gaofeng.firstspringmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

//实现注解的Handler
@Controller
public class ItemsController3{

	//一般建议将url和方法写成一样，两者之间没有关系
	@RequestMapping("/query4")
	public ModelAndView  query(){
		//调用service查找数据库，这里使用静态数据模拟
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		ModelAndView modelAndView = new ModelAndView();

		//相当于request的setAttribute,在jsp页面中即可以通过list来取数据
		modelAndView.addObject("list", list);

		//指定视图
		modelAndView.setViewName("/WEB-INF/jsp/authLogin.jsp"); 
		
		return modelAndView;

	}
	
	//在该类中可以定义其他方法

	/*public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		//调用service查找数据库，这里使用静态数据模拟
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		ModelAndView modelAndView = new ModelAndView();

		//相当于request的setAttribute,在jsp页面中即可以通过list来取数据
		modelAndView.addObject("list", list);

		//指定视图
		modelAndView.setViewName("/WEB-INF/jsp/authLogin.jsp");

		return modelAndView;
	}*/

}
