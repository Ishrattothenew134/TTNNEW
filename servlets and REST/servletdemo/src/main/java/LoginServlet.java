import javax.imageio.IIOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;

@WebServlet(
        name = "hello",
        urlPatterns = {"/get-world"}
)
public class LoginServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("In INIT Method");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text.html;charset=utf8");
        PrintWriter out = response.getWriter();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String str = "<h2>Content</h2>";
        str +="<table border>";
        str += "<thead>";
        str += "<th>Email</th>";
        str += "<th>UserName</th>";
        str += "<th>Password</th>";
        str += "</thead>";
        str += "<tbody>";
        str += "<tr>";
        str += "<td>"+email+"</td>";
        str += "<td>"+username+"</td>";
        str += "<td>"+password+"</td>";
        str += "</tr>";
        str += "</tbody>";
        str += "</table>";
        out.write(str);
        out.flush();

    }

    @Override
    public void destroy() {
        System.out.println("In DESTROY Method");
    }
}