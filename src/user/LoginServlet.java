package user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login"})

public class LoginServlet extends HttpServlet {
    //handles the login request here..
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);

        String user = req.getParameter("login");
        String pass = req.getParameter("password");
        System.out.println(user + "::" + pass);
        if (user.equals("qalamsal8@gmail.com") && pass.equals("root"))
            resp.sendRedirect("modules/users/sucess.jsp");
        else
            resp.sendRedirect("modules/users/error.jsp");
    }
}