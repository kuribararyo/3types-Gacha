package sample_main;

import java.io.IOException;
import java.util.List;

import service.process;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repository.connect;

/**
 * Servlet implementation class sample
 */
@WebServlet("/sample")
public class sample extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public sample() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Hello World").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_sample.jsp");
		dispatcher.forward(request, response);
 	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		
		String num = request.getParameter("num");
		process gacha = new process();
		//gacha.syori(num);
		List<entity.Character> li = gacha.syori(num);
		request.setAttribute("gacha", li);
		
		RequestDispatcher dispatcher2 = request.getRequestDispatcher("/jsp_sample.jsp");
		dispatcher2.forward(request, response);
	}

}
