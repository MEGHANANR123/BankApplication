package com.dxc.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.Service.AdminserviceImpl;
import com.dxc.Service.IAdminservice;
import com.dxc.pojos.usersdetails;


@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
     IAdminservice adminservice=new AdminserviceImpl();
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String action="";
		String message="";
		String temp=request.getParameter("btn");
		
		if(temp!=null)
			action=request.getParameter("btn");
		HttpSession session=request.getSession();
		
	if(action.equals("login"))
		{
		String admin_id=request.getParameter("admin_id");
		String password=request.getParameter("password");
		boolean b= adminservice.authenticate(admin_id,password);
		if(b == true) {
			message ="admin login successfull";
			session.setAttribute("message", message);
			response.sendRedirect("adminoption.jsp");
		}
		else
		{
			message ="admin login failed";
			session.setAttribute("message", message);
			response.sendRedirect("view.jsp");
		}
		}
	else if(action.equals("addusers"))
	{
		int accno=Integer.parseInt(request.getParameter("accno"));
		String uname=request.getParameter("uname");
		double acbalance=Double.parseDouble(request.getParameter("acbalance"));
		int userid=Integer.parseInt(request.getParameter("userid"));
		String password=request.getParameter("password");
		usersdetails us=new usersdetails(accno,uname,acbalance,userid,password);
		adminservice.addusers(us);
		message = "user added successfully";
		session.setAttribute("message", message);
response.sendRedirect("view.jsp");		
	}
	else if(action.equals("findusers"))
	{
		int accno=Integer.parseInt(request.getParameter("accno"));
		session.setAttribute("accno", accno);
		usersdetails findStatus=adminservice.findusers(accno);
		session.setAttribute("findStatus", findStatus);
		response.sendRedirect("showusers.jsp");
		}

else if(action.equals("search"))
{
	int accno=Integer.parseInt(request.getParameter("accno"));
	session.setAttribute("accno", accno);
	boolean search=adminservice.searchUsers(accno);
	if(search==true)
	{
	response.sendRedirect("updateuser2.jsp");
	}
	else
	{
		message ="user not found";
		session.setAttribute("message", message);
		response.sendRedirect("view.jsp");
	}
	}
	else if(action.equals("updateusers"))
	{
		int accno=(int)session.getAttribute("accno");
		String uname=request.getParameter("uname");
		double acbalance=Double.parseDouble(request.getParameter("acbalance"));
		//int userid=(int)session.getAttribute("userid");
		int userid=Integer.parseInt(request.getParameter("userid"));
		String password=request.getParameter("password");
		usersdetails us=new usersdetails(accno,uname,acbalance,userid,password);
		adminservice.updateusers(us);
		message = "userdetails successfully updated";
		session.setAttribute("message", message);
        response.sendRedirect("view.jsp");
	}
	else if(action.equals("showbalance"))
	{
		int accno=Integer.parseInt(request.getParameter("accno"));
		double b=adminservice.getbalance(accno);
		try {
			PrintWriter pwt=response.getWriter();
			pwt.println("account balance is = " + b);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	else if(action.equals("delete"))
	{
		int accno=Integer.parseInt(request.getParameter("accno"));
		adminservice.removeuser(accno);message="useraccount removed successfully";
		session.setAttribute("message", message);
		response.sendRedirect("view.jsp");
		}
	else
	{
		List<usersdetails> list=adminservice.getAllUsers();
		session.setAttribute("list", list);
		response.sendRedirect("showaccount.jsp");
	}
}
}
	
  

	
