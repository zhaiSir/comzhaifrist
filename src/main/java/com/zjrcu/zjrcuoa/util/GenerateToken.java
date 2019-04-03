package com.zjrcu.zjrcuoa.util;

import java.util.UUID;

public class GenerateToken {
    public static void main(String[] args) {
        GenerateToken gt = new GenerateToken();
        gt.generateToken();
    }


    public void generateToken() {
        String token = UUID.randomUUID().toString().replaceAll("-", "");
        String token2 = UUID.randomUUID().toString();
        System.out.println(token);
        System.out.println(token2);;
    }
}