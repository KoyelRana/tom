import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/UpdateUser")  
public class UpdateUser extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
       
        String firstname=request.getParameter("firstname");  
        String lastname=request.getParameter("lastname");  
        String date=request.getParameter("date");  
        String email=request.getParameter("email");  
        String time=request.getParameter("time");  
        String topic=request.getParameter("topic");  
        String location=request.getParameter("location");  
          
       EventPojo e=new EventPojo();  
         
        e.setfirstname(firstname);  
        e.setlastname(lastname);  
        e.setdate(date);  
        e.setemail(email);  
         e.settime(time);  
          e.settopic(topic);  
           e.setlocation(location);  
          
        int status=EventCrud.update(e);  
        if(status>0){  
            response.sendRedirect("ViewUser");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  