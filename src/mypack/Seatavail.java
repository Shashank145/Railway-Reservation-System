package mypack;


import java.io.*;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.*;
import javax.servlet.http.*;
public class Seatavail extends HttpServlet {
	
	 String seatclass;
	 ResultSet rs1;
	 Connection conn;
	 int ac1;
	 int ac2;
	 int ac3;
	 int slp;
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		
		out.println("Welcome to seat availablity");
		
		String satno=req.getParameter("a92");
		out.println(satno); 
		
		
		 String saclass[]=req.getParameterValues("class92");
		    for(int o=0;o<saclass.length;o++)
		    	seatclass=saclass[o];
		       out.println(seatclass); 
		       
		       
		       
		      int dd92=Integer.parseInt(req.getParameter("sd92"));
			    
		       out.println(dd92);
		
		       int dm92=Integer.parseInt(req.getParameter("sm92"));
			    
		       out.println(dm92);
		       
		       int dy92=Integer.parseInt(req.getParameter("sy92"));
			    
		      out.println(dy92);
		       
		       String doj92=dd92+"-"+dm92+"-"+dy92;
		       out.println(doj92);   
		       
		       
		       Date date=(Date) (new GregorianCalendar(dy92,dm92-1,dd92)).getTime();
				SimpleDateFormat f=new SimpleDateFormat("EE");
				String day=f.format(date);
				out.println(day); 
		       
