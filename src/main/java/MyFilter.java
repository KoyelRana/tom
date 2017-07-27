import java.io.IOException;
import javax.servlet.*;
import java.io.PrintWriter;
import javax.servlet.Filter.*;
import javax.servlet.annotation.WebFilter;
@WebFilter(filterName="MyFilter",urlPatterns="/filter.html")

public class MyFilter implements Filter
{
public void init(FilterConfig arg0)throws ServletException
{
}
 
public void doFilter(ServletRequest req, ServletResponse resp,  
        FilterChain chain) throws IOException, ServletException 
        {
        PrintWriter out=resp.getWriter();
            String fname=req.getParameter("firstname");
            String lname=req.getParameter("lastname");
            if((fname.equals(lname)))
            {
                chain.doFilter(req,resp);
            }
            else
            {
 
                out.println("username and password are error");
                //RequestDispatcher rd=req.getRequestDispatcher(".html");
                 //rd.include(req, resp);  
            }
        }
public void destroy()
{

}
        

}