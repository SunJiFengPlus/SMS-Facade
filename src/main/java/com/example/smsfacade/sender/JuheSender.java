package com.example.smsfacade.sender;

import com.example.smsfacade.bean.Message;
import com.example.smsfacade.config.SenderConfig;

/**
 * @author 孙继峰
 * @since 2020/4/11
 */
public class JuheSender implements Sender {
    private SenderConfig config;

    public JuheSender(SenderConfig config) {
        this.config = config;
    }

    @Override
    public boolean send(Message message) {
        // TODO
        return false;
    }
}
