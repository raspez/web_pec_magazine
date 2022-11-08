package cz.vsb.jat.projetJAT;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/*")
public class MyFilter implements Filter {

  
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
/*		HttpServletRequest httpServletRequest= (HttpServletRequest)request;
		Enumeration<String> e = httpServletRequest.getSession().getAttributeNames();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		Object o = httpServletRequest.getSession().getAttribute("LoginMB");
		if( o != null){*/
			chain.doFilter(request, response);
	/*	} else {
			HttpServletResponse res = (HttpServletResponse)response;
//			res.sendRedirect("/faces/login");
			httpServletRequest.getServletContext().getRequestDispatcher("/faces/login.xhtml").forward(httpServletRequest, response);
		}  */
			
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
