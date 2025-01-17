package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
import model.ClientDemo;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int sid = Integer.parseInt(request.getParameter("T1"));
		String sname = request.getParameter("T2");
		String sdept = request.getParameter("T3");
		
		Client S = new Client();
		S.setSid(sid);
		S.setSname(sname);
		S.setSdept(sdept);
		
		response.setContentType("text/html");
		String ack ="";
		try
		{
			ClientDemo SM = new ClientDemo();
			ack = SM.addStudent(S);
		}catch(Exception e) {
			ack = e.getMessage();
		}
		RequestDispatcher RD = request.getRequestDispatcher("index.html");
		PrintWriter PW = response.getWriter();	
		PW.println(ack);
		RD.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
