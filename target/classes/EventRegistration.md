# EVENT REGISTRATION FORM #
**Description**

This is the simple Web Project using Servlet and Jsp Pages developed for Event registration Form. Here I Use simple Email function to send mail to the registered Users and I have used Filter and Session Concepts for authentication purpose.

# REQUIREMENTS

**For JSP**

1)Login 

2)Home Page

3)User Registration Form



**For POJO Class**

1)Login Servlet

2)Logout Servlet

3)Profile Servlet

4)MyFilter

5)DB_Connect

6)EventPojo

7)EventCrud

8)User_data

9)View_data

10)Edit_data

11)Delete_data

12) Sending mail

**SQL**

**Database**

event

**Table**


eventform

# CODING

**Welcome.jsp**

`<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="C:\Users\koyelrana\Desktop\boot.js"></script>

<style>

.bt{
    margin-left:150px;
    margin-top:10px;
}
.well{
    text-align:center;
    background-color:silver;
    color:gold;

}
.lg{
    border: 10px solid lightgreen;
    width:500px;
    padding-left:50px;
    padding-top:50px;
}
.footer
{
 margin-top:450px;
 background-color:skyblue;
    color:green;
    height:200px;

}
#text{
    background-color:black;
    color:white;
}
body{
    background:
}
</style>
</head>

    <body>

<div class="well kk">
        <h1>MASTER PAGE</h1>
    </div>
  <div class="login col-sm-6">

  <div class="lg">
        <form action="Home" method="POST">
            
            
                 
                    FIRST NAME
                &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;   &nbsp; &nbsp;   <input id="text" type="text" name="firstname">
           <br/></br>
                    LAST NAME &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;   &nbsp; &nbsp;  &nbsp; 
                    <input id="text" type="text" name="lastname">
            <br/>
            
               
<br/>
     <button type=Submit class="btn btn-success bt">Login</button>
       <br/><br/><br><br>
</div><br/>
         
            

                    
      
        </form>
        
            <a href="index.jsp" target="_blank"><button class="btn btn-primary" type="submit">Register</button></a>
                    <a href="ViewUser" target="_blank"><button class="btn btn-primary" type="submit">View here</button></a>
              
                    <a href="delete.jsp" target="_blank"><button  class="btn btn-danger"type="submit">Delete</button></a>
                <a href="update.jsp" target="_blank">  <button class="btn btn-warning" type="submit">  Update</button></a>
      
        </div>
        <div class="cl col-sm-6">
<img src="http://diyhealth.com/wp-content/uploads/2013/04/tech_related_health_issues_g5iyh.jpg">
        </div>
        <div class="footer">
        <h5>Contact Us:<br/>
        Name: Koyel Rana<br/>
        Email:koyel.rana@kggroup.com<br/>
        Mobile No: 9025997001</h5>
        </div>


    </body>
</html>
`
**EventPojo**

`class EventPojo
{
    String firstname,lastname,email,date,time,topic,location;
    public void setfirstname(String firstname)
    {
        this.firstname=firstname;
    }
    public String getfirstname()
    {
        return firstname;
    }
    public void setlastname(String lastname)
    {
        this.lastname=lastname;
    }
    public String getlastname()
    {
        return lastname;
    }
    public void setemail(String email)
    {
        this.email=email;
    }
    public String getemail()
    {
        return email;
    }
    public void setdate(String date)
    {
        this.date=date;
    }
    public String getdate()
    {
        return date;
    }
    public void settime(String time)
    {
        this.time=time;
    }
    public String gettime()
    {
        return time;
    }
    public void settopic(String topic)
    {
       this.topic=topic;
    }
    public String gettopic()
    {
        return topic;
    }
    public void setlocation(String location)
    {
      this.location=location;
    }
    public String getlocation()
    {
        return location;
    }

}

`

**EventCrud**


