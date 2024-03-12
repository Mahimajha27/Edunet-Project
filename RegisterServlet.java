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
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/htmldata","root","6884");
			PreparedStatement ps=con.prepareStatement("insert into intelligrowdata values(?,?,?,?)");
			Statement stmt1 = con.createStatement();
			Statement stmt2 = con.createStatement();
			String queryemail ="select * from intelligrowdata where EmailId = '" + email + "'";
			String queryuser ="select * from intelligrowdata where UserName = '" + username + "'";
			ResultSet rsemail = stmt1.executeQuery(queryemail);
			ResultSet rsuser = stmt2.executeQuery(queryuser);
			if(rsemail.next()) {
				out.print("<script type='text/javascript'>"+ "alert('Email Id Already Exists please use another EmailId');"+ "window.history.back();" + "</script>");
			}
			else if(rsuser.next()){
				out.print("<script type='text/javascript'>"+ "alert('Username already taken Please use another Username');"+ "window.history.back();" + "</script>");
			}
			else {
				ps.setString(1,name);
				ps.setString(2,email);
				ps.setString(3,username);
				ps.setString(4,password);
				ps.executeUpdate();
				response.sendRedirect("Login.html");
			}
			stmt1.close();
			stmt2.close();
			con.close();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			out.print("<h1>Registration failed Class not found</h1>");
			out.print(e);
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.print("<h1>Registration failed sql Eception</h1>");
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
