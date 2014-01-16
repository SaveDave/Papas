package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Validations;
import model.OrderManager;
import model.Order;
import model.Errors;

public class DashBoardServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{    
		OrderManager om= new OrderManager();
		ArrayList<Order> list= new ArrayList<Order>();
		list=om.readOrders();
		req.setAttribute("orders", list);
		req.getRequestDispatcher("/WEB-INF/dashboard.jsp").forward(req,resp);
	}
	
}
