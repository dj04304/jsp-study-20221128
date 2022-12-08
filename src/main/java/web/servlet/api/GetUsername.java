package web.servlet.api;

import java.io.IOException;
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
	
//주석처리하면 get요청이 실행 됨
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("서비스 호출");
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get요청 들어옴");
		System.out.println("Read");
	}


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
