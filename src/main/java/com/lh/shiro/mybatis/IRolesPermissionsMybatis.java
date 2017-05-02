package com.lh.shiro.mybatis;

import com.lh.shiro.common.IBaseMybatis;
import com.lh.shiro.po.RolesPermissions;
import org.springframework.stereotype.Repository;

/**
 * Created by linghu on 17/05/01.
 */
@Repository("rolesPermissionsMybatis")
public interface IRolesPermissionsMybatis extends IBaseMybatis<RolesPermissions> {

}
