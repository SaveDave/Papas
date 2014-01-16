package controller;
import java.io.IOException;
import java.util.Date;
import javax.servlet.http.HttpServlet;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FilterURL extends HttpServlet implements Filter 
{
  @Override
  public void init(FilterConfig config) throws ServletException 
  {
    //
  }

  @Override
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
  throws IOException, ServletException
  {
    HttpServletResponse hsr = (HttpServletResponse) res;
      hsr.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
      hsr.setHeader("Pragma", "no-cache"); // HTTP 1.0.
      hsr.setDateHeader("Expires", 0); // Proxies.
      chain.doFilter(req, res);
    }

    @Override
    public void destroy() 
    {
    //
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
    //
    }
  }