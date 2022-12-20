package web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/*")
public class CharacterEncodingFilter extends HttpFilter implements Filter {

	//serialVersionUID -> 외부 프로그램이랑 연결할 때 사용함
	private static final long serialVersionUID = 1L;

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//전처리
		System.out.println("전처리");
		chain.doFilter(request, response); //서블릿
		//후처리
		System.out.println("후처리");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
