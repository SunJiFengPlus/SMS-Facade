package com.example.smsfacade.factory;

import com.example.smsfacade.config.SenderConfig;
import com.example.smsfacade.config.Configuration;
import com.example.smsfacade.sender.sms.SmsSender;
import lombok.Data;

import java.util.Iterator;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public class SenderFactory {

    private Iterator<SenderConfig> configs;

    public void register(Configuration configuration) {
        configs = configuration.getConfigList().iterator();
    }

    public SmsSender getSender() {
        if (configs.hasNext()) {
            return configs.next().creatSender();
        }
        throw new RuntimeException("短信调用链已到达末尾");
    }
}
