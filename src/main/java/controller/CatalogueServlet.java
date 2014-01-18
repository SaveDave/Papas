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


public class CatalogueServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{    
		CatalogueManager cm= new CatalogueManager();
		ArrayList<Catalogue> list= new ArrayList<Catalogue>();
		list=cm.readCatalogue();
		req.setAttribute("cat", list);
		req.getRequestDispatcher("/WEB-INF/catalogue.jsp").forward(req,resp);
		
	}
	
}
