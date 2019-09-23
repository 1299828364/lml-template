package com.template.lml.demo.filter;


import com.template.lml.demo.utils.JwtUtil;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.util.PathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @ClassName ${NAME}
 * @Description
 * @Author lml
 * @Date2019/9/20 19:02
 * @Version V1.0
 **/


@Component
@WebFilter(filterName = "/*")
public class LoginFilter implements Filter {

    @Autowired
    PathMatcher pathMatcher;

    @Autowired


    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        makeAddressable(response,request);

        try {
            if(!isExceededUrl(request)) {
                String token = request.getHeader("Authorization");
                //检查jwt令牌, 如果令牌不合法或者过期, 里面会直接抛出异常, 下面的catch部分会直接返回
                JwtUtil.validateToken(token);
            }
        } catch (Exception e) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "TOKEN ERROR");
            return;
        }
        System.out.println(isExceededUrl(request));
        System.out.println(isProtectedUrl(request));
        chain.doFilter(req, resp);
    }

    /**
     * 解决跨域问题
     * @param response
     * @param request
     */
    private void makeAddressable(HttpServletResponse response,HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT, GET");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Content-Length, Authorization, Accept, X-Requested-With , yourHeaderFeild");
//        filterChain.doFilter(servletRequest,servletResponse);
        String curOrigin = request.getHeader("Origin");
        System.out.println("###跨域过滤器->当前访问来源->"+curOrigin+"###");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println(System.currentTimeMillis()+"---The Filter have init---");
    }

    /**
     * 我们只对地址 /api 开头的api检查jwt. 不然的话登录/login也需要jwt
     */
    private boolean isProtectedUrl(HttpServletRequest request) {
        return pathMatcher.match("/api/*", request.getServletPath());
    }

    private boolean isExceededUrl(HttpServletRequest request) {
        return pathMatcher.match("/login/*", request.getServletPath())
                || pathMatcher.match("/register/*", request.getServletPath());
    }
}
