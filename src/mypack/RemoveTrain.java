package mypack;

import java.io.*;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RemoveTrain extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
	
		String trn=req.getParameter("rmv");
	       System.out.println(trn);
	       
	       
	       
	       
			try {
				
				 Class.forName("com.mysql.jdbc.Driver");
			     System.out.println("Class Load");
			   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/RRS","root","");
			     System.out.println("Connect.....");
			     
			   
			     
			     
			     PreparedStatement pst=conn.prepareStatement("delete from train where TrainNO=?");
			      pst.setString(1,trn);
			     pst.executeUpdate();	
			    System.out.println("Train Removed successfully....");
			     
			     
			     
			     System.out.println("Program is running");
				
				
			}catch(Exception e) {System.out.println(e);}
			
			
			
	       
	       
	       
	       
	       
	       

	}
}
