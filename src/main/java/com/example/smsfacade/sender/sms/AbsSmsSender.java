package com.example.smsfacade.sender.sms;

import okhttp3.*;

import java.io.IOException;

/**
 * @author 孙继峰
 * @since 2020/5/14
 */
public abstract class AbsSmsSender implements SmsSender {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    protected OkHttpClient client = new OkHttpClient();

    public Response getRequest(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }

    public Response postRequest(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }
}