`import java.lang.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.*;
import java.sql.*;
public class EventCrud
{
    public static Connection getConnection()
    {
    Connection con=null;
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/event","root","");
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    return con;
}

     public static List<EventPojo> getAllUser(){  
        List<EventPojo> list=new ArrayList<EventPojo>();  
          
        try{  
            Connection con=EventCrud.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventform");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
            EventPojo e=new EventPojo();  
               
                  e.setlastname(rs.getString(2));  
                e.setemail(rs.getString(3));  
                e.setdate(rs.getString(4));  
                e.setfirstname(rs.getString(1));  
                e.settime(rs.getString(5)); 
                e.settopic(rs.getString(6)); 
                e.setlocation(rs.getString(7)); 
                
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  public static int delete(String firstname){  
        int status=0;  
        try{  
            Connection con=EventCrud.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from eventform where firstname=?");  
            ps.setString(1,firstname);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }
    public static EventPojo getEmployeeById(String firstname){  
        EventPojo e=new EventPojo();  
          
        try{  
            Connection con=EventCrud.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventform where firstname=?");  
            ps.setString(1,firstname);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setlastname(rs.getString(2));  
                e.setemail(rs.getString(3));  
                e.setdate(rs.getString(4));  
                e.setfirstname(rs.getString(1));  
                e.settime(rs.getString(5)); 
                e.settopic(rs.getString(6)); 
                e.setlocation(rs.getString(7)); 
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }
     public static int update(EventPojo e){  
        int status=0;  
        try{  
            Connection con=EventCrud.getConnection();  
            PreparedStatement ps=con.prepareStatement("update eventform set lastname=?,email=?,date=?,time=?,topic=?,location=? where firstname=?");
            
         ps.setString(1,e.getlastname());  
            ps.setString(2,e.getemail());  
            ps.setString(3,e.getdate());  
            ps.setString(4,e.gettime());
                ps.setString(5,e.gettopic());
                  ps.setString(6,e.getlocation());
                    ps.setString(7,e.getfirstname());

            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
  
}  


`

**Home.java**

`import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import javax.servlet.ServletException;  
import javax.servlet.http.*;

@WebServlet(name= "Home", urlPatterns= "/Home")
public class Home extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
             response.setContentType("text/html");
             PrintWriter out=response.getWriter();
             int flag=0;
             String u_name,pass;
            String driver_name="com.mysql.jdbc.Driver";
            String driver_url="jdbc:mysql://localhost/";
            String db_name="event";
            String user_name="root";
            String password="";

         try
        {
            Class.forName(driver_name);
            Connection con=DriverManager.getConnection(driver_url+db_name,user_name,password);
            String query="SELECT * FROM eventform";

            PreparedStatement statement=con.prepareStatement(query);
            ResultSet rs=statement.executeQuery();
            String firstname=request.getParameter("firstname");
            String lastname=request.getParameter("lastname");
            System.out.println(firstname);
            System.out.println(lastname);
           
          while(rs.next())
          {
                u_name=rs.getString(1);
                pass=rs.getString(2);
                System.out.println(u_name);
                System.out.println(pass);
              if((firstname.equals(u_name))&&(lastname.equals(pass)))
              {
                  flag=1;
                   out.print("<br><h1>Welcome to our company</h1><br>");
                   break;
              } 
          }
          if(flag==0)
          {
                out.println("<h1>sorry Register here</h1>");
                RequestDispatcher rs1=request.getRequestDispatcher("welcome.jsp");
                rs1.include(request,response);
          }
           
    }catch(Exception e)   
    {
        e.printStackTrace();
    }
    }  
  
} 

`

**DB_connect**

`import java.util.*;
import java.sql.*;
public class DB_connect
{
    static Connection conn;
    public static Connection getCon()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","");
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
     return conn;
    }
}

`

**Registration.java**
`import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
      import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.servlet.ServletException;  
import javax.servlet.http.*;

@WebServlet(name= "Registeration", urlPatterns= "/Registeration")
public class Registeration extends HttpServlet
{
        String driver_name="com.mysql.jdbc.Driver";
        String driver_url="jdbc:mysql://localhost/";
        String db_name="event";
        String user_name="root";
        String password="";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setContentType("text/html");  

        try
        {
            Class.forName(driver_name);
            Connection con=DriverManager.getConnection(driver_url+db_name,user_name,password);
            PrintWriter out = response.getWriter(); 
           String firstname=request.getParameter("firstname");  
        String lastname=request.getParameter("lastname");  
        String date=request.getParameter("date");  
        String email=request.getParameter("email");  
        String time=request.getParameter("time");  
        String topic=request.getParameter("topic");  
        String location=request.getParameter("location");  

            String query="INSERT INTO eventform(firstname,lastname,email,date,time,topic,location) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement e=con.prepareStatement(query);

            e.setString(1,firstname);  
        e.setString(2,lastname);  
        e.setString(4,date);  
        e.setString(3,email);  
         e.setString(5,time);  
          e.setString(6,topic);  
           e.setString(7,location);  
            e.executeUpdate();
            
            out.println(user_name);
            out.print("<br><h1>Your details registered successfully</h1><br>"); 
           

Registeration reg=new Registeration();
reg.sendEmail(email);
out.println("mail sent successfully");

 RequestDispatcher rs=request.getRequestDispatcher("welcome.jsp");  
            rs.include(request, response);
           // response.sendRedirect("welcome.jsp");

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    public static void sendEmail(String to)
{
final String username = "koyel.rana@kggroup.com";
final String password = "Ramjaneu@123";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "false");
props.put("mail.smtp.host", "webmail.kggroup.com");
props.put("mail.smtp.port", "25");
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("koyel.rana@kggroup.com"));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse(to));

/*for( int i = 0; i < recipientList.length; i++) {
               message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ddd));
           }*/
    
              // message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ddd));

           

//message.setRecipients(Message.RecipientType.CC,cc);
//message.setRecipients(Message.RecipientType.CC,InternetAddress.parse("vanitha.v@kggroup.com","subitha.m@kggroup.com","switha.c@kggroup.com"));
message.setSubject("hello !!!");
message.setText("This is an example program for crud operations and send mail.........,"
+ "\n\n No spam to my email, please!");
Transport.send(message);
System.out.println("Done");
}
catch (MessagingException e) 
{
throw new RuntimeException(e);
//System.out.println("Username or Password are incorrect ... exiting !");
}
} 
}

`

