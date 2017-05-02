package com.lh.shiro.mybatis;


import com.lh.shiro.po.Admin;
import org.springframework.stereotype.Repository;

/**
 * Created by linghu on 17/04/09.
 */
@Repository("adminMybatis")
public interface IAdminMybatis {
    Admin getAll();
}
