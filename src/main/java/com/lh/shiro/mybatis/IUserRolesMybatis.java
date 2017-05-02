package com.lh.shiro.mybatis;

import com.lh.shiro.common.IBaseMybatis;
import com.lh.shiro.po.UsersRoles;
import org.springframework.stereotype.Repository;

/**
 * Created by linghu on 17/05/01.
 */
@Repository("userRolesMybatis")
public interface IUserRolesMybatis extends IBaseMybatis<UsersRoles> {

}
