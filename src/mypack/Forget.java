package mypack;

import java.io.*;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Forget extends HttpServlet{
	
	String secq1;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String userId1=req.getParameter("f1");
		 System.out.println(userId1);
		String sq2[]=req.getParameterValues("f2");
	    for(int i=0;i<sq2.length;i++)
	    	secq1=sq2[i];
	       System.out.println(secq1);
	
	  String sa3=req.getParameter("f3");   
	  System.out.println(sa3); 
		
		
	  try {
			
			 Class.forName("com.mysql.jdbc.Driver");
		     System.out.println("Class Load");
		   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/RRS","root","");
		     System.out.println("Connect.....");
		    PreparedStatement pst=conn.prepareStatement("select sq,sa from signup where userid=?");
		    pst.setString(1,userId1);
		    
		     ResultSet rs=pst.executeQuery();		
			if(rs.next())
			{
				 System.out.println(rs.getString(1));
				 System.out.println(rs.getString(2));
			   if(secq1.equals(rs.getString(1)) && sa3.equals(rs.getString(2)))
			   {  out.println("Welcome"+userId1);
			      out.println("<html><body><br><br>");
			      out.print("<form method=post  action=recover>");
			      out.println("<table border=2  bgcolor=#5B61D3  width=400px height=200px cellpadding=10px cellspacing=5px>");
			      out.println("<tr><td align=center>New Password</td>");
			      out.println("<td align=center><input type=text name=np  height: 25px; font-size=30px></td></tr>");
			      out.println("<tr><td align=center>confirm new password</td>");
			      out.println("<td align=center><input type=text name=cnp height: 25px; font-size=30px></td></tr>");
			      
			      out.println("<tr bgcolor=white><td align=center colspan=2><input type=submit value=Submit></td></tr>");
			      out.print("</table></form>");
			      out.println("</body></html>"); 
			      
			   }  
			   else
				   out.println("record not matched");
			}
			else
			out.println("Invalid user");
			
		}catch(Exception e) {System.out.println(e);}
		
		
		
		
	}
	
	
}