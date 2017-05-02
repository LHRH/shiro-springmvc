package com.lh.shiro.po;

import java.io.Serializable;

/**
 * Created by linghu on 17/05/01.
 */
public class UsersRoles implements Serializable {
    private String roleId;

    private String userName;

    private String roleName;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
