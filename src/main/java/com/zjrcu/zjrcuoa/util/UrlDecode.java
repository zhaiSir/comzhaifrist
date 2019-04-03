package com.zjrcu.zjrcuoa.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlDecode {
    public static void main(String[] args) {
        String a = "%25e4%25bd%25a0%25e5%25a5%25bd++++";
        try {
            System.out.println(URLDecoder.decode(URLDecoder.decode(a),"utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
