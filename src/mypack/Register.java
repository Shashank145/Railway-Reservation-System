package mypack;

import java.io.*;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Register extends HttpServlet{
	
	 String gendr;
	 String secq;
	 String merst;
	 String occup;
	 String cntry;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String userId=req.getParameter("a1");
		String password=req.getParameter("a2");
		String sq[]=req.getParameterValues("s1");
		    for(int i=0;i<sq.length;i++)
		    	secq=sq[i];
		       System.out.println(secq);
		
		  String sa=req.getParameter("a4");   
		  System.out.println(sa); 
		  String firName=req.getParameter("a5");
		  String midName=req.getParameter("a6");
		  String lasName=req.getParameter("a7");
		  
		 
		  String gender[]=req.getParameterValues("same");
		  if(gender!=null)
		  {
		    for(int i=0;i<gender.length;i++)
		    	gendr=gender[i];
		      
		  }
		   
		  System.out.println(gendr); 
		  
		  String ms[]=req.getParameterValues("same1");
		  if(ms!=null)
		  {
		    for(int j=0;j<ms.length;j++)
		    	 merst=ms[j];
		       
		  }
		  System.out.println(merst);
		  
		  String dd=req.getParameter("sd");
		    
		       System.out.println(dd);
		
		       String dm=req.getParameter("sm");
			    
		       System.out.println(dm);
		       
		       String dy=req.getParameter("sy");
			    
		       System.out.println(dy);
		       
		       String dob=dd+"-"+dm+"-"+dy;
		       System.out.println(dob);
		
		       String occu[]=req.getParameterValues("ocp");
			    for(int o=0;o<occu.length;o++)
			    	occup=occu[o];
			       System.out.println(occup); 
		       
			    String aadhar=req.getParameter("a8");
				  String pan=req.getParameter("a9");
				  System.out.println(aadhar);
				  System.out.println(pan);
		       
				  String country[]=req.getParameterValues("country");
				    for(int x=0;x<country.length;x++)
				    	cntry=country[x];
				       System.out.println(cntry); 
			       
				    String email=req.getParameter("a10");
					  String mobile=req.getParameter("a11");
					  System.out.println(email);
					  System.out.println(mobile); 
					  
					  
					  String block=req.getParameter("a12");
					  System.out.println(block);
					  
					  
					  String street=req.getParameter("a13");
					  System.out.println(street);
					  
					  
					  String area=req.getParameter("a14");
					  System.out.println(area);
					  
					  
					  String pin=req.getParameter("a15");
					  System.out.println(pin);
					  
					  
					  String state=req.getParameter("a16");
					  System.out.println(state);
					  
					  
					  String city=req.getParameter("a17");
					  System.out.println(city);
					  
					  
					  String post=req.getParameter("a18");
					  System.out.println(post);
					  
					  
					  String phone=req.getParameter("a19");
					  System.out.println(phone);
					  
					  
		       
		       
		try {
			
			 Class.forName("com.mysql.jdbc.Driver");
		     System.out.println("Class Load");
		   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/RRS","root","");
		     System.out.println("Connect.....");
		     
		    //PreparedStatement pst1=conn.prepareStatement("create table signup(userid varchar(20),password varchar(20),sq varchar(80),sa varchar(80),firname varchar(20),midname varchar(20),lasname varchar(20),gender varchar(20),maritial_status varchar(20),dob varchar(20),occupation varchar(30),aadhar varchar(25),pan varchar(25),country varchar(20),email varchar(50),mobile varchar(20),blockno int,street varchar(30),area varchar(30),pin int,state varchar(20),city varchar(30),post varchar(30),phone varchar(20))");
		   // pst1.execute();			
		    // System.out.println("Table Created");
		     
		     
		     PreparedStatement pst=conn.prepareStatement("insert into signup values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		      pst.setString(1,userId);
		      pst.setString(2,password);
		      pst.setString(3,secq);
		      pst.setString(4,sa);
		      pst.setString(5,firName);
		      pst.setString(6,midName);
		      pst.setString(7,lasName);
		      pst.setString(8,gendr);
		     pst.setString(9,merst);
		      pst.setString(10,dob);
		   
		      pst.setString(11,occup);
		      pst.setString(12,aadhar);
		      pst.setString(13,pan);
		      pst.setString(14,cntry);
		     pst.setString(15,email);
		      pst.setString(16,mobile);
		      pst.setString(17,block);
		      pst.setString(18,street);
		      pst.setString(19,area);
		      pst.setString(20,pin);
		      pst.setString(21,state);
	      pst.setString(22,city);
		      pst.setString(23,post);
		     pst.setString(24,phone);
		     pst.executeUpdate();	
		    System.out.println("Record added successfully....");
		     
		     
		     
		     System.out.println("Program is running");
			
			
		}catch(Exception e) {System.out.println(e);}
		
		
		
		
		
		
		
	}
	
	
}