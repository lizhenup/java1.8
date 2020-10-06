package com.lz.filter;


import javax.servlet.*;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/9 15:22
 * @description：
 * @modified By：
 * @version: $
 */
public class EncodingFiler implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
    }

    public void destroy() {

    }
}
