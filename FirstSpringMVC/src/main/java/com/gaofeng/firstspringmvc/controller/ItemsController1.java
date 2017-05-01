package com.gaofeng.firstspringmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//实现controller接口的处理器
public class ItemsController1 implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

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

}
