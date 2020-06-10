package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/add"})
public class AddingServlet extends HttpServlet
{

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Servlet is initilized");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("Service method Called with Annotation");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        System.out.println("Get method is called to call add.jsp with Annotation");
       resp.sendRedirect("add.jsp");
       //int a=10;
       //int b=20;
       System.out.println("<html><body>");
        //System.out.println("Redirected to add");
        //String registerForm = "add.jsp";
        //RequestDispatcher dispatcher = req.getRequestDispatcher(registerForm);
        //dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("Post method is called with Annotation");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Finally destroy is called"); //when tomcat is closed..
    }
}
