package com.practice.designPattern.structural.proxyPattern;

public class RequestDTO {
    private final String payload;

    public RequestDTO(String payload) {
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "RequestDTO{payload='" + payload + "'}";
    }
}
