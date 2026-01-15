package com.practice.designPattern.structural.proxyPattern;

public class ResponseDTO {
    private final String result;

    public ResponseDTO(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "ResponseDTO{result='" + result + "'}";
    }
}
