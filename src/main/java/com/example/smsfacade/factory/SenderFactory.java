package com.example.smsfacade.factory;

import com.example.smsfacade.config.AbsSenderConfig;
import com.example.smsfacade.config.SenderConfig;
import com.example.smsfacade.sender.Sender;
import lombok.Data;

import java.util.List;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public class SenderFactory {

    private List<AbsSenderConfig> configs;

    public void register(SenderConfig senderConfig) {
        configs = senderConfig.getConfigs();
    }

    public Sender getSender() {
        return null;
    }
}
