package com.zjrcu.zjrcuoa.util;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class UtilTest {

@Test
    //String转Boolean,
    public  void strToBoolean(){
        String a ="";
        Boolean b = Boolean.valueOf(a);
        // 如果字符串参数不为 null 且在忽略大小写时等于 "true"，则返回的 Boolean 表示 true 值。其他均返回false
        System.out.println(b);
        System.out.println(b.equals(Boolean.FALSE)); 

    }

    @Test
    public void str(){
        String a ="";
        Boolean b =  StringUtils.equals("",a);
        System.out.println(b); 
    }
}

