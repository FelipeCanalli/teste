package hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang = \"pt-br\">");
		out.println("<head>");
		out.println("<title>Hello Servlet</title>");
		out.println("</head>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>Hello Servlet</h1>");
		out.println("<h4>Felipe Galv�o Canalli</h4>");
		out.println("<p>Servlet � uma classe Java que recebe essas requisi��es vindas do usu�rio, processa as informa��es e produz um conte�do din�mico. </p>");
		out.println("<p>A resposta do Servidor de aplicativos Java ser� sempre um conte�do que o navegador do cliente possa processar, geralmente uma p�gina HTML gerada de forma din�mica. </p>");
		out.println("</body>");
		out.println("</html>");
	}

}
