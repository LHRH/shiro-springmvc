package com.lh.shiro.bean;

import com.lh.shiro.common.utils.Msg;
import com.lh.shiro.po.Users;
import com.lh.shiro.service.IUsersService;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by linghu on 17/04/16.
 * 查询数据库，得到正确的数据
 */
public class ShiroRealm extends AuthenticatingRealm {

    private Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

    @Autowired
    private IUsersService usersService;

    /**
     * 1.doGetAuthenticationInfo 获取认证消息，如果数据库没有返回数据，返回null 如果得到正确的用户名和密码，返回指定的类型的对象
     * <p>
     * 2.AuthenticationInfo 可以使用SimpleAuthenticationIfo 实现类封装正确的用户名和密码
     * <p>
     * 3.token参数 就是我们认证的token
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        SimpleAuthenticationInfo info = null;
        // 1.将token 装换为UserNamePasswordToken
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        // 2. 获取用户名即可
        String username = upToken.getUsername();
        logger.info("用户名:{}", username);
        Users users = new Users();
        users.setUserName(username);
        Msg<List<Users>> listMsg = usersService.selectByExample(users);
        if (listMsg.getSuccess()) {
            Object principal = listMsg.getData().get(0).getUserName();
            Object credentials = listMsg.getData().get(0).getPassword();
            String realmName = this.getName();
            info = new SimpleAuthenticationInfo(principal, credentials, realmName);
        } else {
            throw new AuthenticationException();
        }
        // 3.查询数据库

        //4. 如果查询到了，封装查询结果 ，返回给我们的调用

        // 5.如果没有查询到 抛出一个异常

        return info;
    }
}
