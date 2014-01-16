package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Validations;
import model.CatalogueManager;
import model.Catalogue;
import model.Storage;
import model.Errors;
import model.Order;

public class MainServlet extends HttpServlet 
{	
	String addtop="None Specified"; 
	String remtop="None Specified";
	double mediumPrice, largePrice, xLargePrice, jumboPrice;
	String pizza;
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
		String id="1";
		String timestamp=" 12:00 GMT";
		String name = req.getParameter("name");
		String phone= req.getParameter("phone");
		String location = req.getParameter("location");
		String type = req.getParameter("type");
		String size = req.getParameter("size");
		String quantity = req.getParameter("quantity");
		String topping =  req.getParameter("toppings");
		double price=0.0;
		if (topping.equals("add")){
			addtop= req.getParameter("choosetoppings");


		}
		else if (topping.equals("remove")){
			remtop=req.getParameter("choosetoppings");
		}
		if (topping.equals("")){
			remtop="None Specified";
			addtop="None Specified";
		}
		
		String salespoint =  req.getParameter("salespoint");


		/* Lets do the Pricing*/
		CatalogueManager cm= new CatalogueManager();
		ArrayList<Catalogue> catList= cm.readCatalogue();
		int orderQty= Integer.parseInt(quantity);
		for(int i=0; i<catList.size();i++){
			mediumPrice=Double.parseDouble(catList.get(i).getMedium());
			largePrice=Double.parseDouble(catList.get(i).getLarge());
			xLargePrice=Double.parseDouble(catList.get(i).getXlarge());
			jumboPrice=Double.parseDouble(catList.get(i).getJumbo());
			pizza=catList.get(i).getPizza();


			if (type.equalsIgnoreCase(pizza)&& size.equals("Jumbo")){
				price+=(jumboPrice*orderQty);
			}
			else if(type.equalsIgnoreCase(pizza)&& size.equals("Extra Large")){
				price+=(xLargePrice*orderQty);
			}
			else if(type.equalsIgnoreCase(pizza)&& size.equals("Large")){
				price+=(largePrice*orderQty);
			}
			else if(type.equalsIgnoreCase(pizza)&& size.equals("Medium")){
				price+=(mediumPrice*orderQty);
			}
		}
		System.out.println("TOTAL COST IS: "+ price);

		Order newOrder= new Order(id,name,phone,location,type,quantity,size,addtop,remtop,salespoint,timestamp,price);
		System.out.println("Order List"+ newOrder);
		if (v.validate(name,phone,location))
		{
			req.setAttribute("order",newOrder);
			req.getRequestDispatcher("/WEB-INF/confirm.jsp").forward(req,resp);
		}
		else
		{
			Errors e = v.getErrors();
			req.setAttribute("e", e);
			req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);
			
		}

	}
}
