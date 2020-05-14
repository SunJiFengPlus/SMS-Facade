package com.example.smsfacade.config;

import com.example.smsfacade.sender.Sender;
import lombok.Data;

import java.util.Map;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public abstract class SenderConfig {
    private String name;
    private String appKey;
    private Integer index;

    // TODO: 优化写法
    public static SenderConfig of(String name, Map<String, String> configParam) {
        if ("juhe".equals(name)) {
            return new JuheConfig();
        }
        throw new RuntimeException("unknown sender name: " + name);
    }

    public abstract Sender creatSender();
}
