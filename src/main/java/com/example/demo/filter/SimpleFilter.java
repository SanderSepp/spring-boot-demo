package com.example.demo.filter;


import java.io.IOException;

import javax.servlet.*;

import org.springframework.stereotype.Component;

@Component
public class SimpleFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    System.out.println("Remote Host:"+request.getRemoteHost());
    System.out.println("Remote Address:"+request.getRemoteAddr());
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {

  }
}
