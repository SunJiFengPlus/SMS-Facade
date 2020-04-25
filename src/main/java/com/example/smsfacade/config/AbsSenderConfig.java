package com.example.smsfacade.config;

import lombok.Data;

import java.util.Map;

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
}
