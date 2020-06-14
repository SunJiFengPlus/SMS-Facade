package com.example.smsfacade.sender.sms;

import com.example.smsfacade.bean.Message;
import com.example.smsfacade.config.JuheConfig;
import com.google.common.base.Joiner;

/**
 * @author 孙继峰
 * @since 2020/4/11
 */
public class JuheSmsSender extends AbsSmsSender {

    private final JuheConfig config;

    public JuheSmsSender(JuheConfig config) {
        this.config = config;
    }

    @Override
    public boolean send(Message message) {
        String url = config.getUrl();
        url = url.replaceFirst("\\{#phone}", message.getPhone());
        url = url.replaceFirst("\\{#templateId}", message.getTemplateId());
        url = url.replaceFirst("\\{#templateValue}", Joiner.on(',').join(message.getArgs()));
        return getRequest(url).isSuccessful();
    }
}
