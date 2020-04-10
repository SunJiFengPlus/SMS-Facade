package com.example.smsfacade.sender;

import okhttp3.OkHttpClient;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 孙继峰
 * @since 2020/3/31
 */
public abstract class AbsSender implements Sender {
    protected Sender sender;
    @Autowired
    protected OkHttpClient httpClient;

    @Override
    public void setNext(Sender sender) {
        this.sender = sender;
    }

    @Override
    public Sender getNext() {
        return sender;
    }
}