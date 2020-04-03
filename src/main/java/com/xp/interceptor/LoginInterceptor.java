package com.xp.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Climb.Xu
 * @date 2020/3/31 22:36
 */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录状态判断
        Object user = request.getSession().getAttribute("loginUser");
        if (user!=null) {
            return true;
        }else {
            request.setAttribute("msg","没有权限,请先登录!");
//            response.sendRedirect("/page/login");
            request.getRequestDispatcher("/page/login").forward(request,response);
            return false;
        }
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
