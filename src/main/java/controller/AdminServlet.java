package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Validations;
import model.User;
import model.Storage;
import model.Errors;

public class AdminServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{
		req.getRequestDispatcher("/WEB-INF/admin.jsp").forward(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{
		String idnumber = req.getParameter("idnumber");
		String password = req.getParameter("password");
		Validations v = new Validations();

		if (v.checkLogin(idnumber, password))
		{
			resp.sendRedirect("/dashBoard");
		}

	}
}
