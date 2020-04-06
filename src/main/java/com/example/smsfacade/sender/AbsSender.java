package com.example.smsfacade.sender;

/**
 * @author 孙继峰
 * @since 2020/3/31
 */
public abstract class AbsSender implements Sender {
    private Sender sender;

    @Override
    public void setNext(Sender sender) {
        this.sender = sender;
    }

    @Override
    public Sender getNext() {
        return sender;
    }
}