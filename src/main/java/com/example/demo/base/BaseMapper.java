package com.example.demo.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @desc 自己的Mapper基类，主要不能放到mapper下
 * @author zzh
 * @param <T>
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
