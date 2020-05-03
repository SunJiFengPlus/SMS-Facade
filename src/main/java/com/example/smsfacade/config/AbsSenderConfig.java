package com.example.smsfacade.config;

import lombok.Data;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public abstract class AbsSenderConfig {
    private String appKey;
    private String url;
    private String method;

    public void formatUrl() {

    }

    // TODO: 这里要改
    public static AbsSenderConfig of(String name) {
        if ("juhe".equals(name)) {
            return new JuheConfig();
        }
        throw new RuntimeException("unknown sender name: " + name);
    }
}
