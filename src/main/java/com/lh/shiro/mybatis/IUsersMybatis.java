package com.lh.shiro.mybatis;

import com.lh.shiro.common.IBaseMybatis;
import com.lh.shiro.po.Users;
import org.springframework.stereotype.Repository;

/**
 * Created by linghu on 17/05/01.
 */
@Repository("usersMybatis")
public interface IUsersMybatis extends IBaseMybatis<Users> {

}
