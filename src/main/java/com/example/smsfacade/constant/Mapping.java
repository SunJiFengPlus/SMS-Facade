package com.example.smsfacade.constant;

import com.example.smsfacade.config.AbsSenderConfig;
import com.example.smsfacade.config.JuheConfig;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
public enum Mapping {
    // TODO: 这样每次调用是不是都会创建一个对象?
    JUHE("juhe", new JuheConfig());

    private final String senderName;
    private final AbsSenderConfig config;

    public AbsSenderConfig of(String senderName) {
        return null;
    }

    public String getSenderName() {
        return senderName;
    }

    public AbsSenderConfig getConfig() {
        return config;
    }

    Mapping(String senderName, AbsSenderConfig config) {
        this.senderName = senderName;
        this.config = config;
    }
}
