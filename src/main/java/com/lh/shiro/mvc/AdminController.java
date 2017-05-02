package com.lh.shiro.mvc;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by linghu on 17/04/28.
 */
@Controller
@RequestMapping("app")
public class AdminController {
    private static Logger logger = LoggerFactory.getLogger(AdminController.class);

    @RequestMapping("login")
    public String login() {
        return "app/login";
    }
    @RequestMapping("logout")
    public String logout() {
        return "app/login";
    }

    @RequestMapping("success")
    public String success() {
        return "app/success";
    }

    @RequestMapping("unauthorized")
    public String unauthorized() {
        return "app/unauthorized";
    }

    @RequestMapping("logon")
    public String logon(@RequestParam("username") String username, @RequestParam("password") String password) {
        String url = "app/success";
        //1. 获取Subject对象，即将登录的用户
        Subject currentUser = SecurityUtils.getSubject();

        //2.判断用户是否登录
        if (!currentUser.isAuthenticated()) {
            //将用户名及密码封装UsernamePasswordToken
            //3.使用UsernamePasswordToken对象封装用户及密码
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            try {
                //4.使用Subject 实例中的login(token)
                currentUser.login(token);
                //5. Realm:从数据库中获取安全数据
            } catch (UnknownAccountException e) {
                logger.error("用户名未知{}", e);
                url = "app/error";
            } catch (LockedAccountException e) {
                logger.error("用户被锁定{}", e);
                url = "app/error";
            } catch (IncorrectCredentialsException e) {
                logger.error("密码错误{}", e);
                url = "app/error";
            } catch (AuthenticationException e) {
                logger.error("其他未指定异常  {}", e);
                url = "app/error";
            }
        }
        return url;
    }
}
