import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 
import javax.servlet.http.Cookie; 
import javax.servlet.annotation.WebServlet;   

   @WebServlet("/cookie1")
   
public class DemoCookies extends HttpServlet {  
   
  public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
   
    response.setContentType("text/html");  
      response.setCharacterEncoding("UTF-8");
    PrintWriter out = response.getWriter();          
    String n=request.getParameter("userName");  
    String ag = request.getParameter("userage");
    out.print("Welcome     "+n); 
   
    out.print("\nyour age    "+ag);
   
    Cookie c1=new Cookie("username",n);//creating cookie object 
     
    response.addCookie(c1);//adding cookie in the response  

     Cookie ck=new Cookie("userage",ag);//creating cookie object 
     
    response.addCookie(ck);//adding cookie in the response  
   
    //creating submit button  
    out.print("<form action='/cookie2'>");  
    out.print("<br></br>");
    out.print("<input type='submit' value='go'>");  
    out.print("</form>");  
           
    out.close();  
   
        }catch(Exception e){System.out.println(e);}  
  }  
}  