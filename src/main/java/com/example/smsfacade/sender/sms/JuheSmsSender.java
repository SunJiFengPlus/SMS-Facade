package com.example.smsfacade.sender.sms;

import com.example.smsfacade.bean.Message;
import com.example.smsfacade.config.JuheConfig;

/**
 * @author 孙继峰
 * @since 2020/4/11
 */
public class JuheSmsSender extends AbsSmsSender {

    private JuheConfig config;

    public JuheSmsSender(JuheConfig config) {
        this.config = config;
    }

    @Override
    public boolean send(Message message) {

        return false;
    }
}
