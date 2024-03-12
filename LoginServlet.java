package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/htmldata","root","6884");
			Statement stmt = con.createStatement();
			String query = "select * from intelligrowdata where username = '" + username+"' and password = '" +password+"'";
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
			    response.setContentType("text/html");
			    request.setAttribute("todo", username);
			    request.getRequestDispatcher("Intelligrowmainn.jsp").forward(request, response);
			}else {
				out.print("<script type='text/javascript'>"+ "alert('Please Enter Correct Username and Password');"+ "window.history.back();" + "</script>");
			}
			rs.close();
			stmt.close();
			con.close();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			out.print("<h1>Login failed Class not found</h1>");
			out.print(e);
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.print("<h1>Login failed</h1>");
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
