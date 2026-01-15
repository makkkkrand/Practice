package com.practice.designPattern.structural.proxyPattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcreteProxyService implements ProxyService {
    private final Map<String, ResponseDTO> cache = new ConcurrentHashMap<>();
    private final ProxyService oldProxyService;

    public ConcreteProxyService(ProxyService oldProxyService) {
        this.oldProxyService = oldProxyService;
    }

    @Override
    public ResponseDTO handle(RequestDTO request) {
        String key = request.getPayload();
        System.out.println("Proxy: checking cache for key=" + key);
        if (cache.containsKey(key)) {
            System.out.println("Proxy: cache hit");
            return cache.get(key);
        }
        System.out.println("Proxy: cache miss, delegating to real service");
        ResponseDTO response = oldProxyService.handle(request);
        cache.put(key, response);
        return response;
    }
}
