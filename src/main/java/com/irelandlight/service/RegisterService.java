package com.irelandlight.service;

import com.irelandlight.model.Consumer;

/**
 * User: Matt
 * Date: 2016/12/10
 * Time: 15:40
 * Description: description
 */
public interface RegisterService {

    /*注册新用户并创建购物车+发送一条欢迎消息+分配一位管理员+设置默认头像*/
    public int RegisterConsumer(Consumer consumer)throws Exception;

}
