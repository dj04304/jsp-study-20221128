package web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  요청의 종류
 *  
 * 	 1. view(HTML) 요청 page를 띄워 줄 때	<- 무조건 Get요청 (주소창)
 *  2. api 요청(중복체크와 같이 페이지를 벗어나지 않는 요청) Application Programming Interface <- CRUD를 다 가진다. : JavaScript(AJAX 비동기 요청)
 *  	api는 하나의 기능을 수행할 수 있는 프로그램을 말한다. 인터페이스라는 개념이 들어있기 때문에 username을 체크하는 api를 만들었다면 파라미터가 계속바뀌기도 하고 다른곳에서도
 *  	사용할 수 있다.
 *  
 *  3. /api/v1 이 붙으면 api요청, 아니면 페이지 요청이라고 구분한다.
 *  
 *  4. 파일이 만들어지지 않을 경우
 *  	우리가 만들고 있는 실질적인 경로는 workspace 내의 metadata -> plugins -> server.core -> tmp0 -> wtpwebapps 파일에 있다.
 *  	만약 static 폴더라던지 어떠한 파일을 생성했는데 만들어지지 않거나 문제가 생기면 이 경로를 통해 생성됐는 지 확인해보도록 한다.
 *  
 *  5. WEB-INF 에 css, js를 같이 안넣는 이유 
 *  	WEB-INF/views는 온전히 서버에서만 접근할 수 있는 폴더여야 하며, css, js 는 브라우저가 요청을 날릴 수 있어야 한다. 
 */

//@WebServlet("/index") 는 임의로 만들어 준 주소이다.
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
			
			
		}

	

}
