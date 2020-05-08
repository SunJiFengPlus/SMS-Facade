package com.example.smsfacade.config;

import com.example.smsfacade.sender.Sender;
import lombok.Data;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.util.Strings;

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

    private static final Pattern paramPattern = Pattern.compile("#\\{\\w+}");

    public void eagerFormat(Map<String, String> param) {
        urlPattern = formatUrl(urlPattern, param);
    }

    public String formatUrl(String urlPattern, Map<String, String> param) {
        return "";
    }

    public abstract Sender createSender();

    // TODO: 这里要改
    public static AbsSenderConfig of(String name) {
        if ("juhe".equals(name)) {
            return new JuheConfig();
        }
        throw new RuntimeException("unknown sender name: " + name);
    }
}
