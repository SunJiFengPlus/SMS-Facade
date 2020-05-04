package com.example.smsfacade.config;

import lombok.Data;

import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public class Configuration {

    private List<AbsSenderConfig> configList;

    public Configuration parseYml(String fileName) {
        Map<String, Map<String, Object>> yaml = new Yaml().load(this.getClass().getClassLoader().getResourceAsStream(fileName));
        yaml.forEach((k, v) -> {
            AbsSenderConfig senderConfig = AbsSenderConfig.of(k);
            senderConfig.setMethod(v.get("method").toString());
            senderConfig.setUrlPattern(v.get("url").toString());
            senderConfig.setIndex(Integer.valueOf(v.get("index").toString()));
            senderConfig.setParam((Map<String, String>) v.get("param"));
            configList.add(senderConfig);
        });

        return this;
    }
}
