package com.betVictor.challenge.restService;

import com.google.gson.Gson;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;

import java.io.IOException;

public class BaseTest extends Assert {
    protected final Gson gson = new Gson();
    protected final String API_BASE_PATH = "http://localhost:8080/api/v1/";

    public static String httpResponse(String actualAnswer, HttpRequestBase httpRequestBase) throws IOException {
        return EntityUtils.toString(HttpClients.createDefault().execute(httpRequestBase).getEntity());
    }

    public static String getResponse(String actualAnswer) throws IOException {
        return httpResponse(actualAnswer, new HttpGet(actualAnswer));
    }

    public static String postResponse(String actualAnswer) throws IOException {
        return httpResponse(actualAnswer, new HttpPost(actualAnswer));
    }

    public static String deleteResponse(String actualAnswer) throws IOException {
        return httpResponse(actualAnswer, new HttpDelete(actualAnswer));
    }
}
