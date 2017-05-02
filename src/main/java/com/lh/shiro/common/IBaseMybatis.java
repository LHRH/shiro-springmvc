package com.lh.shiro.common;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by linghu on 17/05/01.
 */
public interface IBaseMybatis<T> {
    int insert(T record);

    int deleteByPrimaryKey(@Param("keys") String... keys);

    int updateByPrimaryKey(T record);

    T selectByPrimaryKey(@Param("keys") String... keys);

    List<T> selectByExample(@Param("item") T record);

}
