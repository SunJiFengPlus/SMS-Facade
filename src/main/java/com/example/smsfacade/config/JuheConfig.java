package com.example.smsfacade.config;

import com.example.smsfacade.sender.sms.JuheSmsSender;
import com.example.smsfacade.sender.sms.SmsSender;
import lombok.Getter;

import java.util.Map;

import org.springframework.beans.BeanUtils;

/**
 * @author 孙继峰
 * @since 2020/5/8
 */
@Getter
public class JuheConfig extends SenderConfig {
    public String url = "http://v.juhe.cn/sms/send?mobile=#{mobile}&tpl_id=#{templateId}&tpl_value=#{templateValue}&key={#appKey}";

    public JuheConfig(Map<String, String> configParam) {
        BeanUtils.copyProperties(configParam, this);
    }

    @Override
    public SmsSender creatSender() {
        return new JuheSmsSender(this);
    }

    @Override
    public SenderConfig eagerFormat() {
        url = url.replaceFirst("\\{#appKey}", appKey);
        return this;
    }

}
