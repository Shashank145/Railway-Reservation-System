package mypack;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Passengerlist extends HttpServlet{
String Pasclass;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
	out.println("<h1>Passenger List</h1>");
	
	String psltrain=req.getParameter("psltno");
	 
	
	
	 String Pslclass[]=req.getParameterValues("pslclass");
	    for(int o=0;o<Pslclass.length;o++)
	    	Pasclass=Pslclass[o];
	       
	       
	       
	       
	      int ddpsl=Integer.parseInt(req.getParameter("dojpsl"));
		    
	       
	
	       int dmpsl=Integer.parseInt(req.getParameter("dompsl"));
		    
	       
	       
	       int dypsl=Integer.parseInt(req.getParameter("doypsl"));
		    
	     
	       
	       String dojpsl=ddpsl+"-"+dmpsl+"-"+dypsl;
	       
	       
	       
	       try {
	    	   
	    	   Class.forName("com.mysql.jdbc.Driver");
			     System.out.println("Class Load");
			   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/RRS","root","");
			     System.out.println("Connect.....");
	    	   
	    	 PreparedStatement pst=conn.prepareStatement("select * from booking where TrainNO=? and Class=? and Journey_Date=?");
			   
			      pst.setString(1,psltrain);
			      pst.setString(2,Pasclass);   
			      pst.setString(3,dojpsl);
			    ResultSet rs=pst.executeQuery();
			     
			     
			      String str="<center><table border=1><tr><th>PNR</th><th>Journey_Date</th><th>Booking_Date</th><th>TrainNO</th><th>IdNo</th><th>Name</th><th>Age</th><th>Gender</th><th>Address</th><th>SeatNo</th>"
			      		+ "<th>Class</th></tr>";			        
			    
			      while(rs.next())
			      {
			      
			    	  str += "<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"
			    			  +rs.getString(8)+"</td><td>"+rs.getString(9)+"</td><td>"+rs.getString(10)+"</td><td>"+rs.getString(11)+"</td></tr>" ;	
			    	 
			     
			      }
			     str +="</table></center>";
			     out.println(str);
	    	   
	    	   
	    	   
	    	   
	       }catch(Exception e) {System.out.println(e);}
	
	
	}

}
