package com.tap.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EmployeeDAO.EmployeeImpl;
import employeeDTO.Employee;
public class EmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String Address=req.getParameter("address");
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(Address);
		int id1=Integer.parseInt(id);
		Employee emp= new Employee(id1,name,email,Address);	
		EmployeeImpl impl=new EmployeeImpl();
		int res=impl.addEmployee(emp);
		if(res==1) {
			pw.println("<h1>Register complete</h1>");
		}
		else {
			pw.println("<h1>Something wrong</h1>");
		}
		
	}
}
