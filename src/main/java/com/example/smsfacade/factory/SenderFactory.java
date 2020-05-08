package com.example.smsfacade.factory;

import com.example.smsfacade.config.SenderConfig;
import com.example.smsfacade.config.Configuration;
import com.example.smsfacade.sender.Sender;
import lombok.Data;

import java.util.List;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public class SenderFactory {

    private List<SenderConfig> configs;

    public void register(Configuration configuration) {
        configs = configuration.getConfigList();
    }

    public Sender getSender() {
        return null;
    }
}
