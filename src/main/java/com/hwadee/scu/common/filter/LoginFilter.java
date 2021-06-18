//package com.hwadee.scu.common.filter;
//
//
//import org.springframework.boot.web.servlet.server.Session;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//@Component
//@WebFilter("/*")
//public class LoginFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("进入过滤器");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest hsr=(HttpServletRequest)servletRequest;
//        HttpServletResponse hsrp=(HttpServletResponse)servletResponse;
//        String contextPath = hsr.getContextPath();
//        System.out.println("过滤器");
//        String requestURI = hsr.getRequestURI();
//        System.out.println(requestURI);
////        if(requestURI.contains("register") ||requestURI.contains("login")||requestURI.contains("Login")||requestURI.contains("assets")||requestURI.contains("ico")){
//////            不过滤的url,直接放行
////            filterChain.doFilter(servletRequest,servletResponse);
////        if(requestURI.contains("register")){
//////            不过滤的url,直接放行
////            filterChain.doFilter(servletRequest,servletResponse);
////        }else {
////            Cookie[] attribute = hsr.getCookies();
////            HttpSession session = hsr.getSession();
////            User user = null;
////            for(Cookie cookie:attribute){
////                System.out.println("拦截器getSessionID");
////                System.out.println("拦截器value:" + cookie.getValue());
////                System.out.println("拦截器name:" + cookie.getName());
////                if (cookie.getName().equals("sessionId")) {
////                    String userName=cookie.getValue();
////                    user = (User) session.getAttribute(userName);
////                    System.out.println(user.getUsername());
////                    System.out.println(userName);
////                }
////            }
////            if(attribute!=null && user!=null){
//////                已经登录
////                filterChain.doFilter(servletRequest,servletResponse);
////            }else{
//////                没有登录，跳转到登录页面
////                hsrp.sendRedirect("/user/loginPage");
////            }
////        }
//        if(requestURI.contains("register")){
////            不过滤的url,直接放行
//            filterChain.doFilter(servletRequest,servletResponse);
//        }else {
//            Cookie[] attribute = hsr.getCookies();
//            HttpSession session = hsr.getSession();
////            User user = null;
//            for(Cookie cookie:attribute){
//                System.out.println("拦截器getSessionID");
//                System.out.println("拦截器value:" + cookie.getValue());
//                System.out.println("拦截器name:" + cookie.getName());
//                if (cookie.getName().equals("sessionId")) {
//                    String userName=cookie.getValue();
////                    user = (User) session.getAttribute(userName);
////                    System.out.println(user.getUsername());
//                    System.out.println(userName);
//                }
//            }
//            if(attribute==null ){
////                已经登录
//                System.out.println("已登陆");
//                filterChain.doFilter(servletRequest,servletResponse);
//            }else{
////                没有登录，跳转到登录页面
//                System.out.println("未登陆");
//                hsrp.sendRedirect("/EnterToLogin");
//            }
//        }
//
//    }
//
//
//    @Override
//    public void destroy() {
//
//    }
//}
