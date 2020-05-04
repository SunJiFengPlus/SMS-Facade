package com.example.smsfacade.config;

import lombok.Data;

import java.util.Map;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public abstract class AbsSenderConfig {
    private String urlPattern;
    private String method;
    private Integer index;
    private Map<String, String> param;

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
