import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


// 注解两层意思：
// 第一层意思是 AnnotationServlet 这个 Java 类是一个 Servlet，
// 第二层意思是这个 Servlet 对应的 URL 路径是 myAnnotationServlet
// 就不需要web.xml来配置 Servlet 了
@WebServlet("/myServletAnnotate")
public class MyServletAnnotate extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyServletAnnotate 在处理get()请求...");;
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html;charset=utf-8");
        out.println("<strong>My Servlet Annotate!<strong><br>");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyServletAnnotate 在处理post()请求...");
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html;charset=utf-8");
        out.println("<strong>My Servlet Annotate!<strong><br>");
    }
}
