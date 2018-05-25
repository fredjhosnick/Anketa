package Anketa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Quetions")
public class Quetions extends HttpServlet {


    public void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{



    }

    public void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException{

        resp.setContentType("text/html");
        PrintWriter out =resp.getWriter();
        out.println("<html><body>");
        out.println("The name is: "+ req.getParameter("name"));
        out.println("<br><br>");

        String  q1= req.getParameter("question1");
        String  q2= req.getParameter("question2");

        if(q1!=null){

            out.println("The answer is : "+ req.getParameter("question1"));
            out.println("<br><br>");

        }

        if ((q2!=null)){

            out.println("The answer is : "+ req.getParameter("question2"));
            out.println("<br><br>");
        }


        out.println("</html></body>");



    }

}
