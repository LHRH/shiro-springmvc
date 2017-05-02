package com.lh.shiro.service.impl;


import com.lh.shiro.common.BaseServiceImpl;
import com.lh.shiro.common.IBaseMybatis;
import com.lh.shiro.mybatis.IUserRolesMybatis;
import com.lh.shiro.po.UsersRoles;
import com.lh.shiro.service.IUsersRolesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by linghu on 17/04/09.
 */
@Service("userRolesService")
public class UserRolesServiceImpl extends BaseServiceImpl<UsersRoles> implements IUsersRolesService {
    @Resource
    private IUserRolesMybatis userRolesMybatis;


    @Override
    public IBaseMybatis<UsersRoles> getRepositoryDao() {
        return this.userRolesMybatis;
    }

    @Override
    public void setDefaults(UsersRoles record) {

    }
}
