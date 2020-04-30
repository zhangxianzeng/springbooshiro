package com.zjt.web;


import com.zjt.entity.Tuser;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * 基础控制器
 *
 * @author tuc
 */
public abstract class BaseContrller {

    /**
     * 当前账号常量
     */
    private static final String USER = "user";


    private HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    }

    public Tuser getUser() {
        HttpSession session = getRequest().getSession();
        return (Tuser) session.getAttribute(USER);
    }

    public void setUser(Tuser user) {
        HttpSession session = getRequest().getSession();
        if (user != null) {
            session.setAttribute(USER, user);
            //session过期时间设置，以秒为单位，即在没有活动30分钟后，session将失效
            session.setMaxInactiveInterval(30 * 60);
        }
    }

}