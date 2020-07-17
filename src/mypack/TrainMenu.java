package mypack;


import java.io.*;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TrainMenu extends HttpServlet{
	
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		 
		  out.println("<center>\r\n" + 
		  		"\r\n" + 
		  		"\r\n" + 
		  		"<form name=\"f2\" onsubmit=\" \" method=\"post\" action=\"seatavail\">\r\n" + 
		  		"\r\n" + 
		  		"<br>\r\n" + 
		  		"<hr>\r\n" + 
		  		"<br>\r\n" + 
		  		"<h3>Seat Availability</h3>\r\n" + 
		  		"<table border=\"2\"  bgcolor=\"#5B61D3\"  width=\"400px\" cellpadding=\"7px\" cellspacing=\"5px\">");
		
	       out.println("<tr><td>Train No:</td><td align=\"center\"><input type=\"text\" font-size=\"30px\" name=\"a92\"></td></tr>");		
	       out.println("<tr>\r\n" + 
	       		"<td>Class</td>\r\n" + 
	       		"<td align=\"center\"><select name=\"class92\">\r\n" + 
	       		"<option>slp</option>\r\n" + 
	       		"<option>ac1</option>\r\n" + 
	       		"<option>ac2</option>\r\n" + 	  
	       		"<option>ac3</option>  </select></td>\r\n" + 
	       		"</tr>");	
	       
	       out.println("\r\n" + 
	       		"<tr>\r\n" + 
	       		"\r\n" + 
	       		"<td>Date of Journey</td>\r\n" + 
	       		"<td align=\"center\">\r\n" + 
	       		"<select name=\"sd92\">\r\n" + 
	       		"<option>1</option>\r\n" + 
	       		"<option>2</option>\r\n" + 
	       		"<option>3</option>\r\n" + 
	       		"<option>4</option>\r\n" + 
	       		"<option>5</option>\r\n" + 
	       		"<option>6</option>\r\n" + 
	       		"<option>7</option>  \r\n" + 
	       		"<option>8</option>\r\n" + 
	       		"<option>9</option>\r\n" + 
	       		"<option>10</option>\r\n" + 
	       		"<option>11</option>\r\n" + 
	       		"<option>12</option>\r\n" + 
	       		"<option>13</option>\r\n" + 
	       		"<option>14</option>\r\n" + 
	       		"<option>15</option>\r\n" + 
	       		"<option>16</option>\r\n" + 
	       		"<option>17</option>\r\n" + 
	       		"<option>18</option>\r\n" + 
	       		"<option>19</option>\r\n" + 
	       		"<option>20</option>\r\n" + 
	       		"<option>21</option>\r\n" + 
	       		"<option>22</option>\r\n" + 
	       		"<option>23</option>\r\n" + 
	       		"<option>24</option>\r\n" + 
	       		"<option>25</option>\r\n" + 
	       		"<option>26</option>\r\n" + 
	       		"<option>27</option>\r\n" + 
	       		"<option>28</option>\r\n" + 
	       		"<option>29</option>\r\n" + 
	       		"<option>30</option>\r\n" + 
	       		"<option>31</option>\r\n" + 
	       		"</select>\r\n" + 
	       		"\r\n" + 
	       		"<select name=\"sm92\">\r\n" + 
	       		"<option>1</option>\r\n" + 
	       		"<option>2</option>\r\n" + 
	       		"<option>3</option>\r\n" + 
	       		"<option>4</option>\r\n" + 
	       		"<option>5</option>\r\n" + 
	       		"<option>6</option>\r\n" + 
	       		"<option>7</option>  \r\n" + 
	       		"<option>8</option>\r\n" + 
	       		"<option>9</option>\r\n" + 
	       		"<option>10</option>\r\n" + 
	       		"<option>11</option>\r\n" + 
	       		"<option>12</option>\r\n" + 
	       		"</select>\r\n" + 
	       		"\r\n" + 
	       		"<select name=\"sy92\">\r\n" + 
	       		"<option>2018</option>\r\n" + 
	       		"<option>2019</option>\r\n" + 
	       		"<option>2020</option>\r\n" + 
	       		"<option>2021</option>\r\n" + 
	       		"<option>2022</option>\r\n" + 
	       		"<option>2023</option>\r\n" + 
	       		"<option>2024</option>\r\n" + 
	       		"<option>2025</option>\r\n" + 
	       		"<option>2026</option>\r\n" + 
	       		"<option>2027</option>\r\n" + 
	       		"<option>2028</option>\r\n" + 
	       		"<option>2029</option>\r\n" + 
	       		"<option>2030</option>\r\n" + 
	       		"</select>\r\n" + 
	       		"\r\n" + 
	       		"</td>\r\n" + 
	       		"</tr>");	
	       out.println("</table>");
	       
	       out.println("<br>\r\n" + 
	       		"<input type=\"submit\" value=\" See Availablity\">\r\n" + 
	       		"\r\n" + 
	       		"<br>\r\n" + 
	       		"<br>\r\n" + 
	       		"<br>\r\n" + 
	       		"\r\n" + 
	       		"<br>\r\n" + 
	       		"\r\n" + 
	       		"</form>\r\n" + 
	       		"</center>");

	}		
	
	
	

}
