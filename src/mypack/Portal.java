package mypack;

import java.io.*;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Portal extends HttpServlet{
	
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String userId=req.getParameter("r1");
		String password=req.getParameter("r2");
		
		try {
			
			 Class.forName("com.mysql.jdbc.Driver");
		     System.out.println("Class Load");
		   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/RRS","root","");
		     System.out.println("Connect.....");
		     
		     
		     
		     
		     
		    PreparedStatement pst=conn.prepareStatement("select * from signup where userid=? and password=?");
		    pst.setString(1,userId);
		    pst.setString(2,password);
		     ResultSet rs=pst.executeQuery();		
			if(rs.next())
			{
				out.println("<html><body>");
				out.println("<table><tr>");
				out.println("<td><img src=Indian_Railway.png height=150px></td><td><img src=bannerirctc.jpg height=150px width=530></td><td><img src=icon.png height=150px></td>" + 
						"");
			    out.println("</tr></table>");
			    out.println("Welcome"+userId );
			   

			    out.println("<table>");
out.println("<tr bgcolor=white><td align=left><a href=searchtrain.html><button>Search Trains</button></a></td></tr>");
out.println("<tr bgcolor=white><td align=left><a href=pnrenquiry.html><button>PNR Enquiry</button></a></td></tr>");
out.println("<tr bgcolor=white><td align=left><a href=cancelticketa.html><button>Cancle Tickets</button></a></td></tr>");
out.println("<tr bgcolor=white><td align=left><a href=reservation1.html><button>Logout</button></a></td></tr>");



out.println("</table>"); 
			    
			    out.println("</body></html>");
				
				
				
			}
			
			else if(userId.equals("@admin") && password.equals("@admin"))
		     {
		    	 
		    	    out.println("<html><body>");
					out.println("<table><tr>");
					out.println("<td><img src=Indian_Railway.png height=150px></td><td><img src=bannerirctc.jpg height=150px width=530></td><td><img src=icon.png height=150px></td>" + 
							"");
				    out.println("</tr></table>");
				    out.println("Welcome"+userId );
				   

				    out.println("<table>");
				    out.println("<tr bgcolor=white><td align=left><a href=addtrain.html><button>Add Train</button></a></td></tr>");
				    out.println("<tr bgcolor=white><td align=left><a href=removetrain.html><button>Remove Train</button></a></td></tr>");
				    out.println("<tr bgcolor=white><td align=left><a href=passengerlist.html><button>Passenger List</button></a></td></tr>");
				    out.println("<tr bgcolor=white><td align=left><a href=cancelticketa.html><button>Cancel Ticket</button></a></td></tr>");
				    out.println("<tr bgcolor=white><td align=left><a href=reservation1.html><button>Logout</button></a></td></tr>");



				    out.println("</table>"); 
				    
				    out.println("</body></html>");	 
		    	 
		     }
			
		
			
			else
			out.println("Invalid user");
			
		}catch(Exception e) {System.out.println(e);}
		
		
		
		
}
	

}