				 try {
						
					 Class.forName("com.mysql.jdbc.Driver");
				     System.out.println("Class Load");
				   conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/RRS","root","");
				     System.out.println("Connect.....");
				     
				    //PreparedStatement pst1=conn.prepareStatement("create table booking(PNR int,Journey_Date varchar(80),Booking_Date varchar(80),TrainNO int(11),IdNo int(30),Name varchar(40),Age int(11),Gender varchar(20),Address varchar(120),SeatNo varchar(40),Class varchar(30))");
				    //pst1.execute();			
				    //System.out.println("Table Created");
				     
				     
				     if(day.equals("Sun"))
					 {   
				     
				     PreparedStatement pst2=conn.prepareStatement("select * from train where TrainNO=? and Sun=1");
				     pst2.setString(1,satno);
				    
				   
				     rs1=pst2.executeQuery();
				    
					 }
				     
				     
				     if(day.equals("Mon"))
					 {   
				     
				     PreparedStatement pst2=conn.prepareStatement("select * from train where TrainNO=? and Mon=1");
				     pst2.setString(1,satno);
				   
				   
				     rs1=pst2.executeQuery();
				    
					 }
				     
				     
				     
				     
				     if(day.equals("Tue"))
					 {   
				     
				     PreparedStatement pst2=conn.prepareStatement("select * from train where TrainNO=? and Tue=1");
				     pst2.setString(1,satno);
				     
				   
				     rs1=pst2.executeQuery();
				    
					 }
				     
				     
				     if(day.equals("Wed"))
					 {   
				     
				     PreparedStatement pst2=conn.prepareStatement("select * from train where TrainNO=? and Wed=1");
				     pst2.setString(1,satno);
				     
				   
				     rs1=pst2.executeQuery();
				    
					 }
				     
				     
				     if(day.equals("Thu"))
					 {   
				     
				     PreparedStatement pst2=conn.prepareStatement("select * from train where TrainNO=? and Thu=1");
				     pst2.setString(1,satno);
				   
				   
				     rs1=pst2.executeQuery();
				    
					 }
				     
				     if(day.equals("Fri"))
					 {   
				     
				     PreparedStatement pst2=conn.prepareStatement("select * from train where TrainNO=? and Fri=1");
				     pst2.setString(1,satno);
				     
				   
				     rs1=pst2.executeQuery();
				    
					 }
				     
				     
				     
				     if(day.equals("Sat"))
					 {   
				     
				     PreparedStatement pst2=conn.prepareStatement("select * from train where TrainNO=? and Sat=1");
				     pst2.setString(1,satno);
				    
				   
				     rs1=pst2.executeQuery();
				    
					 }
				     
				     
				     
				     if(rs1.next())
				    {
				    	 
				    	 out.println("Train Found");
				    	                ac1=rs1.getInt(8);
				    	                out.println("No of seat in AC1 is "+ac1);
				    	                ac2=rs1.getInt(9);
				    	                out.println("No of seat in AC2 is "+ac2);
				    	                ac3=rs1.getInt(10);
				    	                out.println("No of seat in AC3 is "+ac3);
				    	                slp=rs1.getInt(11);
				    	                out.println("No of seat in Sleeper is "+slp);

					     PreparedStatement pst3=conn.prepareStatement("select * from booking where TrainNO=? and Class=? and Journey_Date=?");
					     pst3.setString(1,satno);
					     pst3.setString(2,seatclass);
					     pst3.setString(3,doj92);
					     ResultSet rs3=pst3.executeQuery();
				    	 	
					            if(rs3.next())
					            {
					            	 int i=1;
					            	while(rs3.next())
					            	   {
					            		i++;
					            	   }
					            	out.println("booking on this date has been :"+i);

					            	
					            	out.println("<br><br>");
					            	
					            	out.println("booking avail");
					            	
					            	out.println("<br><br>");
					            	
					            	if(seatclass.equals("ac1"))
					            	{
					            		out.println("<table border=1 bgcolor=#5B61D3 width=400px cellpadding=7px cellspacing=5px<tr>");
			            			out.println("<th>Available : "+(ac1-i)+"</th>");
			            			if((ac1-i)>0)
			            				{
			            				out.println("<th><a href=booking.html >Book Now</a></th>");
			            				}
			            			out.println("</tr></table>");
					            }
				            		if(seatclass.equals("ac2"))
				            		{
				            			out.println("<table border=1 bgcolor=#5B61D3 width=400px cellpadding=7px cellspacing=5px<tr>");
			            			out.println("<th>Available : "+(ac2-i)+"</th>");
			            			if((ac2-i)>0)
			            				{
			            				out.println("<th><a href=booking.html >Book Now</a></th>");
			            				}
			            			out.println("</tr></table>");
					            }
				            		if(seatclass.equals("ac3"))
				            		{
				            			out.println("<table border=1 bgcolor=#5B61D3 width=400px cellpadding=7px cellspacing=5px<tr>");
			            			out.println("<th>Available : "+(ac3-i)+"</th>");
			            			if((ac3-i)>0)
			            				{
			            				out.println("<th><a href=booking.html >Book Now</a></th>");
			            				}
			            			out.println("</tr></table>");
					            }
				            		if(seatclass.equals("slp"))
				            				{
				            		
				            			out.println("<table border=1 bgcolor=#5B61D3 width=400px cellpadding=7px cellspacing=5px<tr>");
				            			out.println("<th>Available : "+(slp-i)+"</th>");
				            			if((slp-i)>0)
				            				{
				            				out.println("<th><a href=booking.html >Book Now</a></th>");
				            				}
				            			out.println("</tr></table>");

				            				}
					            	
					            	
					            	
	 
					    	 
					            }
					            else
					            {
					            	
					            	out.println("<br><br>");

					            	out.println(" No booking on this date");
					            	
					            	out.println("<br><br>");
					            	
					            		if(seatclass.equals("ac1"))
					            		{
					            			out.println("<table border=1 bgcolor=#5B61D3 width=400px cellpadding=7px cellspacing=5px<tr>");
					            			out.println("<th>Available : "+ac1+"</th>");
					            			if(ac1>0)
					            				{
					            				out.println("<th><a href=booking.html >Book Now</a></th>");
					            				}
					            			out.println("</tr></table>");
					            			
					            		}
					            		if(seatclass.equals("ac2"))
					            		{
					            			out.println("<table border=1 bgcolor=#5B61D3 width=400px cellpadding=7px cellspacing=5px<tr>");
					            			out.println("<th>Available : "+ac2+"</th>");
					            			if(ac2>0)
					            				{
					            				out.println("<th><a href=booking.html >Book Now</a></th>");
					            				}
					            			out.println("</tr></table>");
					            			
					            		}
					            			if(seatclass.equals("ac3"))
					            			{
						            			out.println("<table border=1 bgcolor=#5B61D3 width=400px cellpadding=7px cellspacing=5px<tr>");
						            			out.println("<th>Available : "+ac3+"</th>");
						            			if(ac3>0)
						            				{
						            				out.println("<th><a href=booking.html >Book Now</a></th>");
						            				}
						            			out.println("</tr></table>");
						            			
						            		}	
					            			
					            		if(seatclass.equals("slp"))
					            		{
					            			out.println("<table border=1 bgcolor=#5B61D3 width=400px cellpadding=7px cellspacing=5px<tr>");
					            			out.println("<th>Available : "+slp+"</th>");
					            			if(slp>0)
					            				{
					            				out.println("<th><a href=booking.html >Book Now</a></th>");
					            				}
					            			out.println("</tr></table>");
					            			
					            		}


					            	
	
					            	
					            }
					     
				    	 
				    	 
				    	 
				    	 
				     }
				     else
				     {
				    	 
				    	 out.print("Train Not Found");	 
				     }
				    
				     
				     
				     
				 }catch(Exception e) {System.out.println(e);} 
		       
	
	}

}
