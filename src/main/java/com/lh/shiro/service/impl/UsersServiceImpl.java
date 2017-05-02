package com.lh.shiro.service.impl;


import com.lh.shiro.common.BaseServiceImpl;
import com.lh.shiro.common.IBaseMybatis;
import com.lh.shiro.mybatis.IUsersMybatis;
import com.lh.shiro.po.Users;
import com.lh.shiro.service.IUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by linghu on 17/04/09.
 */
@Service("usersService")
public class UsersServiceImpl extends BaseServiceImpl<Users> implements IUsersService {
    @Resource
    private IUsersMybatis usersMybatis;


    @Override
    public IBaseMybatis<Users> getRepositoryDao() {
        return this.usersMybatis;
    }

    @Override
    public void setDefaults(Users record) {

    }
}
