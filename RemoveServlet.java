package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class RemoveServlet
 */
public class RemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String user=request.getParameter("username");
		int id=Integer.parseInt(request.getParameter("plantId"));
//		out.print("<script type='text/javascript'>"+ "alert('Are you sure you want to remove this plant');"+ "window.history.back();" + "</script>");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/htmldata","root","6884");
			Statement stmt = con.createStatement();
			String query="delete from intelligrowmain where plantId='"+ id +"'";
			int rs=stmt.executeUpdate(query);
			if(rs>0) {
				response.setContentType("text/html");
			    request.setAttribute("todo", user);
			    request.getRequestDispatcher("result1").forward(request, response);
			}
			else {
				out.print("<script type='text/javascript'>"+ "alert('Plant id not exist');"+ "window.history.back();" + "</script>");
			}
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			out.print("<h1>Class not found</h1>");
			out.print(e);
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.print("<h1>sql Eception</h1>");
			out.print(e);
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
