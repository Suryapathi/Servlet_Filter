import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 
import javax.servlet.http.Cookie; 

import javax.servlet.annotation.WebServlet;


@WebServlet("/cookie2")
   
public class ShowCookieData extends HttpServlet {  
   
public void doGet(HttpServletRequest request, HttpServletResponse response){  
    try{  
   
    response.setContentType("text/html");  
    response.setCharacterEncoding("UTF-8");
    PrintWriter out = response.getWriter();  
       
    Cookie ck22[] = request.getCookies();  

    out.print("Hello "+  "       "+ck22[1].getValue()); 
    out.print("\nyour age"+"       "+ck22[2].getValue()); 
   
    out.close();  
   
         }catch(Exception e){System.out.println(e);}  
    }  
       
   
}  