**ViewUser.java**

`import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet(name="ViewUser" , urlPatterns="/ViewUser")  
public class ViewUser extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='welcome.jsp'>Add New User</a>");  
        out.println("<h1>User List</h1>");  
          
        List<EventPojo> list=EventCrud.getAllUser();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>Time</th><th>Topic</th><th>Topic</th></tr>");  
        for(EventPojo e:list)
        {  
         out.print("<tr><td>"+e.getfirstname()+"</td><td>"+e.getlastname()+"</td><td>"+e.getemail()+"</td><td>"+e.getdate()+"</td><td>"+e.gettime()+"</td><td>"+e.gettopic()+"</td><td>"+e.getlocation()+"</td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}  

`
**Updateuser.java**

`import java.io.IOException;  
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

`

**EditUser.java**
`import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/EditUser")  
public class EditUser extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update User</h1>");  
        String semail=request.getParameter("firstname");  
          
        EventPojo e=EventCrud.getEmployeeById(semail);  
          
        out.print("<form action='UpdateUser' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td>FirstName:</td><td><input type='text' name='firstname' value='"+e.getfirstname()+"'/></td></tr>");  
        out.print("<tr><td>LastName:</td><td><input type='password' name='lastname' value='"+e.getlastname()+"'/></td></tr>");  
        out.print("<tr><td>Email:</td><td><input type='hidden' name='email' value='"+e.getemail()+"'/></td></tr>"); 
        out.print("<tr><td>Date:</td><td><input type='text' name='date' value='"+e.getdate()+"'/></td></tr>"); 
        out.print("<tr><td>Time:</td><td><input type='text' name='time' value='"+e.gettime()+"'/></td></tr>"); 
        out.print("<tr><td>Topic:</td><td><input type='text' name='topic' value='"+e.gettopic()+"'/></td></tr>"); 
        out.print("<tr><td>Location:</td><td><input type='text' name='location' value='"+e.getlocation()+"'/></td></tr>"); 
        out.print("<tr><td colspan='2'><input type='submit' value='update '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    }  
} 
`

**Delete.java**

`import java.io.IOException;
import java.io.PrintWriter;
import java.lang.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet(name="DeleteUser" , urlPatterns="/DeleteUser")  
public class DeleteUser extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException { 
                 PrintWriter out=response.getWriter(); 
        String Em=request.getParameter("firstname");
        
      
         
          EventCrud.delete(Em);  
          out.println("<h1>Updated Successfully</h1>");
          response.sendRedirect("ViewUser");
    }  
}  

`

**MyFilter.java**
`import java.io.IOException;
import javax.servlet.*;
import java.io.PrintWriter;
import javax.servlet.Filter.*;
import javax.servlet.annotation.WebFilter;
@WebFilter(filterName="AdminServlet",urlPatterns="/MyFilter")

public class MyFilter implements Filter
{
public void init(FilterConfig arg0)throws ServletException
{
}
public void doFilter(ServletRequest req, ServletResponse resp,  
        FilterChain chain) throws IOException, ServletException 
        {
        PrintWriter out=resp.getWriter();
            String password=req.getParameter("password");
            if(password.equals("admin"))
            {
                chain.doFilter(req,resp);
            }
            else
            {
 
                out.println("username and password are error");
                RequestDispatcher rd=req.getRequestDispatcher("filter.html");
                 rd.include(req, resp);  
            }
        }
public void destroy()
{

}
        

}`

