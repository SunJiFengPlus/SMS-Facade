package com.example.smsfacade.config;

import lombok.Data;

import java.util.List;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public class Configuration {

    private List<AbsSenderConfig> configList;

    public Configuration parseYml(String path) {
        return null;
    }
}
