package com.example.demo.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author zzh
 * @create 2019-07-21 17:36
 * @desc 测试fastjson
 **/
public class FastJsonTest {

    private Integer id;
    private String string;
    /**
     * 格式化日期
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    /**
     * 转换为json时不包括该属性
     */
    @JSONField(serialize = false)
    private String ignore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIgnore() {
        return ignore;
    }

    public void setIgnore(String ignore) {
        this.ignore = ignore;
    }
}
