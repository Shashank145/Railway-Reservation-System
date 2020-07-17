package mypack;

import java.io.*;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TrainAdd extends HttpServlet{
	String Sunday="0",Monday="0",Tuesday="0",Wednesday="0",Thursday="0",Friday="0",Saturday="0";
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		int TrainNO=Integer.parseInt(req.getParameter("tno"));
		System.out.println(TrainNO); 
		String TName=req.getParameter("tname");
		System.out.println(TName); 
		String source=req.getParameter("tsrc");
		System.out.println(source); 
		String destination=req.getParameter("tdstn");
		System.out.println(destination); 
		String distance=req.getParameter("tdc");
		System.out.println(distance); 
		String departure=req.getParameter("tdt");
		System.out.println(departure); 
		String arrival=req.getParameter("tat");
		System.out.println(arrival); 
		int ac1=Integer.parseInt(req.getParameter("tac1"));
		System.out.println(ac1); 
		int ac2=Integer.parseInt(req.getParameter("tac2"));
		System.out.println(ac2); 
		int ac3=Integer.parseInt(req.getParameter("tac3"));
		System.out.println(ac3); 
		int slp=Integer.parseInt(req.getParameter("tslp"));
		System.out.println(slp); 

		  String day[]=req.getParameterValues("chk");
		  if(day!=null)
		  {
		    for(int i=0;i<day.length;i++)
		    {	
		    	
		    if(day[i].equals("1")) {	
		    	Sunday="1";
		   
		             }
		    
		    else if(day[i].equals("2")) {	
		    	Monday="1";
		             }
		    
		    else if(day[i].equals("3")) {	
		    	Tuesday="1";
		             }
		    
		    else if(day[i].equals("4")) {	
		    	Wednesday="1";
		             }
		    
		    else if(day[i].equals("5")) {	
		    	Thursday="1";
		             }
		    
		    else if(day[i].equals("6")) {	
		    	Friday="1";
		             }
		    
		    else if(day[i].equals("7")) {	
		    	Saturday="1";
		             }
		    
		    
		    
		    }
		    
		      
		  }
		  System.out.println(Sunday); 
		  System.out.println(Monday); 
		  System.out.println(Tuesday); 
		  System.out.println(Wednesday); 
		  System.out.println(Thursday); 
		  System.out.println(Friday); 
		  System.out.println(Saturday); 


		    
		  
		  try {
				
				 Class.forName("com.mysql.jdbc.Driver");
			     System.out.println("Class Load");
			   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/RRS","root","");
			     System.out.println("Connect.....");
			     
			//    PreparedStatement pst1=conn.prepareStatement("create table train(TrainNO int,TName varchar(20),source varchar(80),destination varchar(80),distance varchar(20),departure Time,arrival Time,ac1 int,ac2 int,ac3 int,slp int,Sun varchar(25),Mon varchar(25),Tue varchar(20),Wed varchar(50),Thu varchar(20),Fri varchar(30),Sat varchar(30))");
			//    pst1.execute();			
			//    System.out.println("Table Created");
			     
			     
			      PreparedStatement pst=conn.prepareStatement("insert into train values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			      pst.setInt(1,TrainNO);
			      pst.setString(2,TName);
			      pst.setString(3,source);
			      pst.setString(4,destination);
			      pst.setString(5,distance);
			      pst.setString(6,departure);
			      pst.setString(7,arrival);
			      pst.setInt(8,ac1);
			      pst.setInt(9,ac2);
			      pst.setInt(10,ac3);
			   
			      pst.setInt(11,slp);
			      pst.setString(12,Sunday);
			      pst.setString(13,Monday);
			      pst.setString(14,Tuesday);
			      pst.setString(15,Wednesday);
			      pst.setString(16,Thursday);
			      pst.setString(17,Friday);
			      pst.setString(18,Saturday);
			      pst.executeUpdate();	
			      System.out.println("Record added successfully....");
			    
			     
			     
			     System.out.println("Program is running");
				
				
			}catch(Exception e) {System.out.println(e);}
			
		  
		  
		  
		   
		
	}
	
	

}
