package cn.bugstack.xfg.frame.types;

import lombok.Data;

import java.util.Date;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description
 * @create 2023-07-29 10:47
 */
@Data
public class BaseEvent<T> {

    private String id;
    private Date timestamp;
    private T data;

}
