package com.example.smsfacade.config;

import okhttp3.OkHttpClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 孙继峰
 * @since 2020/4/11
 */
@Configuration
public class OkHttpConfig {
    @Bean
    public OkHttpClient getOkHttpClient() {
        // TODO
        return null;
    }
}
