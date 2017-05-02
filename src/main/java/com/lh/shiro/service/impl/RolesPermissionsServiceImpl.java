package com.lh.shiro.service.impl;


import com.lh.shiro.common.BaseServiceImpl;
import com.lh.shiro.common.IBaseMybatis;
import com.lh.shiro.mybatis.IRolesPermissionsMybatis;
import com.lh.shiro.po.RolesPermissions;
import com.lh.shiro.service.IRolesPermissionsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by linghu on 17/04/09.
 */
@Service("rolesPermissionsService")
public class RolesPermissionsServiceImpl extends BaseServiceImpl<RolesPermissions> implements IRolesPermissionsService {
    @Resource
    private IRolesPermissionsMybatis rolesPermissionsMybatis;


    @Override
    public IBaseMybatis<RolesPermissions> getRepositoryDao() {
        return this.rolesPermissionsMybatis;
    }

    @Override
    public void setDefaults(RolesPermissions record) {

    }
}
