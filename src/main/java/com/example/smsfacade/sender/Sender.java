package com.example.smsfacade.sender;

import com.example.smsfacade.bean.Message;

/**
 * @author 孙继峰
 * @since 2020/3/31
 */
public interface Sender {
    boolean send(Message message);
}