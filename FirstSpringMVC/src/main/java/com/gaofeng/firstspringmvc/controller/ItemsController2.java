package com.gaofeng.firstspringmvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//实现controller接口的处理器
public class ItemsController2 implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//调用service查找数据库，这里使用静态数据模拟
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);

		//设置模型数据
		request.setAttribute("list", list);
		//设置转发的视图
		request.getRequestDispatcher("/WEB-INF/jsp/authLogin.jsp").forward(request, response);
		
		//通过此方法，可以通过修改response，设置响应的数据格式，比如响应json数据
		/*response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write("json串");*/
	}

}
