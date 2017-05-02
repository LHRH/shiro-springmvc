package com.lh.shiro.po;

import java.io.Serializable;

/**
 * Created by linghu on 17/05/01.
 */
public class RolesPermissions implements Serializable {
    private String perId;

    private String permission;

    private String roleName;

    public String getPerId() {
        return perId;
    }

    public void setPerId(String perId) {
        this.perId = perId;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
