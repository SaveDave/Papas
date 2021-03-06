package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Validations;
import model.OrderManager;
import model.User;
import model.Errors;
import model.Storage;
import controller.SMSHandler;
import java.net.*;

public class ConfirmOrder extends HttpServlet 
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{
		req.getRequestDispatcher("WEB-INF/index.jsp").forward(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{
		
		Validations v = new Validations();
		
		String name = req.getParameter("name");
		String phone= req.getParameter("phone");
		String location = req.getParameter("location");
		String type = req.getParameter("type");
		String size = req.getParameter("size");
		String quantity = req.getParameter("quantity");
		String addtop =  req.getParameter("addtop");
		String remtop =  req.getParameter("remtop");
		String salespoint =  req.getParameter("salespoint");
		double price = Double.parseDouble( req.getParameter("price"));
		String txtMsg=URLEncoder.encode("An Order has just been placed by "+name+" Details are "+quantity+" "+size+" "+type+" Please check database for order details");
		String numbers="";
		if (salespoint.equals("East Legon")){
			numbers=URLEncoder.encode("+233249176736");
		}
		else if (salespoint.equals("Spintex")){
			numbers=URLEncoder.encode("+233208713816");
		}
		else if (salespoint.equals("Osu")){
			numbers=URLEncoder.encode("+233208713816");
		}

		if (v.validate(name,phone,location))
		{
			User u = new User( name, phone, location,type,size,quantity, addtop,remtop, salespoint);
			Storage s = new Storage();
			s.storeUserInfo(u);
			SMSHandler sms= new SMSHandler();
			sms.sendSMS(txtMsg,numbers);
			resp.sendRedirect("/");
			//req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);
		}
			
		else
		{
			Errors e = v.getErrors();
			req.setAttribute("e", e);
			req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);
			
		}

	}
	

}