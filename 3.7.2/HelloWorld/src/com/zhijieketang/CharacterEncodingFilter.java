package com.zhijieketang;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {

    protected String encoding;

    public void init(FilterConfig config) throws ServletException {
        encoding = config.getInitParameter("encoding");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        if (encoding != null) {
            req.setCharacterEncoding(encoding);
        }
        chain.doFilter(req, resp);
    }


    public void destroy() {
        encoding = null;
    }

}
