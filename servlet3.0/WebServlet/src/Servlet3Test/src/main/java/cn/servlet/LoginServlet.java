package cn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String name = request.getParameter("UserName");
		String psd = request.getParameter("UserPsd");
		System.out.println("name:" + name + " psd:" + psd);
		if("admin".equals(name) && "123".equals(psd)){
			request.setAttribute("user",name);
			request.getRequestDispatcher("/index.jsp").forward(request,response);
		}
		else{
			request.getRequestDispatcher("/fail.jsp").forward(request,response);
		}
	}

}
