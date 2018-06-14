import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
 


@WebFilter("/filter")
public class AuthFilter implements Filter {
 
	FilterConfig filterConfig = null;
 
	public void destroy() {
	}
 
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("In AuthFilter before doFilter");
		chain.doFilter(request, response);
		System.out.println("In AuthFilter after doFilter");
		// RequestDispatcher rd=req.getRequestDispatcher("/filter"); 
	}
 
	public void init(FilterConfig fConfig) throws ServletException {
		this.filterConfig = fConfig;
	}
 
}