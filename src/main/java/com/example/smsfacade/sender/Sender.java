package com.example.smsfacade.sender;

import com.example.smsfacade.bean.Message;

import java.util.Collection;

/**
 * @author 孙继峰
 * @since 2020/3/31
 */
public interface Sender {
    boolean send(Message message);

    boolean supportMultiSend();
    boolean multiSend(Collection<Message> messages);

    void setNext(Sender sender);
    Sender getNext();
}
