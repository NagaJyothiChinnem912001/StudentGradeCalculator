package com.techpalle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GradeCalculator
 */
@WebServlet("/GradeCalculator")
public class GradeCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GradeCalculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eng=Integer.parseInt(request.getParameter("english"));
		int maths=Integer.parseInt(request.getParameter("maths"));
		int phy=Integer.parseInt(request.getParameter("phy"));
		int chem=Integer.parseInt(request.getParameter("chem"));
		int sans=Integer.parseInt(request.getParameter("sans"));
		int sum=(eng+maths+phy+chem+sans)/5;
		int x=sum/10;
		switch(x) {
		case 10:
		case 9:
			request.setAttribute("result", "A+");
			break;
		case 8:
			request.setAttribute("result", "A");
			break;
		case 7:
			request.setAttribute("result", "B+");
			break;
		case 6:
			request.setAttribute("result", "B");
			break;
		case 5:
			request.setAttribute("result", "C");
			break;
		case 4:
			request.setAttribute("result", "D");
			break;
		case 3:
		case 2:
		case 1:
			request.setAttribute("result", "F");
			break;
			
		}
		RequestDispatcher r=request.getRequestDispatcher("display.jsp");
		r.forward(request, response);
	}

}
