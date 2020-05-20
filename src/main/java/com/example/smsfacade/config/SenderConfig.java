package com.example.smsfacade.config;

import com.example.smsfacade.sender.sms.SmsSender;
import lombok.Data;

import java.util.Map;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public abstract class SenderConfig {
    protected String name;
    protected String appKey;
    protected Integer index;

    public static SenderConfig of(String name, Map<String, String> configParam) {
        if ("juhe".equals(name)) {
            return new JuheConfig(configParam).eagerFormat();
        }
        throw new RuntimeException("unknown sender name: " + name);
    }

    public abstract SmsSender creatSender();

    public abstract SenderConfig eagerFormat();
}
