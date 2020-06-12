package com.example.smsfacade.sender.sms;

import com.example.smsfacade.bean.Message;

/**
 * @author 孙继峰
 * @since 2020/4/11
 */
public class JuheSmsSender extends AbsSmsSender {

    private final String url;

    public JuheSmsSender(String url) {
        this.url = url;
    }

    @Override
    public boolean send(Message message) {

        // TODO
        return false;
    }
}
