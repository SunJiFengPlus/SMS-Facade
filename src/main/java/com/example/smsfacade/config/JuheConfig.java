package com.example.smsfacade.config;

import com.example.smsfacade.sender.JuheSender;
import com.example.smsfacade.sender.Sender;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
public class JuheConfig extends AbsSenderConfig {

    @Override
    public Sender createSender() {
        return new JuheSender(this);
    }
}
