package com.mindtree.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mindtree.entity.Employee;
import com.mindtree.exceptions.ServiceException;
import com.mindtree.services.CafeFeedbackService;

/**
 * Servlet implementation class CafeController
 */
public class CafeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CafeFeedbackService service = null;

	/**
	 * Default constructor.
	 */
	public CafeController() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if (request.getRequestURI().endsWith("login.action")) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			HttpSession session = request.getSession();

			String empEmail = request.getParameter("empEmail");
			String password = request.getParameter("password");
			service = new CafeFeedbackService();
			try {
				String userType = service.getUserType(empEmail, password);
				if (userType.equalsIgnoreCase("admin")) {
					session.setAttribute("user", empEmail);
					RequestDispatcher rd = request.getRequestDispatcher("AddMenuPage.jsp");
					rd.forward(request, response);
				} else if (userType.equalsIgnoreCase("user")) {
					session.setAttribute("user", empEmail);
					RequestDispatcher rd = request.getRequestDispatcher("ViewMenuPage.jsp");
					rd.forward(request, response);
				} else {
				    out.print("Invalid UserName or Password");
					request.getRequestDispatcher("SignInPage.jsp").include(request, response);
				}
			} catch (ServiceException e) {
				out.print("Connection Error");
				request.getRequestDispatcher("SignInPage.jsp").include(request, response);
			}
		}
		if (request.getRequestURI().endsWith("signup.action")) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String empName = request.getParameter("empName");
			String empId = request.getParameter("empId");
			String empEmail = request.getParameter("empEmail");
			String empDesignation = request.getParameter("empDesignation");
			String password = request.getParameter("password");
			service = new CafeFeedbackService();
			System.out.println(empName);
			Employee employee = new Employee(empName, empId, empEmail, empDesignation, password);
			try {
				boolean saveDetails = service.saveEmployeeDetails(employee);
				if (saveDetails) {
					response.sendRedirect("SignInPage.jsp");
					out.print("You are succesfully registered please Log in");
				} else {
					out.print("Error in Saving Employee Data");
				}
			} catch (ServiceException e) {
				out.print("Service Exception Occurred");
				response.sendRedirect("Home.jsp");
			}
		}
	}
}
