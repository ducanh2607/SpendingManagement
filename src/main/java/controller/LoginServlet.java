package controller;

import service.Impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    private UserServiceImpl userService;

    public void init() {
        userService = new UserServiceImpl();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getParameter("action");
if (action == null) {
    action ="";

}switch (action) {
            default:
                displayFormLogin(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action ="";

        }switch (action) {
            case "create":
                create(request, response);
                break;
            case "register":
                displayFormRegister(request, response);
                break;
            case "home" :
                displayHome(request, response);
                break;
            case "account" :
                displayInformationAccount(request, response);
                break;
            default:
                displayFormLogin(request, response);
                break;
        }
    }

    private void displayFormLogin(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("login/login.jsp");
        dispatcher.forward(request, response);
    }

    private void displayFormRegister(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("Register/register.jsp");
        dispatcher.forward(request, response);
    }


    private void displayHome(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("home/home.jsp");
        requestDispatcher.forward(request, response);
    }

    private void displayInformationAccount(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("statistical.jsp");
        requestDispatcher.forward(request, response);
    }

    private void create(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        if (userService.add(request)) {
            HttpSession session = request.getSession();
            session.setAttribute("message", "Create successfully");
        }
        response.sendRedirect("http://localhost:8080/login");
    }
}


