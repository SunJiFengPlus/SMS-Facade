package com.example.smsfacade.config;

import com.example.smsfacade.sender.sms.JuheSmsSender;
import com.example.smsfacade.sender.sms.SmsSender;

import java.util.Map;

import org.springframework.beans.BeanUtils;

/**
 * @author 孙继峰
 * @since 2020/5/8
 */
public class JuheConfig extends SenderConfig {
    private static final String URL = "http://v.juhe.cn/sms/send?mobile=#{mobile}&tpl_id=#{templateId}&tpl_value=#{templateValue}&key={appKey}";

    // TODO
    public JuheConfig(Map<String, String> configParam) {
        BeanUtils.copyProperties(configParam, this);

    }


    // TODO
    @Override
    public SmsSender creatSender() {
        return new JuheSmsSender(URL);
    }

    @Override
    public SenderConfig eagerFormat() {
        return this;
    }

}
