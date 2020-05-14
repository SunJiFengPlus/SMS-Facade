package com.example.smsfacade.config;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.yaml.snakeyaml.Yaml;


/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public class Configuration {

    private List<SenderConfig> configList = new LinkedList<>();

    public Configuration parseYml(String fileName) {
        Map<String, Map<String, String>> yaml = new Yaml().load(this.getClass().getClassLoader().getResourceAsStream(fileName));
        yaml.forEach((k, v) -> {
            SenderConfig senderConfig = SenderConfig.of(k, v);
            configList.add(senderConfig);
        });

        return this;
    }
}
