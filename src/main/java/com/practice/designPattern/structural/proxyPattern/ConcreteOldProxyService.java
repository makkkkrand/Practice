package com.practice.designPattern.structural.proxyPattern;

public class ConcreteOldProxyService implements ProxyService {
    @Override
    public ResponseDTO handle(RequestDTO request) {
        String result = "Processed: " + request.getPayload();
        return new ResponseDTO(result);
    }
}