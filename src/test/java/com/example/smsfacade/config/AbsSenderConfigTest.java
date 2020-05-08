package com.example.smsfacade.config; 

import com.example.smsfacade.sender.Sender;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/** 
* JuheConfig Tester. 
* 
* @author SunJiFeng
* @since 05/08/2020 
*/ 
public class AbsSenderConfigTest {
    private final AbsSenderConfig absSenderConfig = new AbsSenderConfig() {
        @Override
        public Sender createSender() {
            return null;
        }
    };


    @Test
    @DisplayName("格式化多个值")
    public void formatUrl() {
        String urlPattern = "http://localhost:8080/#{page}/#{pageNum}";
        Map<String, String> param = new HashMap<>();
        param.put("page", "1");
        param.put("pageNum", "2");

        String url = absSenderConfig.formatUrl(urlPattern, param);

        assertThat(url).isEqualTo("http://localhost:8080/1/2");
    }
}
