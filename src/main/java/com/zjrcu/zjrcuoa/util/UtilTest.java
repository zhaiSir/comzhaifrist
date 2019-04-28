package com.zjrcu.zjrcuoa.util;

import org.apache.commons.lang3.StringEscapeUtils;
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

    @Test
    public void stringEscapeUtilsTest() {

            System.out.println("转义HTML,注意汉字:"+StringEscapeUtils.escapeHtml4("<font>chen磊  xing</font>"));    //转义HTML,注意汉字
            System.out.println("反转义HTML:"+StringEscapeUtils.unescapeHtml4("&lt;font&gt;chen磊&nbsp; xing&lt;/font&gt;"));  //反转义HTML

            System.out.println("转成Unicode编码："+StringEscapeUtils.escapeJava("陈磊兴"));     //转义成Unicode编码

            System.out.println("转义XML："+StringEscapeUtils.escapeXml("<name>陈磊兴</name>"));   //转义xml
            System.out.println("反转义XML："+StringEscapeUtils.unescapeXml("<name>陈磊兴</name>"));    //转义xml

        }


}

