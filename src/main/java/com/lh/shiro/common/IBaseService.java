package com.lh.shiro.common;

import com.lh.shiro.common.utils.Msg;

import java.util.List;

/**
 * Created by Beeant on 2016/12/24.
 */
public interface IBaseService<T> {
    Msg<T> insert(T record);

    Msg<Boolean> deleteByPrimaryKey(String... keys);

    Msg<T> selectByPrimaryKey(String... keys);

    Msg<List<T>> selectByExample(T record);

    IBaseMybatis<T> getRepositoryDao();

    void setDefaults(T record);
}
