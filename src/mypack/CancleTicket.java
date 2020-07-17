package mypack;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CancleTicket extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
	
		int canclepnr=Integer.parseInt(req.getParameter("pnrcan"));
	       System.out.println(canclepnr);
	       
	       
	       
	       
			try {
				
				 Class.forName("com.mysql.jdbc.Driver");
			     System.out.println("Class Load");
			   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/RRS","root","");
			     System.out.println("Connect.....");
			     
			   
			     
			     
			     PreparedStatement pst=conn.prepareStatement("delete from booking where PNR=?");
			      pst.setInt(1,canclepnr);
			     pst.executeUpdate();	
			   out.println("Ticket Cancellation successfully....");
			     
			     
			     
			     System.out.println("Program is running");
				
				
			}catch(Exception e) {System.out.println(e);}
			
			
			
	       
	       
	       
	       
	       
	       

	}
}
