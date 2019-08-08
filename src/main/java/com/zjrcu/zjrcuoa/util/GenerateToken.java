package com.zjrcu.zjrcuoa.util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.UUID;


public class GenerateToken {
    public static void main(String[] args) {
        GenerateToken gt = new GenerateToken();
        gt.generateToken();
    }

    //这是slf4j的接口，由于我们引入了logback-classic依赖，所以底层实现是logback
    private static final Logger log = LoggerFactory.getLogger(GenerateToken.class);

    public void generateToken() {
        String token = UUID.randomUUID().toString().replaceAll("-", "");
        String token2 = UUID.randomUUID().toString();
        System.out.println(token);
        System.out.println(token2);
        log.info("hello world");
    }
}