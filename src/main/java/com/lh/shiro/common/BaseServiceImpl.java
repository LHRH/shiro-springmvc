package com.lh.shiro.common;

import com.lh.shiro.common.utils.Msg;

import java.util.List;

/**
 * Created by linghu on 17/04/17.
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    @Override
    public Msg<T> insert(T record) {
        Msg<T> msg = new Msg<>();
        setDefaults(record);
        int result = getRepositoryDao().insert(record);
        if (0 == result) {
            msg.setResult(1);
            return msg;
        }

        msg.setSuccess(true);
        msg.setData(record);
        return msg;
    }

    @Override
    public Msg<Boolean> deleteByPrimaryKey(String... keys) {
        Msg<Boolean> msg = new Msg<>();
        int result = getRepositoryDao().deleteByPrimaryKey(keys);
        if (0 == result) {
            msg.setResult(1);
            return msg;
        }

        msg.setSuccess(true);
        return msg;
    }

    @Override
    public Msg<T> selectByPrimaryKey(String... keys) {
        Msg<T> msg = new Msg<>();
        T result = getRepositoryDao().selectByPrimaryKey(keys);
        if (null == result) {
            msg.setResult(1);
            return msg;
        }

        msg.setSuccess(true);
        msg.setData(result);
        return msg;
    }

    @Override
    public Msg<List<T>> selectByExample(T record) {
        Msg<List<T>> msg = new Msg<>();
        List<T> result = getRepositoryDao().selectByExample(record);
        if (null == result) {
            msg.setResult(1);
            return msg;
        }

        msg.setSuccess(true);
        msg.setData(result);
        return msg;
    }

}
