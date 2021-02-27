package com.zhijieketang;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "EncodingFilter", urlPatterns = {"/*"})
//@WebFilter(filterName = "EncodingFilter", servletNames = {"*"})
public class CharacterEncodingFilter implements Filter {

    protected String encoding = "utf-8";

    public void init(FilterConfig config) throws ServletException {
//        encoding = config.getInitParameter("encoding");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        if (encoding != null) {
            req.setCharacterEncoding(encoding);
        }
        chain.doFilter(req, resp);
    }


    public void destroy() {
    }

}
