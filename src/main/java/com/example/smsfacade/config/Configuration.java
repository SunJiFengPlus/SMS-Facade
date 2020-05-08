package com.example.smsfacade.config;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;


/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public class Configuration {

    public List<SenderConfig> parseYml(String fileName) {
        List<SenderConfig> configList = new ArrayList<>();
        Map<String, Map<String, String>> yaml = new Yaml().load(this.getClass().getClassLoader().getResourceAsStream(fileName));

        yaml.forEach((k, v) -> configList.add(SenderConfig.of(k, v)));
        return configList;
    }
}
