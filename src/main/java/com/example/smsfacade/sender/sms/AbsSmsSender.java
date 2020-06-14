package com.example.smsfacade.sender.sms;

import lombok.extern.slf4j.Slf4j;
import okhttp3.*;

import java.io.IOException;

/**
 * @author 孙继峰
 * @since 2020/5/14
 */
@Slf4j
public abstract class AbsSmsSender implements SmsSender {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    protected OkHttpClient client = new OkHttpClient();

    public Response getRequest(String url) {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            log.info("request success: {}", url);
            return response;
        } catch (IOException e) {
            log.error("request fail: {}, reason:{}", url, e.getMessage());
        }
        return null;
    }

    public Response postRequest(String url, String json) {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            log.info("request success: {}, {}", url, json);
            return response;
        } catch (IOException e) {
            log.error("request fail: {}, reason:{}", url, e.getMessage());
        }
        return null;
    }
}
