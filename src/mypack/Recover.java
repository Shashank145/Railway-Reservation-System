package mypack;

import java.io.*;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Recover extends HttpServlet{
	
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String newp=req.getParameter("np");
		String cnewp=req.getParameter("cnp");
		
		
     try {
		 Class.forName("com.mysql.jdbc.Driver");
	     System.out.println("Class Load");
	   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/RRS","root","");
	     System.out.println("Connect.....");
	     if(newp.equals(cnewp))
	     {
	    PreparedStatement pst=conn.prepareStatement("update signup set password=?");
	    pst.setString(1,newp);
	     int x=pst.executeUpdate();	
	      if(x>0)
	      {
	    	  out.println("<html><body>");
	    	  out.println("Password has been changed .Click here to <a href=reservation1.html>login</a>"); 
	          
	          
	          out.print("</body></html>");
	      }
	     }
	     else
	      out.println("enter the same password...");	 
     }catch(Exception e){System.out.println(e);}
	}
	
	
}