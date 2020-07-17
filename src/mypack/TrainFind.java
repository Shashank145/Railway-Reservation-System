package mypack;
import java.io.*;
import java.util.*;
import java.util.Calendar;
import java.util.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;
public class TrainFind extends HttpServlet{
	ResultSet rs;
	PreparedStatement pst;
	
  
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
	
		String ffrom=req.getParameter("from");
	       System.out.println(ffrom);
	
	       String fto=req.getParameter("to");
	       System.out.println(fto);
	       
	      int fd=Integer.parseInt(req.getParameter("doj"));
		    
	       System.out.println(fd);
	
	       int fm=Integer.parseInt(req.getParameter("moj"));
		    
	       System.out.println(fm);
	       
	       int fy=Integer.parseInt(req.getParameter("yoj"));
		    
	       System.out.println(fy);
	       
			
			Date date=(Date) (new GregorianCalendar(fy,fm-1,fd)).getTime();
			SimpleDateFormat f=new SimpleDateFormat("EE");
			String day=f.format(date);
			System.out.println(day); 
	       
			
			
			
			 try {
					
				 Class.forName("com.mysql.jdbc.Driver");
			     System.out.println("Class Load");
			   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/RRS","root","");
			     System.out.println("Connect.....");
			  
			     
			     if(day.equals("Sun"))
				 { 
					      pst=conn.prepareStatement("select TrainNO,TName,departure,arrival from train where source=? and destination=? and Sun=1");
					    //  pst.setString(3,day);
					      pst.setString(1,ffrom);
					      pst.setString(2,fto);      
					     rs=pst.executeQuery();
					     
					     
					      String str="<center><table border=1><tr><th>TrainNO</th><th>TName</th><th>departure</th><th>arrival</th></tr>";			        
					    
					      while(rs.next())
					      {
					      
					    	
					    	 str += "<tr><td><a href=trmnu>"+rs.getInt(1)+"</a></td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>" ;
					    	 
					     
					      }
					     str +="</table></center>";
					     out.println(str);
					     
				 }     
			     
			     
			     
			     else if(day.equals("Mon"))
		 { 
			      pst=conn.prepareStatement("select TrainNO,TName,departure,arrival from train where source=? and destination=? and Mon=1");
			    //  pst.setString(3,day);
			      pst.setString(1,ffrom);
			      pst.setString(2,fto);      
			       rs=pst.executeQuery();
			      String str="<center><table border=1><tr><th>TrainNO</th><th>TName</th><th>departure</th><th>arrival</th></tr>";			        
				     while(rs.next())
				      {
				      
				    	str += "<tr><td><a href=trmnu>"+rs.getInt(1)+"</a></td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>" ;
				   	 
					    
				    	
				      
				      }
				     str +="</table></center>";
				     out.println(str);
		 }     
			     
      
      else if(day.equals("Tue"))
		 { 
			       pst=conn.prepareStatement("select TrainNO,TName,departure,arrival from train where source=? and destination=? and Tue=1");
			    //  pst.setString(3,day);
			      pst.setString(1,ffrom);
			      pst.setString(2,fto);      
			       rs=pst.executeQuery();
			      
			      String str="<center><table border=1><tr><th>TrainNO</th><th>TName</th><th>departure</th><th>arrival</th></tr>";			        
				     while(rs.next())
				      {
				      
				    	str += "<tr><td><a href=trmnu>"+rs.getInt(1)+"</a></td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>" ;
				   	 
					    
				      
				      }
				     str +="</table></center>";
				     out.println(str);
		 }     
      
      else if(day.equals("Wed"))
		 { 
			      pst=conn.prepareStatement("select TrainNO,TName,departure,arrival from train where source=? and destination=? and Wed=1");
			    //  pst.setString(3,day);
			      pst.setString(1,ffrom);
			      pst.setString(2,fto);      
			       rs=pst.executeQuery();
			      String str="<center><table border=1><tr><th>TrainNO</th><th>TName</th><th>departure</th><th>arrival</th></tr>";			        
				     while(rs.next())
				      {
				      
				    	str += "<tr><td><a href=trmnu>"+rs.getInt(1)+"</a></td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>" ;
				   	 
					     
				      
				      }
				     str +="</table></center>";
				     out.println(str);
		 }     
      
      else if(day.equals("Thu"))
		 { 
			       pst=conn.prepareStatement("select TrainNO,TName,departure,arrival from train where source=? and destination=? and Thu=1");
			    //  pst.setString(3,day);
			      pst.setString(1,ffrom);
			      pst.setString(2,fto);      
			      rs=pst.executeQuery();
			      String str="<center><table border=1><tr><th>TrainNO</th><th>TName</th><th>departure</th><th>arrival</th></tr>";			        
				     while(rs.next())
				      {
				      
				    	str += "<tr><td><a href=trmnu>"+rs.getInt(1)+"</a></td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>" ;
				     
				   	 
					    
				      }
				     str +="</table></center>";
				     out.println(str);
		 }     
      
			
      else if(day.equals("Fri"))
		 { 
			      pst=conn.prepareStatement("select TrainNO,TName,departure,arrival from train where source=? and destination=? and Fri=1");
			    //  pst.setString(3,day);
			      pst.setString(1,ffrom);
			      pst.setString(2,fto);      
			      rs=pst.executeQuery();
			      String str="<center><table border=1><tr><th>TrainNO</th><th>TName</th><th>departure</th><th>arrival</th></tr>";			        
				     while(rs.next())
				      {
				      
				    	str += "<tr><td><a href=trmnu>"+rs.getInt(1)+"</a></td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>" ;
				   	 
					    
				      
				      }
				     str +="</table></center>";
				     out.println(str);
		 }     
      
      
      else if(day.equals("Sat"))
		 { 
			      pst=conn.prepareStatement("select TrainNO,TName,departure,arrival from train where source=? and destination=? and Sat=1");
			    //  pst.setString(3,day);
			      pst.setString(1,ffrom);
			      pst.setString(2,fto);      
			       rs=pst.executeQuery();
			      String str="<center><table border=1><tr><th>TrainNO</th><th>TName</th><th>departure</th><th>arrival</th></tr>";			        
				     while(rs.next())
				      {
				      
				    	str += "<tr><td><a href=trmnu>"+rs.getInt(1)+"</a></td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>" ;
				      
				   	 
					    
				      }
				     str +="</table></center>";
				     out.println(str);
		 }     
      
      else
      {   
    	  
    	 out.println("No Train available");  
      }
      
      
      
			}catch(Exception e) {System.out.println(e);}
			
		  
			
			
			
			
			
			
			
			
			
			
			
			
			
	       
	
	}
}
