package com.example.smsfacade.sender;

import com.example.smsfacade.bean.Message;
import com.example.smsfacade.config.AbsSenderConfig;

/**
 * @author 孙继峰
 * @since 2020/4/11
 */
public class JuheSender implements Sender {
    private AbsSenderConfig config;

    public JuheSender(AbsSenderConfig config) {
        this.config = config;
    }

    @Override
    public boolean send(Message message) {
        // TODO
        return false;
    }
}
