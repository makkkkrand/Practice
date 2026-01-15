package com.practice.designPattern.structural.proxyPattern;

public class ProxyPatternExample {
    public static void main(String[] args) {
        ProxyService real = new ConcreteOldProxyService();
        ProxyService proxy = new ConcreteProxyService(real);

        RequestDTO req1 = new RequestDTO("hello");
        ResponseDTO res1 = proxy.handle(req1);
        System.out.println(res1);

        RequestDTO req2 = new RequestDTO("hello");
        ResponseDTO res2 = proxy.handle(req2);
        System.out.println(res2);

        RequestDTO req3 = new RequestDTO("world");
        System.out.println(proxy.handle(req3));
    }
}
