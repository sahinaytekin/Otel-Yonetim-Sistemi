package model;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid=request.getParameter("uid");
		String pwd=request.getParameter("pwd");
		
		if(uid.equals("aytek") && pwd.equals("123")){
			//response.getWriter().print("Hello <FONT COLOR=GREEN> <B>"+uid+" </B> </FONT>");
			HttpSession session = request.getSession();
			session.setAttribute("userid", uid);
			response.sendRedirect("index.jsp");

		}
                else if(uid.equals("ayşe") && pwd.equals("123")){
			//response.getWriter().print("Hello <FONT COLOR=GREEN> <B>"+uid+" </B> </FONT>");
			HttpSession session = request.getSession();
			session.setAttribute("userid", uid);
			response.sendRedirect("index2.jsp");

		}
                else if(uid.equals("ali") && pwd.equals("123")){
			//response.getWriter().print("Hello <FONT COLOR=GREEN> <B>"+uid+" </B> </FONT>");
			HttpSession session = request.getSession();
			session.setAttribute("userid", uid);
			response.sendRedirect("index2.jsp");

		}
              
		else{
			response.sendRedirect("login.jsp");

		}
                
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
