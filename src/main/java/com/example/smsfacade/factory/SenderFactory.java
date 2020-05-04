package com.example.smsfacade.factory;

import com.example.smsfacade.config.AbsSenderConfig;
import com.example.smsfacade.config.Configuration;
import com.example.smsfacade.sender.Sender;
import lombok.Data;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author 孙继峰
 * @since 2020/4/26
 */
@Data
public class SenderFactory {

    private List<AbsSenderConfig> configs;
    private Iterator<AbsSenderConfig> iterator;

    public void register(Configuration configuration) {
        configs = configuration.getConfigList();
    }

    public Sender getSender() {
        if (Objects.isNull(iterator)) {
            iterator = configs.iterator();
        }
        AbsSenderConfig cur = null;
        if (iterator.hasNext()) {
            cur = iterator.next();
        }
        return Objects.requireNonNull(cur).createSender();
    }
}
