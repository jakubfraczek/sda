package aplicationServers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/")
public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
	throws ServletException, IOException {
		response.getWriter().write("<b>EmbeddedJetty</b>");
		response.flushBuffer();
	}
}
