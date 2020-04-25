package com.example.smsfacade.config;

import lombok.Data;

import java.util.List;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public class SenderConfig {

    private List<AbsSenderConfig> configs;

    public SenderConfig parseYml(String path) {
        return null;
    }
}
