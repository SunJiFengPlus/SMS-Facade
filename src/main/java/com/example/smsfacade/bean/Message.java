package com.example.smsfacade.bean;

import lombok.Data;

/**
 * @author 孙继峰
 * @since 2020/3/31
 */
@Data
public class Message {
    private Integer country;
    private String phone;
    private String templateId;
    private String[] args;
}