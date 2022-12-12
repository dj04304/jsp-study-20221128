package web.servlet.api;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/api/v1/username")
public class GetUsername extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//config 는 filter 또는 session 사용 시 필요함
	public void init(ServletConfig config) throws ServletException {
		System.out.println("최초 1회만 실행");
	}

	public void destroy() {
		System.out.println("서블릿 객체 소멸 시 실행");
	}
	
	
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//요청마다 어떤 요청인지 출력
//		System.out.println(request.getMethod());
//		System.out.println("서비스 호출");
//	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String t = request.getParameter("test");
		String name = request.getParameter("name");
		
		System.out.println("Get요청 들어옴");
		System.out.println("Read");
		
		System.out.println("test: " + t);
		System.out.println("name: " + name);
		
		request.setAttribute("name", name);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user.jsp");
		dispatcher.forward(request, response);
		
		//한글로 나오기 위한 encoding
//		response.setContentType("text/html; charset=UTF-8");
//		response.setCharacterEncoding("UTF-8");
//		response.getWriter().println("<html><head></head><body>");
//		response.getWriter().println("<h1>안녕하세요</h1></body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post요청 들어옴");
		System.out.println("Create");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Put요청 들어옴");
		System.out.println("Update");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Delete요청 들어옴");
		System.out.println("Delete");
	}
	
}
