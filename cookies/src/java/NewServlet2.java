/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lion's Life
 */
public class NewServlet2 extends HttpServlet {

   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out=response.getWriter();
       Cookie[] c=request.getCookies();
       
       out.println("Hello->Cookies are :"+c[0].getValue()+" and "+c[1].getValue());
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
