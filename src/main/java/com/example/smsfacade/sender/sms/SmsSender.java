package com.example.smsfacade.sender.sms;

import com.example.smsfacade.bean.Message;

/**
 * 发送短信器
 * @author 孙继峰
 * @since 2020/3/31
 */
public interface SmsSender {
    /**
     * 发送短信
     * @param message 短信内容
     * @return 发送是否成功
     */
    boolean send(Message message);
}