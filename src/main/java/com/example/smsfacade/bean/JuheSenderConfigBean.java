package com.example.smsfacade.bean;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
@ConfigurationProperties(prefix = "juhe")
public class JuheSenderConfigBean {
    private String appKey;
    private String url;
}
