package com.example.smsfacade.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 孙继峰
 * @since 2020/3/31
 */
@Data
@AllArgsConstructor
public class Message {
    private Integer nationCode;
    private String phone;
    private String templateId;
    private String[] args;

    public static Message of(Integer nationCode, String phone, String templateId, String[] args) {
        return new Message(nationCode, phone, templateId, args);
    }

    public Message format() {
        return this;
    }
}